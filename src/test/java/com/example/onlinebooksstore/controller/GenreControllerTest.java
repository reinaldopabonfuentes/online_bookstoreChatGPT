package com.example.onlinebooksstore.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.example.onlinebooksstore.entity.Genre;
import com.example.onlinebooksstore.service.GenreService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class GenreControllerTest {

    private MockMvc mockMvc;

    @Mock
    private GenreService genreService;

    @InjectMocks
    private GenreController genreController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(genreController).build();
    }

    @Test
    public void testGetAllGenres() throws Exception {
        Genre genre1 = new Genre("Genre 1");
        Genre genre2 = new Genre("Genre 2");
        List<Genre> genres = Arrays.asList(genre1, genre2);

        when(genreService.getAllGenres()).thenReturn(genres);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/genres")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2));
    }



    // Add tests for other controller methods (create, update, delete) in a similar manner.
}
