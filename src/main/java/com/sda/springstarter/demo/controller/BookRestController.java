package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks(){

        return bookService.getAllBooks();
    }

    @GetMapping(value ="bookById/{id}")
    public Book  getBookById(@PathVariable int id){
      return  bookService.getBookById(id);
    }

}
