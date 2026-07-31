package com.faiz.library.personal_project;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book() {
    }

    public Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }
}