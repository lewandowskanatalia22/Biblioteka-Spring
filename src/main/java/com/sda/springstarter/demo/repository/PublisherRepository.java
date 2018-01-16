package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    public  Publisher findById(int id);
    public Publisher findByName(String name);
}

