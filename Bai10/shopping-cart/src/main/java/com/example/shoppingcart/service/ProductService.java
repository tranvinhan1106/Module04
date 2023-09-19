package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(int id);
    Iterable<Product> findAll();
}
