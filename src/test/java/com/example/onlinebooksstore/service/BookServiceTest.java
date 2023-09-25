package com.example.onlinebooksstore.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.onlinebooksstore.entity.Book;
import com.example.onlinebooksstore.repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllBooks() {
        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book 2");
        List<Book> books = Arrays.asList(book1, book2);

        when(bookRepository.findAll()).thenReturn(books);

        List<Book> result = bookService.getAllBooks();

        verify(bookRepository, times(1)).findAll();
        assert(result.size() == 2);
    }

    // Add tests for other service methods (create, update, delete) in a similar manner.
}
