package br.com.nttconsult.provateste.domain.repository;

import br.com.nttconsult.provateste.domain.model.Cliente;

public interface ClienteServicePort {

    Cliente buscarClientePorCpf(String cpf);
    boolean clienteExiste(String cpf);
}
