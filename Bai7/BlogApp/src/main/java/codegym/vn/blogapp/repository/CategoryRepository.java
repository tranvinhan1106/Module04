package codegym.vn.blogapp.repository;

import codegym.vn.blogapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category ,Integer> {
}
