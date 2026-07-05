package com.example.RetailInventoryAnalytics.controller;

import com.example.RetailInventoryAnalytics.entity.Product;
import com.example.RetailInventoryAnalytics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Product Deleted";
    }
}