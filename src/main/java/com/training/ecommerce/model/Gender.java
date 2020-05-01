package com.training.ecommerce.model;

public enum Gender {

    MALE("MALE"), FEMALE("FEMALE");

    private final String code;

    Gender(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
