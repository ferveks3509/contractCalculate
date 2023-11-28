package com.сontractсalculation.controller;

import com.сontractсalculation.model.Policyholder;
import com.сontractсalculation.service.PolicyholderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/policyholder")
public class PolicyholderController {

    private final PolicyholderService policyholderService;

    public PolicyholderController(PolicyholderService policyholderService) {
        this.policyholderService = policyholderService;
    }

    @PostMapping("/byFio")
    public ResponseEntity<List<Policyholder>> getPolicyholderByFio(@RequestBody Policyholder policyholder) {
        List<Policyholder> foundPolicyholders = policyholderService.findPolicyholderByName(policyholder.getName(),
                policyholder.getSurname(),
                policyholder.getLastname());

        if (foundPolicyholders.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(foundPolicyholders, HttpStatus.OK);
    }

    @PostMapping("/create")
    public Policyholder createPolicyholder(@Valid @RequestBody Policyholder policyholder) {
        return policyholderService.createOrUpdate(policyholder);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updatePolicyholder(@PathVariable int id,
                                                   @Valid @RequestBody Policyholder updatedPolicyholder) {
        Optional<Policyholder> existingPolicyholder = policyholderService.findById(id);

        if (existingPolicyholder.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        policyholderService.createOrUpdate(updatedPolicyholder);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
