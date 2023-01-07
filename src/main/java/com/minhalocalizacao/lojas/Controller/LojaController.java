package com.minhalocalizacao.lojas.Controller;

import com.minhalocalizacao.lojas.model.entity.Loja;
import com.minhalocalizacao.lojas.model.dto.LojaRequestDTO;
import com.minhalocalizacao.lojas.service.LojaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lojas")
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> findAll(){
        return lojaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Loja> save(@RequestBody  @Valid  LojaRequestDTO lojaRequestDTO){

        Loja response = lojaService.save(lojaRequestDTO);

        return ResponseEntity.ok(response);
    }

}
