package com.example.biblioteca.service;

import com.example.biblioteca.model.Book;
import com.example.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Retorna todos os livros no banco de dados.
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Retorna um livro pelo ID.
     */
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    /**
     * Adiciona ou atualiza um livro no banco de dados.
     */
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Remove um livro pelo ID.
     */
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}

