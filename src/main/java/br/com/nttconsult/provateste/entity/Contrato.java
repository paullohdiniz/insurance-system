package br.com.nttconsult.provateste.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
    private Cliente cliente;

    @Positive
    private BigDecimal valorInicial;

    private BigDecimal valorFinal;

    @NotNull
    private LocalDate dataInicial;

    @NotNull
    private LocalDate dataFinal;


}
