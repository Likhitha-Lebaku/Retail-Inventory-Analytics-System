package com.example.RetailInventoryAnalytics.service;

import com.example.RetailInventoryAnalytics.entity.Product;
import com.example.RetailInventoryAnalytics.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }
}
