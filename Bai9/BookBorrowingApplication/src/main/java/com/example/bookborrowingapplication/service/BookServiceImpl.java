package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.Book;
import com.example.bookborrowingapplication.entity.Borrow;
import com.example.bookborrowingapplication.entity.User;
import com.example.bookborrowingapplication.repository.BookRepository;
import com.example.bookborrowingapplication.repository.BorrowRepository;
import com.example.bookborrowingapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long idBook) {
        return bookRepository.findById(idBook).orElse(null);
    }

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }


    @Override
    public void delete(Long idBook) {
        bookRepository.deleteById(idBook);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }


}
