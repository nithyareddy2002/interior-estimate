package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;

@Entity
@Table(name="unit")
public class Unit
{

    @Getter
    @Id
    @Column(name="id")
    private int id;

    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(name="unit_name")
    private String unitName;

    @ManyToOne
    @JoinColumn(name="room_id", nullable = false)
    private Room room;

    @Column(name="length")
    private float length;

    @Column(name="height")
    private float height;

    @Column(name="depth")
    private float depth;

    @ManyToOne
    @JoinColumn(name="finish_id", nullable = false)
    private Material finish;

    @ManyToOne
    @JoinColumn(name="material_id", nullable = false)
    private Material material;

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

    public void setId(int id) {
        this.id = id;
    }

//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public Property getPropertyAddress() {
//        return property;
//    }
//
//    public void setPropertyAddress(Property property) {
//        this.property = property;
//    }
//
//    public RoomType getRoom() {
//        return roomType;
//    }
//
//    public void setRoom(RoomType roomType) {
//        this.roomType = roomType;
//    }
//
//    public UnitType getUnit() {
//        return unitType;
//    }
//
//    public void setUnit(UnitType unitType) {
//        this.unitType = unitType;
//    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

//    public double getArea() {
//        return area;
//    }
//
//    public void setArea(double area) {
//        this.area = area;
//    }

    public Material getFinish() {
        return finish;
    }

    public void setFinish(Material finish) {
        this.finish = finish;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


//    public Brand getBrand() {
//        return brand;
//    }
//
//    public void setBrand(Brand brand) {
//        this.brand = brand;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public double getTotal() {
//        return total;
//    }
//
//    public void setTotal(double total) {
//        this.total = total;
//    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

//    public UnitType getUnitType() {
//        return unitType;
//    }
//
//    public void setUnitType(UnitType unitType) {
//        this.unitType = unitType;
//    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category= category;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
