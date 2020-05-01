package com.training.ecommerce.repository;

import com.training.ecommerce.model.UserModel;

public interface UserRepository {

    void createUser(UserModel user);

    UserModel findUserByEmail(String email);

    void updateUser(UserModel user);

    void deleteUser(UserModel user);
}
