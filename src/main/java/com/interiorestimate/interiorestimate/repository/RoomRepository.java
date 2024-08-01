package com.interiorestimate.interiorestimate.repository;

import com.interiorestimate.interiorestimate.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findAllByPropertyId(int propertyId);
}
