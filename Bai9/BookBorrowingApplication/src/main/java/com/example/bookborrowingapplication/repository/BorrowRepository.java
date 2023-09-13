package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
}
