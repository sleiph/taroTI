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
    public String home(Model model) {

        Leitura leitura = leituraService.getLeitura();

        model.addAttribute("naipe", leitura.getNaipe());
        model.addAttribute("valor", leitura.getValor());
        model.addAttribute("sentido", leitura.getSentido());

        return "index";
    }

    @GetMapping("/leitura")
    public String leitura(
            HttpServletRequest request,
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

        Leitura leitura = new Leitura(naipe, carta, sentido);

        Carta myCarta = leituraService.getCarta(leitura, request);
        if (myCarta == null) {
            LOGGER.error("Carta não encontrada: valor={}; naipe={}", carta, naipe);
            return "leitura";
        }

        String caminho = myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", carta);

        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", caminho);
        model.addAttribute("sentido", sentido);

        return "leitura";
    }
}
