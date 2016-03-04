package com.rfraga.myLibrary.controller;

import com.rfraga.myLibrary.model.Book;
import com.rfraga.myLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getBooks(){
        List<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("books",books);
        return modelAndView;
    }
}
