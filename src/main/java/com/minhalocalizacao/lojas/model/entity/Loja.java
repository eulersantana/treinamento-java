package com.minhalocalizacao.lojas.model.entity;

import com.minhalocalizacao.lojas.model.entity.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity(name = "loja")
@NoArgsConstructor
@AllArgsConstructor
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;


    @OneToMany(mappedBy = "loja")
    private List<Client> client;

}
