package com.imc.hexagonal_demo.core;

import org.springframework.stereotype.Service;

@Service
public class PrefixSignatureFormatterImpl implements PrefixSignatureFormatter {
    @Override
    public String format(SignatureRequest request) {
        return request.prefix() + request.name() + request.familyName();
    }
}
