package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {
    List<Property> findAllByClientId(int clientId);
}
