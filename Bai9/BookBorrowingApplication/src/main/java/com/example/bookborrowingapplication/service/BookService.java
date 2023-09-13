package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(Long idBook);

    void create(Book book);

    void delete(Long idBook);

    void update(Book book);

    Page<Book> findAll(Pageable pageable);


}
