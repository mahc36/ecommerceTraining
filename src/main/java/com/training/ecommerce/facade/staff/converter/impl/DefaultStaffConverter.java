package com.training.ecommerce.facade.staff.converter.impl;

import com.training.ecommerce.data.*;
import com.training.ecommerce.facade.Converter;
import com.training.ecommerce.facade.staff.converter.StaffConverter;
import com.training.ecommerce.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class DefaultStaffConverter implements StaffConverter {

    @Autowired
    private Converter<AddressData, AddressModel> addressConverter;
    @Autowired
    private Converter<NumberData, NumberModel> numberConverter;
    @Autowired
    private Converter<PriceContainerData, PriceContainerModel> priceContainerConverter;
    @Autowired
    private Converter<AgencyData, AgencyModel> agencyConverter;
    @Autowired
    private Converter<LinkData, LinkModel> resourceConverter;

    @Override
    public StaffData convert2Data(StaffModel model) {
        Assert.notNull(model, "model cannot be empty");

        StaffData data = new StaffData();
        data.setId(model.getId());
        data.setName(model.getName());
        data.setTested(model.isTested());
        data.setNationality(model.getNationality());
        data.setAddress( getAddressConverter().convert2Data(model.getAddress()));
        data.setNumbers(getNumberConverter().convertAll2Data(model.getNumbers()) );
        data.setPriceContainer( getPriceContainerConverter().convert2Data(model.getPriceContainer()));
        data.setAgency( getAgencyConverter().convert2Data(model.getAgency()));
        data.setResources( getResourceConverter().convertAll2Data(model.getResources()));

        return data;
    }

    @Override
    public StaffModel convert2Model(StaffData data) {
        Assert.notNull(data, "data cannot be empty");

        StaffModel model = new StaffModel();
        model.setId(data.getId());
        model.setName(data.getName());
        model.setTested(data.isTested());
        model.setNationality(data.getNationality());
        model.setAddress( getAddressConverter().convert2Model(data.getAddress()));
        model.setNumbers(getNumberConverter().convertAll2Model(data.getNumbers()) );
        model.setPriceContainer( getPriceContainerConverter().convert2Model(data.getPriceContainer()));
        model.setAgency( getAgencyConverter().convert2Model(data.getAgency()));
        model.setResources( getResourceConverter().convertAll2Model(data.getResources()));

        return model;
    }

    public Converter<AddressData, AddressModel> getAddressConverter() {
        return addressConverter;
    }

    public void setAddressConverter(Converter<AddressData, AddressModel> addressConverter) {
        this.addressConverter = addressConverter;
    }

    public Converter<NumberData, NumberModel> getNumberConverter() {
        return numberConverter;
    }

    public void setNumberConverter(Converter<NumberData, NumberModel> numberConverter) {
        this.numberConverter = numberConverter;
    }

    public Converter<PriceContainerData, PriceContainerModel> getPriceContainerConverter() {
        return priceContainerConverter;
    }

    public void setPriceContainerConverter(Converter<PriceContainerData, PriceContainerModel> priceContainerConverter) {
        this.priceContainerConverter = priceContainerConverter;
    }

    public Converter<AgencyData, AgencyModel> getAgencyConverter() {
        return agencyConverter;
    }

    public void setAgencyConverter(Converter<AgencyData, AgencyModel> agencyConverter) {
        this.agencyConverter = agencyConverter;
    }

    public Converter<LinkData, LinkModel> getResourceConverter() {
        return resourceConverter;
    }

    public void setResourceConverter(Converter<LinkData, LinkModel> resourceConverter) {
        this.resourceConverter = resourceConverter;
    }
}
