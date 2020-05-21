package com.training.ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class NumberModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String number;

    @Column
    private String prefix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
