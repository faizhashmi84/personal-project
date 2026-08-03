package com.faiz.library.personal_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(Book b) {
        if (b.getTitle() != null && !b.getTitle().isEmpty()) {
            repository.save(b);
        }
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}