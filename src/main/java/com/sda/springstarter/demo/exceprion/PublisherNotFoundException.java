package com.sda.springstarter.demo.exceprion;

public class PublisherNotFoundException extends RuntimeException{
    public PublisherNotFoundException (int id){
        super("Could not find publisher"  + id);
    }
}
