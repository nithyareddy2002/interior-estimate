package com.interiorestimate.interiorestimate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="addressline1")
    private String addressLine1;

    @Column(name="addressline2")
    private String addressLine2;

    @Column(name="city")
    private String city;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    @Column(name="postal_code")
    private int postalCode;

    @Column(name = "property_type_id")
    private Integer propertyTypeId;

    @Column(name="status")
    private String status;

    @OneToMany(mappedBy = "property")
    private List<Room> rooms;

}
