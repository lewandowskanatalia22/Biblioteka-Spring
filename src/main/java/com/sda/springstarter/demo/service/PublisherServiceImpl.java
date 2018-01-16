package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.exceprion.BookNotFoundException;
import com.sda.springstarter.demo.exceprion.PublisherNotFoundException;
import com.sda.springstarter.demo.interfaces.PublisherService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.repository.BookRepository;
import com.sda.springstarter.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public void savePublisher (Publisher publisher) {
        publisherRepository.save(publisher);
    }
    @Override
    public Publisher getPublisherById(int id) {
        Optional<Publisher> publisher = Optional.ofNullable(publisherRepository.findById(id));
        if (publisher.isPresent()) {
            return publisher.get();
        } else {
            throw new PublisherNotFoundException(id);
        }
    }}
