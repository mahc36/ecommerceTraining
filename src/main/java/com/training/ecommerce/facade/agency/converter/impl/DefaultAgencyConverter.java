package com.training.ecommerce.facade.agency.converter.impl;

import com.training.ecommerce.data.AgencyData;
import com.training.ecommerce.data.LinkData;
import com.training.ecommerce.facade.Converter;
import com.training.ecommerce.facade.agency.converter.AgencyConverter;
import com.training.ecommerce.model.AgencyModel;
import com.training.ecommerce.model.LinkModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultAgencyConverter implements AgencyConverter {

    @Autowired
    private Converter<LinkData, LinkModel> linkConverter;

    @Override
    public AgencyData convert2Data(AgencyModel model) {
        Assert.notNull(model, "model cannot be empty");

        AgencyData data = new AgencyData();
        data.setId(model.getId());
        data.setAgencyName(model.getAgencyName());
        data.setLink(getLinkConverter().convert2Data(model.getLink()));

        return data;
    }

    @Override
    public AgencyModel convert2Model(AgencyData data) {
        Assert.notNull(data, "data cannot be empty");

        AgencyModel model = new AgencyModel();
        model.setId(data.getId());
        model.setAgencyName(data.getAgencyName());
        model.setLink(getLinkConverter().convert2Model(data.getLink()));

        return model;
    }

    public Converter<LinkData, LinkModel> getLinkConverter() {
        return linkConverter;
    }

    public void setLinkConverter(Converter<LinkData, LinkModel> linkConverter) {
        this.linkConverter = linkConverter;
    }
}
