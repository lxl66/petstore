package com.nf147.petstore.entity;

import java.math.BigDecimal;

public class Pet {
    private Integer petId;

    private Integer caId;

    private String petName;

    private BigDecimal petPrice;

    private String petStatus;

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    public BigDecimal getPetPrice() {
        return petPrice;
    }

    public void setPetPrice(BigDecimal petPrice) {
        this.petPrice = petPrice;
    }

    public String getPetStatus() {
        return petStatus;
    }

    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus == null ? null : petStatus.trim();
    }
}