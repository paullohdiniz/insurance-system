package br.com.nttconsult.provateste.model;

import br.com.nttconsult.provateste.entity.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ClienteDTO(
        String cpf,
        String nome,
        LocalDate dataNascimento,
        String telefone,
        EnderecoDTO enderecoDTO,
        LocalDateTime dataCriacao,
        LocalDateTime dataAtualizacao
) {

    public ClienteDTO(String cpf, String nome, LocalDate dataNascimento,
                      String telefone, EnderecoDTO enderecoDTO) {
        this(cpf, nome, dataNascimento, telefone, enderecoDTO, LocalDateTime.now(), LocalDateTime.now());
    }

    public ClienteDTO getClienteDTO(String nome, LocalDate dataNascimento,
                                     String telefone, EnderecoDTO enderecoDTO) {
        return new ClienteDTO(this.cpf, nome, dataNascimento, telefone, enderecoDTO, this.dataCriacao, LocalDateTime.now());
    }
    public static ClienteDTO getClienteDTO(Cliente cliente) {
        EnderecoDTO enderecoDTO = new EnderecoDTO(cliente.getRua(), cliente.getNumero());
        ClienteDTO clienteDTO = new ClienteDTO(cliente.getCpf(), cliente.getNome(),  cliente.getDataNascimento(), cliente.getTelefone(),
                enderecoDTO);
        return clienteDTO;
    }

}
