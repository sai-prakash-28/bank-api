package com.payperform.bankapi.controller;

import com.payperform.bankapi.model.Customer;
import com.payperform.bankapi.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BankController {

    private BankService service;

    @GetMapping("/getallcustomer")
    public List<Customer> getCustomerList() {
        return service.getAllCustomer();
    }

}
