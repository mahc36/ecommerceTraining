package com.training.ecommerce.controller;


import com.training.ecommerce.data.UserData;
import com.training.ecommerce.facade.user.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = ControllerConstants.User.ROOT_REQUEST )
@CrossOrigin( origins = ControllerConstants.User.REQUEST_ORIGIN )
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @RequestMapping(value= ControllerConstants.User.CREATE ,method = RequestMethod.POST)
    public void createUser(@RequestBody UserData user){
        getUserFacade().createUser(user);
    }

    public UserFacade getUserFacade() {
        return userFacade;
    }
}
