package com.training.ecommerce.repository.impl;

import com.training.ecommerce.model.UserModel;
import com.training.ecommerce.repository.UserRepository;
import com.training.ecommerce.repositoryjpa.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultUserRepository implements UserRepository {

    @Autowired
    UserRepositoryJPA userRepositoryJPA;

    @Override
    public void createUser(final UserModel user) {
        getUserRepositoryJPA().save(user);
    }

    @Override
    public UserModel findUserByEmail(final String email) {
        return userRepositoryJPA.findByEmail(email);
    }

    @Override
    public void updateUser(final UserModel user) {
        getUserRepositoryJPA().saveAndFlush(user);
    }

    @Override
    public void deleteUser(final UserModel user) {
        getUserRepositoryJPA().delete(user);
    }

    public UserRepositoryJPA getUserRepositoryJPA() {
        return userRepositoryJPA;
    }
}
