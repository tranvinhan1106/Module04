package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.Borrow;
import com.example.bookborrowingapplication.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int idUser);

}
