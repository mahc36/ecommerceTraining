package com.training.ecommerce.facade.user.converter.impl;

import com.training.ecommerce.data.UserData;
import com.training.ecommerce.facade.user.converter.UserConverter;
import com.training.ecommerce.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * DefaultUserConverter is responsible to convert user between its data and model.
 */
@Service
public class DefaultUserConverter implements UserConverter {

    @Override
    public UserData convert2Data(final UserModel userModel) {
        Assert.notNull(userModel, "model cannot be empty");
        UserData userData = new UserData();

        userData.setEmail(userModel.getEmail());
        userData.setBornDate(userModel.getBornDate());
        userData.setGender(userModel.getGender());
        userData.setName(userModel.getName());
        userData.setLastName(userModel.getLastName());

        return userData;
    }

    @Override
    public UserModel convert2Model(final UserData userData) {
        Assert.notNull(userData, "data cannot be empty");

        UserModel userModel = new UserModel();

        userModel.setEmail(userData.getEmail());
        userModel.setBornDate(userData.getBornDate());
        userModel.setGender(userData.getGender());
        userModel.setName(userData.getName());
        userModel.setLastName(userData.getLastName());

        return userModel;
    }

}
