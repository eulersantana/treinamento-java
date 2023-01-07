package com.minhalocalizacao.lojas.mapper;

import com.minhalocalizacao.lojas.model.entity.Loja;
import com.minhalocalizacao.lojas.model.dto.LojaRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LojaMapper {

    @Autowired
    private AddressMapper addressMapper;

    public Loja fromDto(LojaRequestDTO requestDTO){
        return Loja.builder()
                .name(requestDTO.getName())
                .address(addressMapper.fromDTO(requestDTO.getAddressDTO()))
                .build();
    }

}
