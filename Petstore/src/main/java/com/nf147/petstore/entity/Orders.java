package com.nf147.petstore.entity;

import java.util.Date;

public class Orders {
    private Integer orId;

    private Integer petId;

    private Integer orQuantity;

    private Date orShipdate;

    private String orStatuss;

    private byte[] orComplete;

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getOrQuantity() {
        return orQuantity;
    }

    public void setOrQuantity(Integer orQuantity) {
        this.orQuantity = orQuantity;
    }

    public Date getOrShipdate() {
        return orShipdate;
    }

    public void setOrShipdate(Date orShipdate) {
        this.orShipdate = orShipdate;
    }

    public String getOrStatuss() {
        return orStatuss;
    }

    public void setOrStatuss(String orStatuss) {
        this.orStatuss = orStatuss == null ? null : orStatuss.trim();
    }

    public byte[] getOrComplete() {
        return orComplete;
    }

    public void setOrComplete(byte[] orComplete) {
        this.orComplete = orComplete;
    }
}