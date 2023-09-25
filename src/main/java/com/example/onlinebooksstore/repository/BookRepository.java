package com.example.onlinebooksstore.repository;

import com.example.onlinebooksstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Define custom query methods if needed
}
