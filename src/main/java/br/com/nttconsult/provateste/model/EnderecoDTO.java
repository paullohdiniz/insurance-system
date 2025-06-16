package br.com.nttconsult.provateste.model;

import java.util.Objects;

public record EnderecoDTO(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf,
        String cep
) {

    public EnderecoDTO(String logradouro, String numero) {
        this(null, logradouro, numero, null, null, null, null);
    }

    public static EnderecoDTO getEnderecoDTO(String logradouro, String numero) {
        return new EnderecoDTO(numero, numero);
    }

    // equals e hashCode com base nos campos desejados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnderecoDTO enderecoDTO)) return false;
        return Objects.equals(logradouro, enderecoDTO.logradouro) &&
                Objects.equals(numero, enderecoDTO.numero) &&
                Objects.equals(bairro, enderecoDTO.bairro) &&
                Objects.equals(cidade, enderecoDTO.cidade) &&
                Objects.equals(uf, enderecoDTO.uf) &&
                Objects.equals(cep, enderecoDTO.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, numero, bairro, cidade, uf, cep);
    }
}
