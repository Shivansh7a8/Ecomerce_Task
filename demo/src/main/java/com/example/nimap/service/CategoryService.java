// package com.example.nimap.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.PageRequest;
// import org.springframework.stereotype.Service;

// import com.example.nimap.entity.Category;
// import com.example.nimap.repository.CategoryRepository;

// import java.util.Optional;

// @Service
// public class CategoryService {

//     @Autowired
//     private CategoryRepository categoryRepository;

//     public Page<Category> getAllCategories(int page) {
//         return categoryRepository.findAll(PageRequest.of(page, 5));
//     }

//     public Category createCategory(Category category) {
//         return categoryRepository.save(category);
//     }

//     public Optional<Category> getCategoryById(Long categoryid) {
//         return categoryRepository.findById(categoryid);
//     }

//     public Category updateCategory(Long categoryid, Category newCategory) {
//         return categoryRepository.findById(categoryid).map(category -> {
//             category.setName(newCategory.getName());
//             return categoryRepository.save(category);
//         }).orElseThrow(() -> new RuntimeException("Category not found"));
//     }

//     public void deleteCategory(Long categoryid) {
//         categoryRepository.deleteById(categoryid);
//     }
// }
package com.example.nimap.service;

import com.example.nimap.entity.Category;
import com.example.nimap.repository.CategoryRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

// import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // ✅ Fetch paginated categories (including products)
    public Page<Category> getAllCategories(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    // ✅ Fetch single category with products
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    // ✅ Create category
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // ✅ Update category
    public Category updateCategory(Long id, Category newCategory) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(newCategory.getName());
                    category.setProducts(newCategory.getProducts());
                    return categoryRepository.save(category);
                })
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    // ✅ Delete category
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
