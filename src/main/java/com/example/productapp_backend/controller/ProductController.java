package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @PostMapping("/add")
    public String AddProduct(){
        return "Add product";
    }
    @GetMapping("/view")
    public String ViewProducts(){
        return "View products";
    }
    @PostMapping("/search")
    public String SearchProduct(){
        return "Search product";
    }

}
