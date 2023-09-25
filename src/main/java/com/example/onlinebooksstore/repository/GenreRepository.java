package com.example.onlinebooksstore.repository;

import com.example.onlinebooksstore.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    // Define custom query methods if needed
}
