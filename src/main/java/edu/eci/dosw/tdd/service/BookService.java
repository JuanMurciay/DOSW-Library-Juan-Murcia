package edu.eci.dosw.tdd.service;

import edu.eci.dosw.tdd.model.Book;

import java.util.*;

public class BookService {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public void updateAvailability(String id, boolean available) {
        Book book = books.get(id);
        if (book != null) {
            book.setAvailable(available);
        }
    }
}