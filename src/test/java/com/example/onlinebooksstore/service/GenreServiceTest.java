package com.example.onlinebooksstore.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.onlinebooksstore.entity.Genre;
import com.example.onlinebooksstore.repository.GenreRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class GenreServiceTest {

    @Mock
    private GenreRepository genreRepository;

    @InjectMocks
    private GenreService genreService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllGenres() {
        Genre genre1 = new Genre("Genre 1");
        Genre genre2 = new Genre("Genre 2");
        List<Genre> genres = Arrays.asList(genre1, genre2);

        when(genreRepository.findAll()).thenReturn(genres);

        List<Genre> result = genreService.getAllGenres();

        verify(genreRepository, times(1)).findAll();
        assert(result.size() == 2);
    }

    // Add tests for other service methods (create, update, delete) in a similar manner.
}
