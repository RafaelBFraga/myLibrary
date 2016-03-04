package com.rfraga.myLibrary.controller;

import com.rfraga.myLibrary.model.Book;
import com.rfraga.myLibrary.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String add(@RequestBody Book book){
        bookService.save(book);
        return "index";
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam String id) {
        Book book = bookService.findById(id);

        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", book);
        return modelAndView;
    }



}
