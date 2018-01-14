package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
         bookRepository.save(book);
    }
    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }
}
