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

    public Genre updateGenre(Long id, Genre genre) {
        if (genreRepository.existsById(id)) {
            genre.setId(id);
            return genreRepository.save(genre);
        }
        return null; // Return null if the genre with the given id doesn't exist
    }

    public boolean deleteGenre(Long id) {
        if (genreRepository.existsById(id)) {
            genreRepository.deleteById(id);
            return true;
        }
        return false; // Return false if the genre with the given id doesn't exist
    }
}
