package com.nf147.petstore.entity;

public class Apiresponse {
    private Integer apCode;

    private String apType;

    private String apMassge;

    public Integer getApCode() {
        return apCode;
    }

    public void setApCode(Integer apCode) {
        this.apCode = apCode;
    }

    public String getApType() {
        return apType;
    }

    public void setApType(String apType) {
        this.apType = apType == null ? null : apType.trim();
    }

    public String getApMassge() {
        return apMassge;
    }

    public void setApMassge(String apMassge) {
        this.apMassge = apMassge == null ? null : apMassge.trim();
    }
}