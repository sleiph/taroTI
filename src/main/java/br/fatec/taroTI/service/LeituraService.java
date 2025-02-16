package br.fatec.taroTI.service;

import br.fatec.taroTI.dto.ChaveCacheDTO;
import br.fatec.taroTI.dto.Leitura;
import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.NaipeType;
import br.fatec.taroTI.repositorios.CartaRepo;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import io.micrometer.common.util.StringUtils;
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

    public Leitura getLeitura(Integer naipe) {
        Random random = new Random();

        if (naipe == null)
            naipe = random.nextInt(4) + 1;

        int valor = getValor(random, naipe);
        String sentido = (random.nextBoolean()) ? "cima" : "baixo";

        return new Leitura(naipe, valor, sentido);
    }

    public Leitura getLeituraDireta(Integer naipe, Integer valor, String sentido) {
        return new Leitura(naipe, valor, sentido);
    }

    protected int getValor(Random random, int naipe) {
        return (naipe > 0) ?
                (random.nextInt(14) + 1) :
                (random.nextInt(22));
    }

    public Carta getCarta(Leitura leitura, HttpServletRequest request, boolean isMaior) {

        ChaveCacheDTO chaveCache = new ChaveCacheDTO(request.getSession().getId(), getDia(), isMaior);

        Carta cartaCache = memoizationLeitura.getIfPresent(chaveCache);

        if (cartaCache != null)
            return cartaCache;

        Carta carta = getCartaDoBanco(leitura);

        memoizationLeitura.put(chaveCache, carta);

        return carta;
    }

    public Carta getCartaDoBanco(Leitura leitura) {
        NaipeType naipeType = NaipeType.getNaipePorValor(leitura.getNaipe());
        Carta carta = getCartaByValor(leitura.getValor(), naipeType);
        carta.setSentido(leitura.getSentido());
        return carta;
    }

    protected LocalDateTime getDia() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
    }

}
