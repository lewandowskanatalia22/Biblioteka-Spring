package com.sda.springstarter.demo.controller;


import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.BookCategory;

import com.sda.springstarter.demo.service.BookCategoryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BookCategory")
public class BookCategoryRestController {

    @Autowired
    private BookCategoryServiceImpl bookCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookCategory> getAllBookCategory(){
        return bookCategoryService.getAllBookCategory();
    }
    @GetMapping(value ="{id}")
    public ResponseEntity<BookCategory> getBookCategoryById(@PathVariable int id){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(bookCategoryService.getBookCategoryById(id));
    }
}
