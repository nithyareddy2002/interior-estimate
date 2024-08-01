package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
    List<Unit> findAllByRoomId(int roomId);
}
