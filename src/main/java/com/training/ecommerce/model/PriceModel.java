package com.training.ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class PriceModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private Integer price;

    @Column
    private Integer timeMinutes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(Integer timeMinutes) {
        this.timeMinutes = timeMinutes;
    }
}
