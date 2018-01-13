package com.sda.springstarter.demo.service;


import com.sda.springstarter.demo.interfaces.BookCategoryService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.BookCategoryRepository;
import com.sda.springstarter.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookCategoryServiceImpl implements BookCategoryService {
    @Autowired
    private BookCategoryRepository bookCategoryRepository;


    @Override
    public List<BookCategory> getAllBookCategory() {
        return bookCategoryRepository.findAll();
    }

    @Override
    public void saveBookCategory(BookCategory bookCategory) {
        bookCategoryRepository.save(bookCategory);
    }

}
