package com.minhalocalizacao.lojas.mapper;

import com.minhalocalizacao.lojas.model.entity.Address;
import com.minhalocalizacao.lojas.model.dto.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address fromDTO(AddressDTO addressDTO){
        return Address.builder()
                .city(addressDTO.getCity())
                .number(addressDTO.getNumber())
                .street(addressDTO.getStreet()).build();
    }
}
