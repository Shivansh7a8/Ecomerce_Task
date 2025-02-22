package com.example.nimap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.nimap.entity.Category;
import com.example.nimap.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // ✅ Fetch paginated categories with products
    @GetMapping
    public Page<Category> getAllCategories(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return categoryService.getAllCategories(pageable);
    }

    // ✅ Fetch single category with products
    @GetMapping("/{categoryid}")
    public Category getCategoryById(@PathVariable Long categoryid) {
        return categoryService.getCategoryById(categoryid);
    }

    // ✅ Create a new category
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    // ✅ Update category
    @PutMapping("/{categoryid}")
    public Category updateCategory(@PathVariable Long categoryid, @RequestBody Category category) {
        return categoryService.updateCategory(categoryid, category);
    }

    // ✅ Delete category
    @DeleteMapping("/{categoryid}")
    public void deleteCategory(@PathVariable Long categoryid) {
        categoryService.deleteCategory(categoryid);
    }
}
