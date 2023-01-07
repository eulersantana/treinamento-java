package com.minhalocalizacao.lojas.repository;

import com.minhalocalizacao.lojas.model.entity.Loja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LojaRepository extends CrudRepository<Loja, Long> {
    List<Loja> findAll();
}
