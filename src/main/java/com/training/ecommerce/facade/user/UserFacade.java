package com.training.ecommerce.facade.user;

import com.training.ecommerce.data.UserData;

import java.util.List;

public interface UserFacade {

    void createUser(UserData user);

    UserData findUserByEmail(String email);

    void updateUser(UserData user);

    void deleteUser(UserData user);

    List<UserData> findAllUsers();

}
