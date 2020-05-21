package com.training.ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class AddressModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String city;

    @Column
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
