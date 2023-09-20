package com.example.customermanagement.repository;

import com.example.customermanagement.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
