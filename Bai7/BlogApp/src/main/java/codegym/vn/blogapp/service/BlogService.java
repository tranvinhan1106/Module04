package codegym.vn.blogapp.service;

import codegym.vn.blogapp.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(String id);
    void create(Blog blog);
    void delete(String id);
    void update(Blog blog);
    Page<Blog> findAll(Pageable pageable);
}
