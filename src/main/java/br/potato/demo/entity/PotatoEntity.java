package br.potato.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "potato")

public class PotatoEntity {

    @Id
    private Long id;

    @Column(name="name")
    private String name;
}
