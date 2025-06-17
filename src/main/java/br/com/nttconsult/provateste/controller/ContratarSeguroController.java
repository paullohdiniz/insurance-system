package br.com.nttconsult.provateste.controller;


import br.com.nttconsult.provateste.service.ContratoSeguroService;
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

    @PostMapping("/{cpf}")
    @ResponseStatus(HttpStatus.CREATED)
    public Emprestimo cadastraEmprestimo(@PathVariable String cpf, @Valid @RequestBody EmprestimoDTO emprestimoDTO) throws ClienteNaoEncontradoException, ValorLimiteExcedido {

        return this.emprestimoService.cadastraEmprestimo(cpf,emprestimoDTO);
    }
}
