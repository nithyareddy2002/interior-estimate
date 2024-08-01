package com.interiorestimate.interiorestimate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="room")
public class Room {

    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="property_id", nullable = false)
    private Property property;

    @Getter

    @Column(name="room_type_id")
    private Integer roomTypeId;

    @Getter
    @OneToMany(mappedBy = "room")
    private List<Unit> units;
}
