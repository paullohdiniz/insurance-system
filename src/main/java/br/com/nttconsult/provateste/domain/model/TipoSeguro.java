package br.com.nttconsult.provateste.domain.model;

import java.math.BigDecimal;

public enum TipoSeguro {
    BRONZE(new BigDecimal("150.00"), "Cobertura básica"),
    PRATA(new BigDecimal("250.00"), "Cobertura intermediária"),
    OURO(new BigDecimal("350.00"), "Cobertura completa");

    private final BigDecimal valor;
    private final String descricao;

    TipoSeguro(BigDecimal valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public BigDecimal getValor() { return valor; }
    public String getDescricao() { return descricao; }
}
