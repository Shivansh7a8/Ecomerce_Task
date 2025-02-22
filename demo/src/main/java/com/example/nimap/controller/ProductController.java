package com.example.nimap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;

import com.example.nimap.entity.Category;
// import org.springframework.data.domain.PageRequest;
import com.example.nimap.entity.Product;
import com.example.nimap.repository.CategoryRepository;
import com.example.nimap.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page) {
        return productService.getAllProducts(page);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        Category category = categoryRepository.findById(product.getCategory().getCategoryid())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        product.setCategory(category); // Set the retrieved category
        return productService.createProduct(product);
    }

    @GetMapping("/{productid}")
    public Optional<Product> getProductById(@PathVariable Long productid) {
        return productService.getProductById(productid);
    }

    @PutMapping("/{productid}")
    public Product updateProduct(@PathVariable Long productid, @RequestBody Product product) {
        return productService.updateProduct(productid, product);
    }

    @DeleteMapping("/{productid}")
    public void deleteProduct(@PathVariable Long productid) {
        productService.deleteProduct(productid);
    }
}
