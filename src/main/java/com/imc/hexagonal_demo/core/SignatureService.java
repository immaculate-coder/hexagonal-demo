package com.imc.hexagonal_demo.core;

public interface SignatureService {
    String generateWithPrefix(SignatureRequest request);
}
