package com.payperform.bankapi.service;

import com.payperform.bankapi.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {

    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Arisha Barron"));
        customerList.add(new Customer(2, "Branden Gibson"));
        customerList.add(new Customer(3, "Rhonda Church"));
        customerList.add(new Customer(4, "Georgina Hazel"));
        return customerList;
    }

}
