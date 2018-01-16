package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Publisher")
public class PublisherRestController {
    @Autowired
    private PublisherServiceImpl publisherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Publisher>getAllPublisher(){
        return publisherService.getAllPublisher();
    }

    @GetMapping(value ="{id}")
    public ResponseEntity<Publisher> getPublisherById(@PathVariable int id){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(publisherService.getPublisherById(id));
    }
}
