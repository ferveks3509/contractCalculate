package com.сontractсalculation.service;

import com.сontractсalculation.model.Policyholder;
import com.сontractсalculation.repository.PolicyholderRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyholderServiceImpl implements PolicyholderService {

    private final PolicyholderRepository policyHolderRepository;

    public PolicyholderServiceImpl(PolicyholderRepository policyHolderRepository) {
        this.policyHolderRepository = policyHolderRepository;
    }

    @Override
    public List<Policyholder> findPolicyholderByName(String name, String surname, String lastname) {
        return policyHolderRepository.findPolicyholderByFio(name, surname, lastname);
    }

    @Override
    public Policyholder createOrUpdate(Policyholder policyholder) {
        return policyHolderRepository.save(policyholder);
    }

    @Override
    public Optional<Policyholder> findById(int id) {
        return policyHolderRepository.findById(id);
    }

    @Transactional
    @Override
    public Optional<Policyholder> update(int id, Policyholder policyholder) {
        Optional<Policyholder> existing = policyHolderRepository.findById(id);

        if (existing.isPresent()) {
            Policyholder existingPolicyholder = existing.get();

            existingPolicyholder.setName(policyholder.getName());
            existingPolicyholder.setSurname(policyholder.getSurname());
            existingPolicyholder.setLastname(policyholder.getLastname());
            existingPolicyholder.setBirthday(policyholder.getBirthday());
            existingPolicyholder.setSerial(policyholder.getSerial());
            existingPolicyholder.setNumber(policyholder.getNumber());

            return Optional.of(policyHolderRepository.save(existingPolicyholder));
        }
        return existing;
    }
}
