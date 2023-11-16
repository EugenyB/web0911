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
        Book book = new Book();
        book.setTitle(title);
        book.setPages(pages);
        book.setAuthor(author);
        book.setId(0);
        bookRepository.save(book);
    }
}
