package codegym.vn.service;

import codegym.vn.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    Product findByName(String nameProduct);
}
