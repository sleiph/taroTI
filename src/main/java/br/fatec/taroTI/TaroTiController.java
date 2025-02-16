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
            Model model
    ) {

        Leitura leitura = leituraService.getLeitura(null);

        Carta myCarta = leituraService.getCarta(leitura, request, false);
        if (myCarta == null) {
            LOGGER.error("Carta não encontrada.");
            return "leitura";
        }

        String caminho = myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", myCarta.getValor());

        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", caminho);

        return "leitura";
    }

    @GetMapping("/maior")
    public String maior(
            HttpServletRequest request,
            @RequestParam(
                    name="naipe",
                    required=false
            ) Integer naipe,
            Model model
    ) {

        Leitura leitura = leituraService.getLeitura(naipe);

        Carta myCarta = leituraService.getCarta(leitura, request, true);
        if (myCarta == null) {
            LOGGER.error("Carta não encontrada: naipe={}", naipe);
            return "leitura";
        }

        String caminho = myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", myCarta.getValor());

        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", caminho);

        return "leitura";
    }

    @GetMapping("/carta")
    public String carta(
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

        Leitura leitura = leituraService.getLeituraDireta(naipe, carta, sentido);

        Carta myCarta = leituraService.getCartaDoBanco(leitura);
        if (myCarta == null) {
            LOGGER.error("Carta não encontrada: naipe={}, carta={}, sentido={}", naipe, carta, sentido);
            return "leitura";
        }

        String caminho = myCarta.getNaipe().getCaminho() + "/" + String.format("%02d", myCarta.getValor());

        model.addAttribute("carta", myCarta);
        model.addAttribute("caminho", caminho);

        return "leitura";
    }

}
