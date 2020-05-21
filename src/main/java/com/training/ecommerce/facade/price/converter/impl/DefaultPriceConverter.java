package com.training.ecommerce.facade.price.converter.impl;

import com.training.ecommerce.data.PriceData;
import com.training.ecommerce.facade.price.converter.PriceConverter;
import com.training.ecommerce.model.PriceModel;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultPriceConverter implements PriceConverter {

    @Override
    public PriceData convert2Data(PriceModel model) {
        Assert.notNull(model, "model cannot be empty");

        PriceData data = new PriceData();
        data.setId(model.getId());
        data.setPrice(model.getPrice());
        data.setTimeMinutes(model.getTimeMinutes());

        return data;
    }

    @Override
    public PriceModel convert2Model(PriceData data) {
        Assert.notNull(data, "data cannot be empty");

        PriceModel model = new PriceModel();
        model.setId(data.getId());
        model.setPrice(data.getPrice());
        model.setTimeMinutes(data.getTimeMinutes());

        return model;
    }
}
