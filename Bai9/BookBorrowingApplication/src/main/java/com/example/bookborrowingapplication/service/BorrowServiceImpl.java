package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.Book;
import com.example.bookborrowingapplication.entity.Borrow;
import com.example.bookborrowingapplication.entity.User;
import com.example.bookborrowingapplication.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    private BorrowRepository borrowRepository;
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;

    @Override
    public List<Borrow> findAll() {
        return borrowRepository.findAll();
    }

    @Override
    public Borrow findById(Long idBorrow) {
        return borrowRepository.findById(idBorrow).orElse(null);
    }

    @Override
    public void borrowBook(int userId, long bookId, long borrowId) {
        User user = userService.findById(userId);
        Book book = bookService.findById(bookId);
        if (book.getQuantity() > 0) {
            Borrow borrow = new Borrow(borrowId, user, book);
            borrowRepository.save(borrow);
            book.setQuantity(book.getQuantity() - 1);
            bookService.update(book);
        }
    }

    @Override
    public void returnBook(int userId, long bookId, long borrowId) {
        Book book = bookService.findById(bookId);
        Borrow borrow = borrowRepository.findById(borrowId).orElse(null);
        borrowRepository.delete(borrow);
        book.getBorrows().remove(book);
        book.setQuantity(book.getQuantity() + 1);
        bookService.update(book);
    }
}
