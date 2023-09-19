package com.example.shoppingcart.service;


import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.reposiroty.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
}
