package com.minhalocalizacao.lojas.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LojaRequestDTO {

    @NotNull(message = "Campo name nulo.")
    @NotEmpty(message = "Campo name vazio.")
    private String name;
    private AddressDTO addressDTO;
}
