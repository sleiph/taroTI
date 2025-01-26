package br.fatec.taroTI;

import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.Naipe;
import br.fatec.taroTI.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.Random;

@Controller
public class TaroTiController {

    @Autowired
    NaipeRepo naipeRepositorio;

    @Autowired
    CartaRepo cartaRepositorio;

    public Carta getCartaByValorENaipe(Long valor, Naipe naipe) {
        return cartaRepositorio.findByValorAndNaipe(valor, naipe);
    }

    @GetMapping("/")
    public String home(Model model) {

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
        ) Long naipe,
        @RequestParam(
            name="carta",
            required=false,
            defaultValue="00"
        ) Long carta,
        @RequestParam(
            name="sentido",
            required=false,
            defaultValue="cima"
        ) String sentido,
        Model model
    ) {

        Optional<Naipe> myNaipeOp = naipeRepositorio.findById(naipe);

        if (myNaipeOp.isEmpty())
            return "leitura";

        Naipe myNaipe = myNaipeOp.get();
        Carta myCarta = getCartaByValorENaipe(carta, myNaipe);

        if (myCarta == null)
            return "leitura";

        model.addAttribute("nome", myCarta + " de " + myNaipe);
        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", myNaipe.getCaminho() + "/" + String.format("%02d", myCarta.valor));
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
