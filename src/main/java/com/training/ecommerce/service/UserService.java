package com.training.ecommerce.service;

import com.training.ecommerce.exception.DuplicatedUserException;
import com.training.ecommerce.model.UserModel;

import java.util.List;

public interface UserService {

    UserModel createUser(UserModel user) throws DuplicatedUserException;

    UserModel findUserByEmail(String email);

    void updateUser(UserModel user);

    void deleteUser(UserModel user);

    List<UserModel> findAllUsers();

}
