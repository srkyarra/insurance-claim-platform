package com.insurance.claim;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ClaimService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void processClaim(ClaimRequest request) {
        kafkaTemplate.send("claims-topic", request.policyNumber + "|" + request.claimType);
    }
}
