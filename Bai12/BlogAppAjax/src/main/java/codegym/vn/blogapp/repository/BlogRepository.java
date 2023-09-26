package codegym.vn.blogapp.repository;

import codegym.vn.blogapp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,String> {
    List<Blog> findAllByNameContaining(String name);
}
