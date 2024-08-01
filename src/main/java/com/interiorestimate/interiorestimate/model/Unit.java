package com.interiorestimate.interiorestimate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="unit")
public class Unit
{

    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(name="unit_name")
    private String unitName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="room_id", nullable = false)
    private Room room;

    @Column(name="length")
    private float length;

    @Column(name="height")
    private float height;

    @Column(name="depth")
    private float depth;

    @Column(name="finish_id")
    private Integer finishId;


    @Column(name="material_id")
    private Integer materialId;

    @Column(name="quantity")
    private int quantity;

//    @OneToOne
//    @JoinColumn(name="unit_type_id",referencedColumnName = "id")
//    private UnitType unitType;

//    @Column(name="price_per_sft")
//    private double pricePerSft;

    @Column(name="created_time")
    private LocalDateTime createdTime;

    @Column(name="modified_time")
    private LocalDateTime modifiedTime;
}
