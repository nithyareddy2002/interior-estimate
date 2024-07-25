package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> {


}
