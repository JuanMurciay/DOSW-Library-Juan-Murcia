package edu.eci.dosw.tdd.controller;
import edu.eci.dosw.tdd.model.Loan;
import edu.eci.dosw.tdd.model.user;
import edu.eci.dosw.tdd.service.BookService;
import edu.eci.dosw.tdd.service.LoanService;
import org.apache.catalina.User;

import java.util.List;

public class LoanController {

    private final LoanService loanService;

    public LoanController() {
        BookService bookService = new BookService();
        this.loanService = new LoanService(bookService);
    }

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    public void createLoan(String loanId, String bookId, User user) {
        loanService.createLoan(loanId, bookId, user);
    }

    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    public LoanService getLoanService() {
        return loanService;
    }
}