package com.imc.hexagonal_demo.infra.jpa;

import com.imc.hexagonal_demo.core.SignaturePersistenceService;
import com.imc.hexagonal_demo.infra.jpa.entities.SignatureEntity;
import com.imc.hexagonal_demo.infra.jpa.repos.JpaSignatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaSignaturePersistenceService implements SignaturePersistenceService {
    private JpaSignatureRepository repository;

    @Override
    public void persist(String signature) {
        repository.save(SignatureEntity.builder()
                .value(signature)
                .build()
        );
    }
}
