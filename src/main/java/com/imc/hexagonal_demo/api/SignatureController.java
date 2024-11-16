package com.imc.hexagonal_demo.api;

import com.imc.hexagonal_demo.core.SignatureRequest;
import com.imc.hexagonal_demo.core.SignatureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signatures")
@AllArgsConstructor
public class SignatureController {
    private SignatureService signatureService;

    @PostMapping("/immaculate")
    ResponseEntity<String> generateImmaculateSignature(SignatureApiRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                signatureService.generateWithPrefix(from(request, "Immaculate-"))
        );
    }

    @PostMapping("/bad")
    ResponseEntity<String> generateBadSignature(SignatureApiRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                signatureService.generateWithPrefix(from(request, "Bad-"))
        );
    }

    private static SignatureRequest from(SignatureApiRequest request, String prefix) {
        return SignatureRequest.builder()
                .name(request.name())
                .familyName(request.familyName())
                .prefix(prefix)
                .build();
    }
}
