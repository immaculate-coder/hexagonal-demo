package com.imc.hexagonal_demo.messaging;

import com.imc.hexagonal_demo.core.SignatureRequest;
import com.imc.hexagonal_demo.core.SignatureService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignatureListener {
    private SignatureService signatureService;

    @RabbitListener(queues = "signatureQueue")
    public void receiveMessage(SignatureMessagingRequest request) {
        signatureService.generateWithPrefix(SignatureRequest.builder()
                .name(request.name())
                .familyName(request.familyName())
                .prefix("Rabbit-")
                .build());
        System.out.println("Received message: " + request);
    }
}
