package br.com.nttconsult.provateste.controller;


import br.com.nttconsult.provateste.service.ContratoSeguroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contratar-seguros")
public class ContratarSeguroController {

    private final ContratoSeguroService contratoSeguroService;

    @Autowired
    public ContratarSeguroController(ContratoSeguroService contratoSeguroService) {
        this.contratoSeguroService = contratoSeguroService;
    }


}
