package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @CrossOrigin(value ="http://localhost:9999")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks(){

        return bookService.getAllBooks();

    }
    @CrossOrigin(value ="http://localhost:9999")
    @RequestMapping(method = RequestMethod.POST)
    private void saveBook(@RequestBody Book book){
        bookService.saveBook(book);

    }

    @GetMapping(value ="{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
      return  ResponseEntity
              .status(HttpStatus.OK)
              .body(bookService.getBookById(id));
    }

}
