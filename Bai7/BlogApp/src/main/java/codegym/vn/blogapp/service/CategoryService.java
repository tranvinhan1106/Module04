package codegym.vn.blogapp.service;

import codegym.vn.blogapp.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);
}
