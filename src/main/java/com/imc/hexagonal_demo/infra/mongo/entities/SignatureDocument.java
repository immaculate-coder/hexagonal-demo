package com.imc.hexagonal_demo.infra.mongo.entities;

import jakarta.persistence.Id;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "signatures")
@Builder
public class SignatureDocument {
    @Id
    private String id;
    private String value;
}
