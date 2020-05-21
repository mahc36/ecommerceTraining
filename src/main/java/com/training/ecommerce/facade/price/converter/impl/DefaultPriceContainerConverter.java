package com.training.ecommerce.facade.price.converter.impl;

import com.training.ecommerce.data.PriceContainerData;
import com.training.ecommerce.data.PriceData;
import com.training.ecommerce.facade.Converter;
import com.training.ecommerce.facade.price.converter.PriceContainerConverter;
import com.training.ecommerce.model.PriceContainerModel;
import com.training.ecommerce.model.PriceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultPriceContainerConverter implements PriceContainerConverter {

    @Autowired
    private Converter<PriceData, PriceModel> priceConverter;

    @Override
    public PriceContainerData convert2Data(PriceContainerModel model) {
        Assert.notNull(model, "model cannot be empty");

        PriceContainerData data = new PriceContainerData();
        data.setPrice( priceConverter.convertAll2Data(model.getPrice()) );

        return data;
    }

    @Override
    public PriceContainerModel convert2Model(PriceContainerData data) {
        Assert.notNull(data, "data cannot be empty");

        PriceContainerModel model = new PriceContainerModel();
        model.setPrice( priceConverter.convertAll2Model(data.getPrice()) );

        return model;
    }

    public Converter<PriceData, PriceModel> getPriceConverter() {
        return priceConverter;
    }

    public void setPriceConverter(Converter<PriceData, PriceModel> priceConverter) {
        this.priceConverter = priceConverter;
    }
}
