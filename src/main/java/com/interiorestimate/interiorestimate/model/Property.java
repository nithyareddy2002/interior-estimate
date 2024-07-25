package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name="property")
public class Property {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="addressline1")
    private String addressLine1;

    @Column(name="addressline2")
    private String addressLine2;

    @Column(name="city")
    private String City;

    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    @Column(name="postal_code")
    private int postalCode;

    @Getter
    @ManyToOne
    @JoinColumn(name = "property_type_id", nullable = false)
    private PropertyType propertyType;

    @Column(name="status")
    private String status;

    @Getter
    @OneToMany(mappedBy = "property")
    private List<Room> rooms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
