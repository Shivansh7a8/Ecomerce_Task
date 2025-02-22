// package com.example.nimap.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.example.nimap.entity.*;
// import com.example.nimap.repository.*;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class CategoryServiceImpl implements CategoryService {

// @Autowired
// private CategoryRepository categoryRepository;

// @Override
// public List<Category> getAllCategories() {
// return categoryRepository.findAll();
// }

// @Override
// public Optional<Category> getCategoryById(Long id) {
// return categoryRepository.findById(id);
// }

// @Override
// public Category createCategory(Category category) {
// return categoryRepository.save(category);
// }

// @Override
// public Category updateCategory(Long id, Category category) {
// if (categoryRepository.existsById(id)) {
// category.setCategoryId(id);
// return categoryRepository.save(category);
// }
// return null;
// }

// @Override
// public void deleteCategory(Long id) {
// categoryRepository.deleteById(id);
// }
// }
