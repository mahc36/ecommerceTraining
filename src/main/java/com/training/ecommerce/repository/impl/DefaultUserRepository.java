package com.training.ecommerce.repository.impl;

import com.training.ecommerce.model.UserModel;
import com.training.ecommerce.repository.UserRepository;
import com.training.ecommerce.repositoryjpa.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DefaultUserRepository implements UserRepository {

    @Autowired
    UserRepositoryJPA userRepositoryJPA;

    @Override
    public void createUser(UserModel user) {
        getUserRepositoryJPA().save(user);
    }

    @Override
    public UserModel findUserByEmail(String email) {
        return userRepositoryJPA.findById(email).orElse(null);
    }

    @Override
    public void updateUser(UserModel user) {
        getUserRepositoryJPA().save(user);
    }

    @Override
    public void deleteUser(UserModel user) {
        getUserRepositoryJPA().delete(user);
    }

    public UserRepositoryJPA getUserRepositoryJPA() {
        return userRepositoryJPA;
    }
}
