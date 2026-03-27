package edu.eci.dosw.tdd.controller;
import edu.eci.dosw.tdd.model.Book;
import edu.eci.dosw.tdd.service.BookService;

import java.util.List;

public class BookController {

    private final BookService bookService;

    public BookController() {
        this.bookService = new BookService();
    }

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public Book getBookById(String id) {
        return bookService.getBookById(id);
    }

    public void updateAvailability(String id, boolean available) {
        bookService.updateAvailability(id, available);
    }

    public BookService getBookService() {
        return bookService;
    }
}