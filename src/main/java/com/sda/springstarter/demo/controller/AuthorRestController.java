package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Author")
public class AuthorRestController {
    @Autowired
    private AuthorServiceImpl authorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Author> getAllAuthor(){
        return authorService.getAllAuthor();
    }
    @RequestMapping(value = "/addnewauthor" ,method = RequestMethod.POST)
    public  void  saveAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
    }
}
