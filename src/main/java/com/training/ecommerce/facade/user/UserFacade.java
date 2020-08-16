package com.training.ecommerce.facade.user;

import com.training.ecommerce.data.UserData;
import com.training.ecommerce.exception.DuplicatedUserException;

import java.util.List;

public interface UserFacade {

    UserData createUser(UserData user) throws DuplicatedUserException;

    UserData findUserByEmail(String email);

    void updateUser(UserData user);

    void deleteUser(UserData user);

    List<UserData> findAllUsers();

}
