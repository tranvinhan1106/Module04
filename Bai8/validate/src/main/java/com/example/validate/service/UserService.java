package com.example.validate.service;

import com.example.validate.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);
    User findById(String id);
    List<User> findAll();

}
