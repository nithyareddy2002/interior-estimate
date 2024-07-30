package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="last_name")
    private String lastName;

    @Column(name="first_name")
    private String firstName;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private int phoneNumber;

    @Column(name="address")
    private String address;

    @OneToMany(targetEntity = Property.class, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Property> properties;

    public void addToProperty(Property property) {
        this.getProperties().add(property);
        property.setClient(this);
    }

    public void removeFromProperties(Property property) {
        this.getProperties().remove(property);
        property.setClient(this);
    }
}
