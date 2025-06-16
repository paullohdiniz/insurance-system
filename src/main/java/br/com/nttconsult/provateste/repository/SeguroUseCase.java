package br.com.nttconsult.provateste.repository;

import br.com.nttconsult.provateste.model.Seguro;
import br.com.nttconsult.provateste.model.TipoSeguro;

import java.util.List;

public interface SeguroUseCase{
    Seguro simularSeguro(String cpfCliente, TipoSeguro tipo);
    Seguro contratarSeguro(String cpfCliente, TipoSeguro tipo);
    List<Seguro> listarSegurosPorCliente(String cpfCliente);
    List<Seguro> listarTodosSeguros();

}
