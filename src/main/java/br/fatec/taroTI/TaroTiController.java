package br.fatec.taroTI;

import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.Naipe;
import br.fatec.taroTI.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class TaroTiController {

    @Autowired
    NaipeRepo naipeRepositorio;

    @Autowired
    CartaRepo cartaRepositorio;

    public Naipe getNaipeByIndice(String indice) {
        Naipe myNaipe = naipeRepositorio.findNaipeByIndice(indice);
        if (myNaipe==null)
            myNaipe = naipeRepositorio.findNaipeByIndice("0");
        return myNaipe;
    }

    public Carta getCartaByValorENaipe(String valor, Naipe naipe) {
        Carta myCarta = cartaRepositorio.findCartaByValorENaipe(valor, naipe.indice);
        if (myCarta==null)
            myCarta = cartaRepositorio.findCartaByValorENaipe("1", naipe.indice);
        return myCarta;
    }

    @GetMapping("/")
    public String home(
            Model model
    ) {
        int n = new Random().nextInt(5),
            menor, maior;

        menor = (new Random().nextInt(14) + 1);
        maior = new Random().nextInt(22);

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
        ) String naipe,
        @RequestParam(
            name="carta",
            required=false,
            defaultValue="00"
        ) String carta,
        @RequestParam(
                name="sentido",
                required=false,
                defaultValue="cima"
        ) String sentido,
        Model model
    ) {

        int iNaipe = Integer.parseInt(naipe),
            iCarta = Integer.parseInt(carta);

        Naipe myNaipe = getNaipeByIndice(String.valueOf(iNaipe));
        Carta myCarta = getCartaByValorENaipe( String.valueOf(iCarta), myNaipe );

        model.addAttribute("nome", myCarta + " de " + myNaipe);
        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", myNaipe.caminho + String.format("%02d", myCarta.valor));
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
