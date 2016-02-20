package com.rfraga.myLibrary.controller;

import com.rfraga.myLibrary.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @RequestMapping(value = "/guide", method = RequestMethod.GET)
    public ModelAndView createBook() {
        Book book = new Book("guide to the galaxy","Douglas Adams",1);
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book",book);
        return modelAndView;
    }

}
