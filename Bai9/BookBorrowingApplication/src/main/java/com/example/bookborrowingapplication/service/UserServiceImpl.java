package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.entity.User;
import com.example.bookborrowingapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int idUser) {
        return userRepository.findById(idUser).orElse(null);
    }
}
