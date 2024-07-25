package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name="material")
public class Material {

    @Id
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="material_type_id", nullable = false)
    private MaterialType materialType;

    @ManyToOne
    @JoinColumn(name="brand_id", nullable = false)
    private Brand brand;

    @Column(name="cost")
    private double cost;


}
