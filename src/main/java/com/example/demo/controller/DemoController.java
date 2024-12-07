package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/SpringMVC")
public class DemoController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping("/demo1")
    @ResponseBody
    public int demo1() {
        return 42; 
    }

    @GetMapping("/demo2")
    public double demo2() {
        return 3.14; 
    }

    @GetMapping("/")
    public String demo3() {
        return "<h1>Hello, this is a formatted HTML string!</h1>";
    }

    @GetMapping("/about")
    public String demo4() {
        String str = "KLEF";
        return "This is about page,I Study at " + str;
    }

    @GetMapping("/demo5/{id}")
    @ResponseBody
    public String demo5(@PathVariable("id") int id) {
        return "Received ID: " + id;
    }

    @GetMapping("/demo6/{a}/{b}")
    @ResponseBody
    public String demo6(@PathVariable("a") int a, @PathVariable("b") int b) {
        return "Sum of " + a + " and " + b + " is: " + (a + b);
    }

    @GetMapping("/demo7/{c}/{d}")
    @ResponseBody
    public String demo7(@PathVariable("c") int c, @PathVariable("d") int d) {
        return "Multiplication of " + c + " and " + d + " is: " + (c * d);
    }

    @GetMapping("/greet/{name}")
    @ResponseBody
    public String demo8(@PathVariable("name") String name) {
        return "Hello,  " + name;
    }
    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/viewcustomer")
    @ResponseBody
    public List<Customer> viewCustomers() {
        return customerService.viewCustomers();
    }
}
