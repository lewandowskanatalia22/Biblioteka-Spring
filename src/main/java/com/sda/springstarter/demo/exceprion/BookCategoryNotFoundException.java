package com.sda.springstarter.demo.exceprion;

public class BookCategoryNotFoundException extends RuntimeException {

    public BookCategoryNotFoundException(int id){
        super("Could not find book category"  + id);
    }
}
