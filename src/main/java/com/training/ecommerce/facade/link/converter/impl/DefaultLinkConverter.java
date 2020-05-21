package com.training.ecommerce.facade.link.converter.impl;

import com.training.ecommerce.data.LinkData;
import com.training.ecommerce.facade.link.converter.LinkConverter;
import com.training.ecommerce.model.LinkModel;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultLinkConverter implements LinkConverter {

    @Override
    public LinkData convert2Data(LinkModel model) {
        Assert.notNull(model, "model cannot be empty");

        LinkData data = new LinkData();
        data.setId(model.getId());
        data.setLinkResource(model.getLinkResource());
        data.setReliabilityPercentage(model.getReliabilityPercentage());

        return data;
    }

    @Override
    public LinkModel convert2Model(LinkData data) {

        Assert.notNull(data, "data cannot be empty");

        LinkModel model = new LinkModel();
        model.setId(data.getId());
        model.setLinkResource(data.getLinkResource());
        model.setReliabilityPercentage(data.getReliabilityPercentage());

        return model;
    }
}
