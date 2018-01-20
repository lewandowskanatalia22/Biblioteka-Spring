package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.interfaces.AuthorService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
public class WebController {
    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private AuthorServiceImpl authorService;
    @Autowired
    private BookCategoryServiceImpl bookCategoryService;
    @Autowired
    private PublisherServiceImpl publisherService;



    @GetMapping("/books")
    public ModelAndView showBooks() {
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks());
        model.addObject("authors", authorService.getAllAuthor());
        model.addObject("bookCategory", bookCategoryService.getAllBookCategory());
        model.addObject("publisher", publisherService.getAllPublisher());
        model.addObject("book", new Book());
        model.setViewName("booklist");
        return model;
    }
    @PostMapping(value = "addbook")
    public String addBook(@ModelAttribute("book")
                                @Valid Book book,
                                BindingResult bookresult,
                                RedirectAttributes redirectAttributes){
        bookService.saveBook(book);
        return "redirect:/books";
    }
    @GetMapping("/authors")
    public ModelAndView showAuthor() {
        ModelAndView model = new ModelAndView();
        model.addObject("authors", authorService.getAllAuthor());
        model.setViewName("authorlist");
        return model;
}
    @GetMapping("/bookCategory")
    public ModelAndView showBookCategory() {
        ModelAndView model = new ModelAndView();
        model.addObject("bookCategory", bookCategoryService.getAllBookCategory());
        model.setViewName("bookcategorylist");
        return model;
    }
    @GetMapping("/publisher")
    public ModelAndView showPublisher() {
        ModelAndView model = new ModelAndView();
        model.addObject("publisher", publisherService.getAllPublisher());
        model.setViewName("publisherlist");
        return model;
    }
}
