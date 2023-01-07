package com.minhalocalizacao.lojas.model.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class AddressDTO {
    private String street;

    private String city;

    @Min(value = 1, message = "Valor minumo 1.")
    private Long number;
}
