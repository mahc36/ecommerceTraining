package com.training.ecommerce.repository;

import com.training.ecommerce.model.UserModel;

import java.util.List;

public interface UserRepository {

    UserModel createUser(UserModel user);

    UserModel findUserByEmail(String email);

    void updateUser(UserModel user);

    void deleteUser(UserModel user);

    List<UserModel> findAllUsers();
}
