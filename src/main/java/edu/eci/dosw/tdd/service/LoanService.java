package edu.eci.dosw.tdd.service;

import edu.eci.dosw.tdd.model.Book;
import edu.eci.dosw.tdd.model.Loan;
import org.apache.catalina.User;

import java.util.*;

public class LoanService {

    private List<Loan> loans = new ArrayList<>();
    private BookService bookService;

    public LoanService(BookService bookService) {
        this.bookService = bookService;
    }

    public void createLoan(String loanId, String bookId, User user) {

        Book book = bookService.getBookById(bookId);

        if (book == null || !book.isAvailable()) {
            throw new RuntimeException("Book not available");
        }

        book.setAvailable(false);

        Loan loan = new Loan(loanId, book, user);
        loans.add(loan);
    }

    public List<Loan> getAllLoans() {
        return loans;
    }
}