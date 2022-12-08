package com.example.productapp_backend.controller;

import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddProduct(@RequestBody Product p){
        dao.save(p);
        HashMap<String, String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewproduct")
    public List<Product> ViewProduct(){

        return (List<Product>) dao.findAll();
    }
    @PostMapping("/search")
    public String SearchProduct(){
        return "Search product";
    }
    @PostMapping("/edit")
    public String EditProduct(){
        return "Edit product";
    }
    @PostMapping("/delete")
    public String DeleteProduct(){
        return "Delete product";
    }

}
