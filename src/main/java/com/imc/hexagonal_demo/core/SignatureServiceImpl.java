package com.imc.hexagonal_demo.core;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignatureServiceImpl implements SignatureService {
    private PrefixSignatureFormatter formatter;
    private SignaturePersistenceService persistenceService;

    @Override
    public String generateWithPrefix(SignatureRequest request) {
        String formattedSignature = formatter.format(request);
        persistenceService.persist(formattedSignature);
        return formattedSignature;
    }
}
