package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
