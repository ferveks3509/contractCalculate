package com.сontractсalculation.service;

import com.сontractсalculation.model.Policyholder;

import java.util.List;
import java.util.Optional;

public interface PolicyholderService {
    List<Policyholder> findPolicyholderByName(String name, String surname, String lastname);
    Policyholder createOrUpdate(Policyholder policyholder);
    Optional<Policyholder> findById(int id);
    Optional<Policyholder> update(int id, Policyholder policyholder);
}
