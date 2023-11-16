package com.example.web0911.services;

import com.example.web0911.db.Author;
import com.example.web0911.db.Book;
import com.example.web0911.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public void addBook(Author author, String title, int pages) {
        Book book = new Book(0, title, pages);
        book.setAuthor(author);
        bookRepository.save(book);
    }
}
