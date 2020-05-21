package com.training.ecommerce.facade.address.converter.impl;

import com.training.ecommerce.data.AddressData;
import com.training.ecommerce.facade.address.converter.AddressConverter;
import com.training.ecommerce.model.AddressModel;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultAddressConverter implements AddressConverter {

    @Override
    public AddressData convert2Data(AddressModel model) {
        Assert.notNull(model, "model cannot be empty");

        AddressData data = new AddressData();
        data.setId(model.getId());
        data.setCity(model.getCity());
        data.setDepartment(model.getDepartment());

        return data;
    }

    @Override
    public AddressModel convert2Model(AddressData data) {
        Assert.notNull(data, "data cannot be empty");

        AddressModel model = new AddressModel();
        model.setId(data.getId());
        model.setCity(data.getCity());
        model.setDepartment(data.getDepartment());

        return model;
    }
}
