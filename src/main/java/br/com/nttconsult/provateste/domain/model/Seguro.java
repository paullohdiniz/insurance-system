package br.com.nttconsult.provateste.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public record Seguro(
        String id,
        String cpfCliente,
        TipoSeguro tipo,
        BigDecimal valor,
        StatusSeguro status,
        LocalDateTime dataContratacao
) {
    public Seguro(String cpfCliente, TipoSeguro tipo) {
        this(UUID.randomUUID().toString(),
                cpfCliente,
                tipo,
                tipo.getValor(),
                StatusSeguro.PENDENTE,
                LocalDateTime.now());
    }

    public Seguro contratar() {
        return new Seguro(id, cpfCliente, tipo, valor, StatusSeguro.ATIVO, LocalDateTime.now());
    }

    public Seguro cancelar() {
        return new Seguro(id, cpfCliente, tipo, valor, StatusSeguro.CANCELADO, dataContratacao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seguro seguro)) return false;
        return Objects.equals(id, seguro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
