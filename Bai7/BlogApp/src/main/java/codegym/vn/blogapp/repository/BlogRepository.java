package codegym.vn.blogapp.repository;

import codegym.vn.blogapp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,String> {
}
