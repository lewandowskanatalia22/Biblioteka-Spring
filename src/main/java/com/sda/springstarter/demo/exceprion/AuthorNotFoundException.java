package com.sda.springstarter.demo.exceprion;

public class AuthorNotFoundException extends RuntimeException {

    public AuthorNotFoundException (int id){
        super("Could not find author "  + id);
    }
}
