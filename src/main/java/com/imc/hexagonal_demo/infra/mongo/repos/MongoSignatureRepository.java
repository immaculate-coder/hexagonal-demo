package com.imc.hexagonal_demo.infra.mongo.repos;

import com.imc.hexagonal_demo.infra.mongo.entities.SignatureDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoSignatureRepository extends MongoRepository<SignatureDocument, String> {
}
