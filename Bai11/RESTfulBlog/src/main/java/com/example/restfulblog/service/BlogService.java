package com.example.restfulblog.service;

import com.example.restfulblog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();
    Optional<Blog > findById(String id);
    void create(Blog blog);
    void delete(String id);
    void update(Blog blog);
    Page<Blog> findAll(Pageable pageable);
}
