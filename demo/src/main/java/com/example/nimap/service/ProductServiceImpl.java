// package com.example.nimap.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.example.nimap.entity.*;
// import com.example.nimap.repository.*;
// // import com.example.nimap.service.*;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class ProductServiceImpl implements ProductService {

// @Autowired
// private ProductRepository productRepository;

// @Override
// public List<Product> getAllProducts() {
// return productRepository.findAll();
// }

// @Override
// public Optional<Product> getProductById(Long id) {
// return productRepository.findById(id);
// }

// @Override
// public Product createProduct(Product product) {
// return productRepository.save(product);
// }

// @Override
// public Product updateProduct(Long id, Product product) {
// if (productRepository.existsById(id)) {
// product.setProductId(id);
// return productRepository.save(product);
// }
// return null;
// }

// @Override
// public void deleteProduct(Long id) {
// productRepository.deleteById(id);
// }
// }
