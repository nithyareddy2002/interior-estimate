package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name="room")
public class Room {

    @Getter
    @Id
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="property_id", nullable = false)
    private Property property;

//    @Column(name="room_type_id")
//    private int roomTypeId;

    @Getter
    @OneToOne()
    @JoinColumn(name="room_type_id", referencedColumnName = "id")
    private RoomType roomType;

    @Getter
    @OneToMany(mappedBy = "room")
    private List<Unit> units;

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getRoomTypeId() {
//        return roomTypeId;
//    }
//
//    public void setRoomTypeId(int roomTypeId) {
//        this.roomTypeId = roomTypeId;
//    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
