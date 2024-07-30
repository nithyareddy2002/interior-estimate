package com.interiorestimate.interiorestimate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="client_id")
    private Client client;

    @Column(name="postal_code")
    private int postalCode;

    @ManyToOne
    @JoinColumn(name = "property_type_id", nullable = false)
    private PropertyType propertyType;

    @Column(name="status")
    private String status;

    @Getter
    @OneToMany(mappedBy = "property")
    private List<Room> rooms;

}
