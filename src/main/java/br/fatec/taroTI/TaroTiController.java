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
        Baralho mybaralho = new Baralho();

        int n = new Random().nextInt(mybaralho.naipes.length);
        int c = new Random().nextInt(mybaralho.naipes[n].cartas.length);
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
        Baralho mybaralho = new Baralho();
        Naipe n;
        Carta c;

        try {
            n = mybaralho.naipes[Integer.parseInt(naipe)];
        } catch(ArrayIndexOutOfBoundsException e) {
            n = mybaralho.naipes[0];
        }
        try {
            c = n.cartas[Integer.parseInt(carta)];
        } catch(ArrayIndexOutOfBoundsException e) {
            c = n.cartas[0];
        }

        model.addAttribute("nome", c + " de " + n);
        model.addAttribute("carta", c);
        model.addAttribute("caminho", n.caminho + String.format("%02d", c.valor));
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
