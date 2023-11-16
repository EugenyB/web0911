package com.example.web0911.repositories;

import com.example.web0911.db.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}