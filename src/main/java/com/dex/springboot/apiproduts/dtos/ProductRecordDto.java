package com.dex.springboot.apiproduts.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


//anotações de validação como o @NotBlank
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal preco) {
}
