package br.com.nttconsult.provateste.service;

import br.com.nttconsult.provateste.entity.Cliente;
import br.com.nttconsult.provateste.model.ClienteDTO;
import br.com.nttconsult.provateste.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente) throws Exception {
        String cpf = cliente.getCpf();
        if(this.clienteRepository.existsByCpf(cpf)) {
            throw new Exception(cpf);
        }
        return this.clienteRepository.save(cliente);
    }

    public List<ClienteDTO> getAllClientes(){

        List<Cliente> clientes = this.clienteRepository.findAll();
        List<ClienteDTO> clientesDTO = new ArrayList<>();
        for(Cliente cliente : clientes) {
            ClienteDTO clienteDTO = new ClienteDTO(cliente.getCpf(), cliente.getNome(), cliente.getDataNascimento(), cliente.getTelefone(), null );
            clientesDTO.add(clienteDTO);
        }
        return clientesDTO;
    }

    public Cliente getClienteByCpf(String cpf) throws Exception {

        if(this.clienteRepository.existsByCpf(cpf)) {
            return this.clienteRepository.findByCpf(cpf);
        }
        throw new Exception(cpf);
    }

    @Transactional
    public void deleteClienteByCpf(String cpf) throws Exception {

        if(this.clienteRepository.existsByCpf(cpf)) {
            this.clienteRepository.deleteByCpf(cpf);
        }else{
            throw new Exception(cpf);
        }
    }

    public Cliente alteraCliente(String cpf, @Valid Cliente cliente) throws Exception {

        if(this.clienteRepository.existsByCpf(cpf)) {
            Cliente clienteASerAlterado = this.clienteRepository.findByCpf(cpf);
            cliente.setId(clienteASerAlterado.getId());
            cliente.setCpf(cpf);
            return this.clienteRepository.save(cliente);
        }
        throw new Exception(cpf);
    }

}