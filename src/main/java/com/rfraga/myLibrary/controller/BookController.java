package com.rfraga.myLibrary.controller;

import com.rfraga.myLibrary.model.Book;
import com.rfraga.myLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam String id) {
        Book book = bookService.findById(id);

        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", book);
        return modelAndView;
    }



}
