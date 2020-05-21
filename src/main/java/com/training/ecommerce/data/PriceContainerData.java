package com.training.ecommerce.data;

import java.util.List;

public class PriceContainerData {

    private int id;
    private List<PriceData> price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PriceData> getPrice() {
        return price;
    }

    public void setPrice(List<PriceData> price) {
        this.price = price;
    }
}
