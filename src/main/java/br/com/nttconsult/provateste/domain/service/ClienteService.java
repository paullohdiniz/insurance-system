package br.com.nttconsult.provateste.domain.service;

import br.com.nttconsult.provateste.domain.model.Cliente;
import br.com.nttconsult.provateste.domain.entity.ClienteEntity;
import br.com.nttconsult.provateste.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public ClienteEntity salvarCliente(Cliente cliente) {
        ClienteEntity clienteEntity = mapClienteToClienteEntity(cliente);

        return clienteRepository.save(clienteEntity);
    }

    private ClienteEntity mapClienteToClienteEntity(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteEntity entity = new ClienteEntity();
        entity.setCpf(cliente.cpf());
        entity.setNome(cliente.nome());
        //entity.setEndereco(cliente.endereco());
        entity.setTelefone(cliente.telefone());
        return entity;
    }

    public Optional<Cliente> buscarClientePorCpf(String cpf) {
        Optional<ClienteEntity> entityOptional = clienteRepository.buscarPorCpf(cpf);
        return entityOptional.map(this::mapClienteEntityToCliente); // Mapeia para o DTO se encontrado
    }

    private Cliente mapClienteEntityToCliente(ClienteEntity clienteEntity) {
        if (clienteEntity == null) {
            return null;
        }
        return new Cliente(clienteEntity.getCpf(), clienteEntity.getNome(),
                                    clienteEntity.getDataNascimento(), clienteEntity.getTelefone(), clienteEntity.getEndereco());

    }

}