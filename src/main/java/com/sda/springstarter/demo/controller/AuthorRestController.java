package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorRestController {
    @Autowired
    private AuthorServiceImpl authorService;

    @CrossOrigin(value ="http://localhost:9999")
    @RequestMapping(method = RequestMethod.GET)
    public List<Author> getAllAuthor(){
        return authorService.getAllAuthor();
    }
    @GetMapping(value ="{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable int id){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorById(id));
    }
    }


