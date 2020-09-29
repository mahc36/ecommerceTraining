package com.training.ecommerce.facade.user.impl;

import com.training.ecommerce.data.UserData;
import com.training.ecommerce.exception.DuplicatedUserException;
import com.training.ecommerce.facade.CacheConstants;
import com.training.ecommerce.facade.Converter;
import com.training.ecommerce.facade.user.UserFacade;
import com.training.ecommerce.model.UserModel;
import com.training.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Objects;

@Service
public class DefaultUserFacade implements UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private Converter<UserData, UserModel> userConverter;

    @Override
    @Caching(evict = {
        @CacheEvict(value = CacheConstants.User.FIND_ALL_USERS_CACHE, allEntries = true)
    })
    public UserData createUser(final UserData user) throws DuplicatedUserException {
        Assert.notNull(user, user.getClass() + " cannot be empty");

        UserModel createdUser = getUserService().createUser(getUserConverter().convert2Model(user));
        return getUserConverter().convert2Data(createdUser);
    }

    @Override
    public UserData findUserByEmail(final String email) {

        Assert.hasText(email,"email cannot be empty");

        UserModel userByEmail = getUserService().findUserByEmail(email);
        if(Objects.nonNull(userByEmail)){
            return getUserConverter().convert2Data(userByEmail);
        }

        return null;
    }

    @Override
    public void updateUser(UserData user) {
        Assert.notNull(user,  user.getClass() + " cannot be empty");

        getUserService().updateUser(getUserConverter().convert2Model(user));
    }

    @Override
    public void deleteUser(UserData user) {
        Assert.notNull(user,  user.getClass() + " cannot be empty");

        getUserService().deleteUser(getUserConverter().convert2Model(user));
    }

    @Override
    @Cacheable(cacheNames = CacheConstants.User.FIND_ALL_USERS_CACHE)
    public List<UserData> findAllUsers() {
        return getUserConverter().convertAll2Data(getUserService().findAllUsers());
    }

    public UserService getUserService() {
        return userService;
    }

    public Converter<UserData, UserModel> getUserConverter() {
        return userConverter;
    }
}
