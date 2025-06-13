package br.com.nttconsult.provateste.domain.repository;

import br.com.nttconsult.provateste.domain.model.Cliente;

import java.util.List;

public interface ClienteUseCase {

    Cliente criarCliente(Cliente cliente) throws Exception;
    Cliente buscarCliente(String cpf);
    Cliente atualizarCliente(String cpf, Cliente cliente);
    void deletarCliente(String cpf) throws Exception;
    List<Cliente> listarClientes();
}
