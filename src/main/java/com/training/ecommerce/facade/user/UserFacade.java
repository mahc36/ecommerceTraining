package com.training.ecommerce.facade.user;

import com.training.ecommerce.data.UserData;

public interface UserFacade {

    void createUser(UserData user);

    UserData findUserByEmail(String email);

    void updateUser(UserData user);

    void deleteUser(UserData user);

}
