package com.training.ecommerce.controller;

public interface ControllerConstants {

    interface User{
        String ROOT_REQUEST = "/user";
        String CREATE = "/create";
        String UPDATE = "/update";
        String FIND_BY_EMAIL = "/find";
        String FIND_ALL_USERS = "/findAllUsers";
        String REQUEST_ORIGIN = "http://localhost:4200";
    }
}
