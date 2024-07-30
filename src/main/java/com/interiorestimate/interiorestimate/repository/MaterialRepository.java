package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material,Integer> {
}
