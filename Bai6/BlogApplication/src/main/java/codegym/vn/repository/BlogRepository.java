package codegym.vn.repository;

import codegym.vn.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,String > {
}
