package com.training.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class StaffModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @OneToOne
    private PriceContainerModel priceContainer;

    @OneToOne
    private AddressModel address;

    @OneToMany
    private List<LinkModel> resources;

    @OneToMany
    private  List<NumberModel> numbers;

    @OneToOne
    private AgencyModel agency;

    @Column
    private String nationality;

    @Column
    private boolean tested;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriceContainerModel getPriceContainer() {
        return priceContainer;
    }

    public void setPriceContainer(PriceContainerModel priceContainer) {
        this.priceContainer = priceContainer;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public List<LinkModel> getResources() {
        return resources;
    }

    public void setResources(List<LinkModel> resources) {
        this.resources = resources;
    }

    public List<NumberModel> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberModel> numbers) {
        this.numbers = numbers;
    }

    public AgencyModel getAgency() {
        return agency;
    }

    public void setAgency(AgencyModel agency) {
        this.agency = agency;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isTested() {
        return tested;
    }

    public void setTested(boolean tested) {
        this.tested = tested;
    }
}
