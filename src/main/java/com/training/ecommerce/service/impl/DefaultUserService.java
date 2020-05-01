package com.training.ecommerce.service.impl;

import com.training.ecommerce.model.UserModel;
import com.training.ecommerce.repository.UserRepository;
import com.training.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(final UserModel user) {
        if(Objects.nonNull(user)){
            getUserRepository().createUser(user);
        }
    }

    @Override
    public UserModel findUserByEmail(final String email) {
        if(Objects.nonNull(email)){
            return getUserRepository().findUserByEmail(email);
        }
        return null;
    }

    @Override
    public void updateUser(final UserModel user) {
        if(Objects.nonNull(user)){
            getUserRepository().updateUser(user);
        }
    }

    @Override
    public void deleteUser(final UserModel user) {
        if(Objects.nonNull(user)){
            getUserRepository().deleteUser(user);
        }
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
