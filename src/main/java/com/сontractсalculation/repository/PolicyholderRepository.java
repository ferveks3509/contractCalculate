package com.сontractсalculation.repository;

import com.сontractсalculation.model.Policyholder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PolicyholderRepository extends CrudRepository<Policyholder, Integer> {
    @Query("select p from Policyholder p where p.name = ?1 and p.surname = ?2 and p.lastname = ?3")
    List<Policyholder> findPolicyholderByFio(String name, String surname, String lastname);
}
