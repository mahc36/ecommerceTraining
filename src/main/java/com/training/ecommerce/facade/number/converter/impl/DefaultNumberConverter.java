package com.training.ecommerce.facade.number.converter.impl;

import com.training.ecommerce.data.NumberData;
import com.training.ecommerce.facade.number.converter.NumberConverter;
import com.training.ecommerce.model.NumberModel;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Objects;

@Service
public class DefaultNumberConverter implements NumberConverter {

    @Override
    public NumberData convert2Data(NumberModel model) {
        Assert.notNull(model, "model cannot be empty");

        NumberData data = new NumberData();
        data.setId(model.getId());
        data.setNumber(model.getNumber());
        data.setPrefix(model.getPrefix());
        if(Objects.nonNull(model.getPrefix()) && Objects.nonNull(model.getNumber())){
            data.setFullNumber(model.getPrefix()+" "+model.getNumber());
        }
        return data;
    }

    @Override
    public NumberModel convert2Model(NumberData data) {
        Assert.notNull(data, "data cannot be empty");

        NumberModel model = new NumberModel();
        model.setId(data.getId());
        model.setNumber(data.getNumber());
        model.setPrefix(data.getPrefix());

        return model;
    }
}
