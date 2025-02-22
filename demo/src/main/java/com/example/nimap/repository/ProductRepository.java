package com.example.nimap.repository;

import com.example.nimap.entity.Product;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
