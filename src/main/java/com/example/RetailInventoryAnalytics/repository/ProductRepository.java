package com.example.RetailInventoryAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetailInventoryAnalytics.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}