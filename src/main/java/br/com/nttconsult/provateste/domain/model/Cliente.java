package br.com.nttconsult.provateste.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Cliente(
        String cpf,
        String nome,
        LocalDate dataNascimento,
        String telefone,
        Endereco endereco,
        LocalDateTime dataCriacao,
        LocalDateTime dataAtualizacao
) {

    public Cliente(String cpf, String nome, LocalDate dataNascimento,
                   String telefone, Endereco endereco) {
        this(cpf, nome, dataNascimento, telefone, endereco, LocalDateTime.now(), LocalDateTime.now());
    }

    public Cliente atualizarDados(String nome, LocalDate dataNascimento,
                                  String telefone, Endereco endereco) {
        return new Cliente(this.cpf, nome, dataNascimento, telefone, endereco, this.dataCriacao, LocalDateTime.now());
    }
}
