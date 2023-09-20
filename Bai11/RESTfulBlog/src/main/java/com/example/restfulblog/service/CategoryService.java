package com.example.restfulblog.service;

import com.example.restfulblog.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();
    Optional<Category> findById(int id);
}
