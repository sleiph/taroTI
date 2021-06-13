package br.fatec.taroTI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaroTiController {
    @GetMapping("/leitura")
    public String greeting(@RequestParam(
            name="carta",
            required=false,
            defaultValue="World"
    ) String carta, Model model) {
        model.addAttribute("carta", carta);
        return "leitura";
    }
}
