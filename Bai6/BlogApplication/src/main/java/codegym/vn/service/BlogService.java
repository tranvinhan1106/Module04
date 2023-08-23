package codegym.vn.service;

import codegym.vn.entity.Blog;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    Blog findById(String id);
    List<Blog> findAll();
    void deleteById(String id);
}
