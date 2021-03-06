package com.rfraga.myLibrary.service;

import com.rfraga.myLibrary.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    private List<Book> books = new ArrayList();

    public BookService(){
        loadBooks();
    }

    private void loadBooks(){
        books.add(new Book("Hitchickers guide to the galaxy","Douglas Adams","1"));
        books.add(new Book("Sandman","Neil Gaiman","2"));
        books.add(new Book("Hunger Games","Susan Collins","3"));
        books.add(new Book("The Hobbit","J.R.R Tolkien","4"));
        books.add(new Book("Roverando","J.R.R Tolkien","5"));
    }

    public void save(Book book) {
        books.add(book);
    }

    public List<Book> findAll(){
        return books;
    }

    public Book findById(final String id){
       return books.stream()
                    .filter(book -> book.getId().equals(id))
                    .findFirst()
                    .get();
    }

}
