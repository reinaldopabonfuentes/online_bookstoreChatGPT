package com.example.onlinebooksstore.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.onlinebooksstore.entity.Author;
import com.example.onlinebooksstore.repository.AuthorRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class AuthorServiceTest {

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllAuthors() {
        Author author1 = new Author("Author 1");
        Author author2 = new Author("Author 2");
        List<Author> authors = Arrays.asList(author1, author2);

        when(authorRepository.findAll()).thenReturn(authors);

        List<Author> result = authorService.getAllAuthors();

        verify(authorRepository, times(1)).findAll();
        assert(result.size() == 2);
    }

    // Add tests for other service methods (create, update, delete) in a similar manner.
}
