package br.com.nttconsult.provateste.controller;

import br.com.nttconsult.provateste.entity.Cliente;
import br.com.nttconsult.provateste.model.ClienteDTO;
import br.com.nttconsult.provateste.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {


    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@Valid @RequestBody Cliente cliente) throws Exception {
        return this.clienteService.save(cliente);
    }

    @GetMapping()
    public List<ClienteDTO> getAllClientes() {
        List<ClienteDTO> retorno = this.clienteService.getAllClientes();
        return retorno;
    }

    @GetMapping("/{cpf}")
    public ClienteDTO getClienteByCpf(@PathVariable String cpf) throws Exception {
        Cliente clienteRecuperado = this.clienteService.getClienteByCpf(cpf);
        return ClienteDTO.getClienteDTO(clienteRecuperado);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<String> delete(@PathVariable String cpf) throws Exception {
        clienteService.deleteClienteByCpf(cpf);
        return ResponseEntity.ok("Cliente excluido.");
    }

}
