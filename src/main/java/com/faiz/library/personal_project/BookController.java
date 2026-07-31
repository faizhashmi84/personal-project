package com.faiz.library.personal_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return service.getAllBooks();
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book b) {
        service.addBook(b);
    }
}