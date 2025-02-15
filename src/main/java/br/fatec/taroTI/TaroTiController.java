package br.fatec.taroTI;

import br.fatec.taroTI.dto.Leitura;
import br.fatec.taroTI.modelos.Carta;

import br.fatec.taroTI.service.LeituraService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaroTiController {

    Logger LOGGER = LoggerFactory.getLogger(TaroTiController.class);

    @Autowired
    LeituraService leituraService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/leitura")
    public String leitura(
            HttpServletRequest request,
            @RequestParam(
                    name="naipe",
                    required=false
            ) Integer naipe,
            Model model
    ) {

        Leitura leitura = leituraService.getLeitura(naipe);

        Carta myCarta = leituraService.getCarta(leitura, request);
        if (myCarta == null) {
            LOGGER.error("Carta não encontrada: naipe={}", naipe);
            return "leitura";
        }

        String caminho = myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", myCarta.getValor());

        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", caminho);

        return "leitura";
    }

}
