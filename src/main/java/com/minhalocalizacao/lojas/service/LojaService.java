package com.minhalocalizacao.lojas.service;

import com.minhalocalizacao.lojas.mapper.LojaMapper;
import com.minhalocalizacao.lojas.model.entity.Loja;
import com.minhalocalizacao.lojas.model.dto.LojaRequestDTO;
import com.minhalocalizacao.lojas.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository repository;

    @Autowired
    private LojaMapper lojaMapper;


    public List<Loja> findAll(){
        return  repository.findAll();
    }

    public Loja save(LojaRequestDTO lojaRequestDTO){
        Loja loja = lojaMapper.fromDto(lojaRequestDTO);
        return  repository.save(loja);
    }
}
