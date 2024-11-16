package com.imc.hexagonal_demo.infra.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class SignatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String value;
}