package com.training.ecommerce.controller;

public interface ControllerConstants {

    interface User{
        public static final String ROOT_REQUEST = "/user";
        public static final String CREATE = "/create";
        public static final String UPDATE = "/update";
        public static final String FIND_BY_EMAIL = "/find";
        public static final String FIND_ALL_USERS = "/findAllUsers";
        public static final String REQUEST_ORIGIN = "http://localhost:4200";
    }
}
