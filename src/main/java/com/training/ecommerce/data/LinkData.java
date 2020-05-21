package com.training.ecommerce.data;

public class LinkData {

    private int id;
    private String linkResource;
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
