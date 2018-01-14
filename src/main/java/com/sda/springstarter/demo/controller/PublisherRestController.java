package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/addnewPublisher" ,method = RequestMethod.POST)
    public  void savePublisher(@RequestBody Publisher publisher){
        publisherService.savePublisher(publisher);
    }
}
