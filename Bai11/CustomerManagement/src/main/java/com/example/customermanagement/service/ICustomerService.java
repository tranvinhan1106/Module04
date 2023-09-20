package com.example.customermanagement.service;

import com.example.customermanagement.entity.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    void  remove(Long id);
}
