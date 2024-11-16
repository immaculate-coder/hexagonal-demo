package com.imc.hexagonal_demo.infra.jpa.repos;

import com.imc.hexagonal_demo.infra.jpa.entities.SignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSignatureRepository extends JpaRepository<SignatureEntity, String> {
}
