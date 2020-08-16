package com.training.ecommerce.controller;


import com.training.ecommerce.data.UserData;
import com.training.ecommerce.exception.DuplicatedUserException;
import com.training.ecommerce.facade.user.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = ControllerConstants.User.ROOT_REQUEST )
@CrossOrigin( origins = ControllerConstants.User.REQUEST_ORIGIN )
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @RequestMapping(value= ControllerConstants.User.CREATE ,method = RequestMethod.POST)
    public UserData createUser(@RequestBody final UserData user) throws DuplicatedUserException {
        return getUserFacade().createUser(user);
    }

    @RequestMapping(value= ControllerConstants.User.UPDATE ,method = RequestMethod.POST)
    public void updateUser(@RequestBody final UserData user){
        getUserFacade().updateUser(user);
    }

    @RequestMapping(value= ControllerConstants.User.FIND_BY_EMAIL ,method = RequestMethod.GET)
    @ResponseBody
    public UserData findUserByEmail(@RequestParam(value = "email") final String email){
        return getUserFacade().findUserByEmail(email);
    }

    @RequestMapping(value= ControllerConstants.User.FIND_ALL_USERS ,method = RequestMethod.GET)
    @ResponseBody
    public List<UserData> findAllUsers(){
        return getUserFacade().findAllUsers();
    }

    public UserFacade getUserFacade() {
        return userFacade;
    }
}
