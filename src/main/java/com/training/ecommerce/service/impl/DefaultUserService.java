package com.training.ecommerce.service.impl;

import com.training.ecommerce.exception.DuplicatedUserException;
import com.training.ecommerce.model.UserModel;
import com.training.ecommerce.repository.UserRepository;
import com.training.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel createUser(final UserModel user) throws DuplicatedUserException {

        UserModel userByEmail = getUserRepository().findUserByEmail(user.getEmail());

        if(Objects.isNull(userByEmail)){
            return getUserRepository().createUser(user);
        }
        else {
            throw new DuplicatedUserException(user.getEmail() + " has been already taken");
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

        UserModel userByEmail = getUserRepository().findUserByEmail(user.getEmail());
        if(Objects.nonNull(userByEmail)){
            user.setId(userByEmail.getId());
            getUserRepository().updateUser(user);
        }
    }

    @Override
    public void deleteUser(final UserModel user) {
        if(Objects.nonNull(user)){
            getUserRepository().deleteUser(user);
        }
    }

    @Override
    public List<UserModel> findAllUsers() {
        return getUserRepository().findAllUsers();
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
