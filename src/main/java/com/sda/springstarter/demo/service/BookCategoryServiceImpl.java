package com.sda.springstarter.demo.service;


import com.sda.springstarter.demo.exceprion.AuthorNotFoundException;
import com.sda.springstarter.demo.exceprion.BookCategoryNotFoundException;
import com.sda.springstarter.demo.interfaces.BookCategoryService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    @Override
    public BookCategory getBookCategoryById(int id) {
        Optional<BookCategory> bookCategory= Optional.ofNullable(bookCategoryRepository.findById(id));
        if(bookCategory.isPresent()){
            return bookCategory.get();
        }else {
            throw  new BookCategoryNotFoundException(id);
        }
    }
}
