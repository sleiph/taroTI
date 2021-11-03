package br.fatec.taroTI;

import br.fatec.taroTI.entidades.Baralho;
import br.fatec.taroTI.entidades.Naipe;
import br.fatec.taroTI.entidades.Carta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class TaroTiController {
    @GetMapping("/")
    public String home(
            Model model
    ) {
        int n = new Random().nextInt(5);
        int c = ( (n == 0) ?
            new Random().nextInt(22)
        :
            (new Random().nextInt(14) + 1));

        String sentido = (new Random().nextInt(2)==1) ? "cima" : "baixo";

        model.addAttribute("naipe", n);
        model.addAttribute("carta", c);
        model.addAttribute("sentido", sentido);

        return "index";
    }

    @GetMapping("/leitura")
    public String leitura(
        @RequestParam(
            name="naipe",
            required=false,
            defaultValue="0"
        ) String naipe,
        @RequestParam(
            name="carta",
            required=false,
            defaultValue="1"
        ) String carta,
        @RequestParam(
                name="sentido",
                required=false,
                defaultValue="cima"
        ) String sentido,
        Model model
    ) {
        Baralho mybaralho = new Baralho();
        Naipe myNaipe;
        Carta myCarta;
        int iNaipe = Integer.parseInt(naipe),
            iCarta = Integer.parseInt(carta);

        try {
            myNaipe = mybaralho.naipes[iNaipe];
        } catch(ArrayIndexOutOfBoundsException e) {
            myNaipe = mybaralho.naipes[0];
        }
        try {
            myCarta = ( (iNaipe == 0) ?
                myNaipe.cartas[iCarta]
            :
                myNaipe.cartas[iCarta-1]);

        } catch(ArrayIndexOutOfBoundsException e) {
            myCarta = myNaipe.cartas[0];
        }

        model.addAttribute("nome", myCarta + " de " + myNaipe);
        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", myNaipe.caminho + String.format("%02d", myCarta.valor));
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
