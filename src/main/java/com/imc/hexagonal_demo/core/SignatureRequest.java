package com.imc.hexagonal_demo.core;

import lombok.Builder;

@Builder
public record SignatureRequest(String prefix, String name, String familyName) {
}
