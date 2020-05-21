package com.training.ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class LinkModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String linkResource;

    @Column
    private Double reliabilityPercentage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkResource() {
        return linkResource;
    }

    public void setLinkResource(String linkResource) {
        this.linkResource = linkResource;
    }

    public Double getReliabilityPercentage() {
        return reliabilityPercentage;
    }

    public void setReliabilityPercentage(Double reliabilityPercentage) {
        this.reliabilityPercentage = reliabilityPercentage;
    }
}
