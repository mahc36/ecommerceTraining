package com.training.ecommerce.data;

import java.util.List;

public class StaffData {

    private int id;
    private String name;
    private PriceContainerData priceContainer;
    private AddressData address;
    private List<LinkData> resources;
    private  List<NumberData> numbers;
    private AgencyData agency;
    private String nationality;
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

    public PriceContainerData getPriceContainer() {
        return priceContainer;
    }

    public void setPriceContainer(PriceContainerData priceContainer) {
        this.priceContainer = priceContainer;
    }

    public AddressData getAddress() {
        return address;
    }

    public void setAddress(AddressData address) {
        this.address = address;
    }

    public List<LinkData> getResources() {
        return resources;
    }

    public void setResources(List<LinkData> resources) {
        this.resources = resources;
    }

    public List<NumberData> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberData> numbers) {
        this.numbers = numbers;
    }

    public AgencyData getAgency() {
        return agency;
    }

    public void setAgency(AgencyData agency) {
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
