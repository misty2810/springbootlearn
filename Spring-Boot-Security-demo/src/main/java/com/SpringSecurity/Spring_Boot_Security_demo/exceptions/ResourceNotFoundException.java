package com.SpringSecurity.Spring_Boot_Security_demo.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

