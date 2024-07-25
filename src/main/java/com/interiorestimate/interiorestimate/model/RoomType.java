package com.interiorestimate.interiorestimate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name="room_type")
public class RoomType {

    @Id
    @Getter
    @Column(name="id")
    private int id;

    @Getter
    @Column(name="name")
    private String name;

    @Column(name="is_obsolete")
    private boolean isObsolete;

    public RoomType(){}

    public RoomType(int id,String name,boolean isObsolete){
        this.id=id;
        this.name=name;
        this.isObsolete=isObsolete;
    }

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
