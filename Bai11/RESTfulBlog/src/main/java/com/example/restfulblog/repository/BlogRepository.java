package com.example.restfulblog.repository;

import com.example.restfulblog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,String> {
}
