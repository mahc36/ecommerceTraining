package com.training.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class DuplicatedUserExceptionHandler {

    public DuplicatedUserExceptionHandler() {
        super();
    }

    @ExceptionHandler({ DuplicatedUserException.class })
    @ResponseStatus(value= HttpStatus.CONFLICT)
    public @ResponseBody
    Map<String, String> handleException( Exception ex ) {
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("message", ex.getMessage());
        return errorMessageMap;
    }
}
