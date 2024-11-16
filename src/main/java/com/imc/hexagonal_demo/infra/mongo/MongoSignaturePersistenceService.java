package com.imc.hexagonal_demo.infra.mongo;

import com.imc.hexagonal_demo.core.SignaturePersistenceService;
import com.imc.hexagonal_demo.infra.mongo.entities.SignatureDocument;
import com.imc.hexagonal_demo.infra.mongo.repos.MongoSignatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Primary
public class MongoSignaturePersistenceService implements SignaturePersistenceService {
    private MongoSignatureRepository repository;

    @Override
    public void persist(String signature) {
        repository.save(SignatureDocument.builder()
                .value(signature)
                .build());
    }
}
