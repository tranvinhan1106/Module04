package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.Borrow;

import java.util.List;

public interface BorrowService {
    List<Borrow> findAll();
    Borrow findById(Long idBorrow);
    void borrowBook(int userId, long bookId, long borrowId);
    void returnBook(int userId, long bookId , long borrowId);
}

