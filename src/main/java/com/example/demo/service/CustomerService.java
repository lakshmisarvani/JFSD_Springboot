package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customerList = new ArrayList<>();

    public String addCustomer(Customer customer) {
        customerList.add(customer);
        return "Customer Added Successfully";
    }

    public List<Customer> viewCustomers() {
        return customerList;
    }
}
