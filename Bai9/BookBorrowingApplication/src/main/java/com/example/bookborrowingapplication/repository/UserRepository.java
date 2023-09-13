package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
