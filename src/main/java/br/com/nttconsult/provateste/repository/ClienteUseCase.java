package br.com.nttconsult.provateste.repository;

import br.com.nttconsult.provateste.model.ClienteDTO;

import java.util.List;

public interface ClienteUseCase {

    ClienteDTO criarCliente(ClienteDTO clienteDTO) throws Exception;
    ClienteDTO buscarCliente(String cpf);
    ClienteDTO atualizarCliente(String cpf, ClienteDTO clienteDTO);
    void deletarCliente(String cpf) throws Exception;
    List<ClienteDTO> listarClientes();
}
