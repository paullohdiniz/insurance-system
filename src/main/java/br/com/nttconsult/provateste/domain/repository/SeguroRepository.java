package br.com.nttconsult.provateste.domain.repository;

import br.com.nttconsult.provateste.domain.model.Seguro;

import java.util.List;
import java.util.Optional;

public interface SeguroRepository   {

    Seguro salvar(Seguro seguro);
    Optional<Seguro> buscarPorId(String id);
    List<Seguro> buscarPorCpfCliente(String cpfCliente);
    List<Seguro> buscarTodos();
}
