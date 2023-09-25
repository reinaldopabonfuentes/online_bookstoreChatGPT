package com.example.onlinebooksstore.repository;

import com.example.onlinebooksstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Define custom query methods if needed
}
