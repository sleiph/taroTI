package br.fatec.taroTI;

import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.NaipeType;
import br.fatec.taroTI.modelos.ValorType;
import br.fatec.taroTI.repositorios.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class TaroTiController {

    Logger LOGGER = LoggerFactory.getLogger(TaroTiController.class);

    @Autowired
    CartaRepo cartaRepositorio;

    public Carta getCartaByValor(Integer valor, NaipeType naipe) {
        return cartaRepositorio.findByValorAndNaipe(valor, naipe);
    }

    @GetMapping("/")
    public String home(Model model) {

        int n = new Random().nextInt(5);

        int menor = (new Random().nextInt(14) + 1);
        int maior = new Random().nextInt(22);

        String sentido = (new Random().nextInt(2)==1) ? "cima" : "baixo";

        model.addAttribute("naipe", n);
        model.addAttribute("menor", menor);
        model.addAttribute("maior", maior);
        model.addAttribute("sentido", sentido);

        return "index";
    }

    @GetMapping("/leitura")
    public String leitura(
        @RequestParam(
            name="naipe",
            required=false,
            defaultValue="00"
        ) Integer naipe,
        @RequestParam(
            name="carta",
            required=false,
            defaultValue="00"
        ) Integer carta,
        @RequestParam(
            name="sentido",
            required=false,
            defaultValue="cima"
        ) String sentido,
        Model model
    ) {

        NaipeType naipeType = NaipeType.getNaipePorValor(naipe);
        ValorType valor = ValorType.getByNaipeAndValor(naipeType, carta);

        Carta myCarta = getCartaByValor(carta, naipeType);

        if (myCarta == null) {
            LOGGER.error("Carta não encontrada: valor={}:{}; naipe={}:{}", carta, valor, naipe, naipeType);
            return "leitura";
        }

        model.addAttribute("nome", myCarta.toString());
        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", valor.getValor()));
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
