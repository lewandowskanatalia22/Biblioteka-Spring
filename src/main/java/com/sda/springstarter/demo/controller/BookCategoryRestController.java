package com.sda.springstarter.demo.controller;


import com.sda.springstarter.demo.model.BookCategory;

import com.sda.springstarter.demo.service.BookCategoryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/addnewbookCategory" ,method = RequestMethod.POST)
    public  void  saveBookCategory(@RequestBody BookCategory bookCategory){
        bookCategoryService.saveBookCategory(bookCategory);
    }
}
