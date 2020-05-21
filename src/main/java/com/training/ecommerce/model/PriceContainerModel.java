package com.training.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class PriceContainerModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @OneToMany
    private List<PriceModel> price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PriceModel> getPrice() {
        return price;
    }

    public void setPrice(List<PriceModel> price) {
        this.price = price;
    }
}
