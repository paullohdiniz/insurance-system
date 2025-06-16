package br.com.nttconsult.provateste.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ClienteDTO(
        String cpf,
        String nome,
        LocalDate dataNascimento,
        String telefone,
        Endereco endereco,
        LocalDateTime dataCriacao,
        LocalDateTime dataAtualizacao
) {

    public ClienteDTO(String cpf, String nome, LocalDate dataNascimento,
                      String telefone, Endereco endereco) {
        this(cpf, nome, dataNascimento, telefone, endereco, LocalDateTime.now(), LocalDateTime.now());
    }

    public ClienteDTO atualizarDados(String nome, LocalDate dataNascimento,
                                     String telefone, Endereco endereco) {
        return new ClienteDTO(this.cpf, nome, dataNascimento, telefone, endereco, this.dataCriacao, LocalDateTime.now());
    }
}
