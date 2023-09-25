package com.example.onlinebooksstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebooksstore.entity.Genre;
import com.example.onlinebooksstore.repository.GenreRepository;

import java.util.List;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    // Implement other service methods as needed
}
