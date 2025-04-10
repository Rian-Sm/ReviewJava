package com.rns.demo.Service;

import org.springframework.stereotype.Service;

import com.rns.demo.Customer;

@Service
public class CustomerService {
    public Customer getCustomer() {
        return new Customer();
    }
}
