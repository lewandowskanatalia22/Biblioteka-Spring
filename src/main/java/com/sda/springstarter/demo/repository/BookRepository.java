package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
public Book findById(int id);
public Book findByTitle (String title);
}
