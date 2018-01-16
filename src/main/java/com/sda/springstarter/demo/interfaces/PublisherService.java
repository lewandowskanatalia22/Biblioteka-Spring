package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAllPublisher();
    void savePublisher(Publisher publisher);
    public Publisher getPublisherById(int id);
}
