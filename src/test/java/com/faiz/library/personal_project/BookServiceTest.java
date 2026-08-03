package com.faiz.library.personal_project;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

public class BookServiceTest {

    @Test
    public void testAddValidBook_callsSave() {
        BookRepository mockRepository = Mockito.mock(BookRepository.class);
        BookService service = new BookService(mockRepository);

        Book b = new Book(1, "1984", "George Orwell", true);
        service.addBook(b);

        Mockito.verify(mockRepository).save(b);
    }

    @Test
    public void testRejectEmptyTitle_neverCallsSave() {
        BookRepository mockRepository = Mockito.mock(BookRepository.class);
        BookService service = new BookService(mockRepository);

        Book b = new Book(2, "", "Unknown Author", true);
        service.addBook(b);

        Mockito.verify(mockRepository, Mockito.never()).save(any(Book.class));
    }
}
