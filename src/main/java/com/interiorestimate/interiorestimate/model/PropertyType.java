package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name="property_type")
public class PropertyType {


    @Getter
    @Id
    @Column(name="id")
    private int id;

    @Getter
    @Column(name="name")
    private String name;

    @Column(name="is_obsolete")
    private boolean isObsolete;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isObsolete() {
        return isObsolete;
    }

    public void setObsolete(boolean obsolete) {
        isObsolete = obsolete;
    }
}
