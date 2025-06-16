package br.com.nttconsult.provateste.repository;

import br.com.nttconsult.provateste.model.ClienteDTO;

public interface ClienteServicePort {

    ClienteDTO buscarClientePorCpf(String cpf);
    boolean clienteExiste(String cpf);
}
