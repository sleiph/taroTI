package br.fatec.taroTI.service;

import br.fatec.taroTI.dto.ChaveCacheDTO;
import br.fatec.taroTI.dto.Leitura;
import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.NaipeType;
import br.fatec.taroTI.repositorios.CartaRepo;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class LeituraService {

    @Autowired
    CartaRepo cartaRepositorio;

    private final Cache<ChaveCacheDTO, Carta> memoizationLeitura;

    public LeituraService() {
        this.memoizationLeitura = CacheBuilder.newBuilder()
                .expireAfterAccess(24, TimeUnit.HOURS)
                .build();
    }

    public Carta getCartaByValor(Integer valor, NaipeType naipe) {
        return cartaRepositorio.findByValorAndNaipe(valor, naipe);
    }

    public Leitura getLeitura() {
        Random random = new Random();

        int naipe = random.nextInt(5);
        int valor = getValor(random, naipe);
        String sentido = (random.nextBoolean()) ? "cima" : "baixo";

        return new Leitura(naipe, valor, sentido);
    }

    protected int getValor(Random random, int naipe) {
        return (naipe > 0) ?
                (random.nextInt(14) + 1) :
                (random.nextInt(22));
    }

    public Carta getCarta(Leitura leitura, HttpServletRequest request) {

        ChaveCacheDTO chaveCache = new ChaveCacheDTO(request.getSession().getId(), getDia());

        Carta cartaCache = memoizationLeitura.getIfPresent(chaveCache);

        if (cartaCache != null)
            return cartaCache;

        NaipeType naipeType = NaipeType.getNaipePorValor(leitura.getNaipe());
        Carta carta = getCartaByValor(leitura.getValor(), naipeType);

        memoizationLeitura.put(chaveCache, carta);

        return carta;
    }

    protected LocalDateTime getDia() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
    }

}
