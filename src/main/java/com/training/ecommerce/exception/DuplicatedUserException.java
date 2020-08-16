package com.training.ecommerce.exception;

public class DuplicatedUserException extends Exception {

    public DuplicatedUserException(final String message) {
        super(message);
    }
}
