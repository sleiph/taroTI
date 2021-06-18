package br.fatec.taroTI;

import br.fatec.taroTI.entidades.Baralho;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaroTiController {
    @GetMapping("/leitura")
    public String leitura(@RequestParam(
            name="carta",
            required=false,
            defaultValue="Tolo"
    ) String carta, Model model) {
        Baralho mybaralho = new Baralho();

        model.addAttribute("carta", mybaralho.getLeitura());
        return "leitura";
    }
}
