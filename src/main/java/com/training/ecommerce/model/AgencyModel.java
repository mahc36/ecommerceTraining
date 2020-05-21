package com.training.ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class AgencyModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String agencyName;

    @OneToOne
    private LinkModel link;

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

    public LinkModel getLink() {
        return link;
    }

    public void setLink(LinkModel link) {
        this.link = link;
    }
}
