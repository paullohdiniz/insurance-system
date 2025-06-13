package br.com.nttconsult.provateste.domain.repository;

import br.com.nttconsult.provateste.domain.model.Seguro;
import br.com.nttconsult.provateste.domain.model.TipoSeguro;

import java.util.List;

public interface SeguroUseCase{
    Seguro simularSeguro(String cpfCliente, TipoSeguro tipo);
    Seguro contratarSeguro(String cpfCliente, TipoSeguro tipo);
    List<Seguro> listarSegurosPorCliente(String cpfCliente);
    List<Seguro> listarTodosSeguros();

}
