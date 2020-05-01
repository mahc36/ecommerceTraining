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
    public void createUser(@RequestBody final UserData user){
        getUserFacade().createUser(user);
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

    public UserFacade getUserFacade() {
        return userFacade;
    }
}
