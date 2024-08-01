package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
}
