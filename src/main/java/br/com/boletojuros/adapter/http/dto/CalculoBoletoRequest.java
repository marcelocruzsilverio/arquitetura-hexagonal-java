package br.com.boletojuros.adapter.http.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
public class CalculoBoletoRequest {

    @Nonnull
    private String codigo;

    @JsonProperty("data_pagamento")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Nonnull
    private LocalDate dataPagamento;
}