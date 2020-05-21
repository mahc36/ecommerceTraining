package com.training.ecommerce.data;

public class AgencyData {

    private int id;
    private String agencyName;
    private LinkData link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public LinkData getLink() {
        return link;
    }

    public void setLink(LinkData link) {
        this.link = link;
    }
}
