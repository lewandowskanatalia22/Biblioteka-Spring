package com.sda.springstarter.demo.exceprion;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id){
        super("Could not find book"  + id);
    }
}
