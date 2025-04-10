package com.rns.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rns.demo.Service.CustomerService;


@RestController
@RequestMapping("/customer") 
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getMethodName(@RequestParam(name = "filter", required=false) String param) {
        return "OK "+ param;

    }    
}
