package com.insurance.claim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {
    @Autowired
    private ClaimService claimService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitClaim(@RequestBody ClaimRequest request) {
        claimService.processClaim(request);
        return ResponseEntity.ok("Claim submitted successfully");
    }
}
