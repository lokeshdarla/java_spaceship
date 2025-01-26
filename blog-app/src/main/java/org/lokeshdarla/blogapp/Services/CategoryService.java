package org.lokeshdarla.blogapp.Services;

import org.lokeshdarla.blogapp.Models.Category;
import org.lokeshdarla.blogapp.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();
    }

    public Category saveCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    public Optional<Category> getCategoryById(String id) {
        return this.categoryRepository.findById(id);
    }

    public List<Category> getCategoriesByName(String name) {
        return this.getCategoriesByName(name);
    }


    public void deleteCategory(String id) {
        this.categoryRepository.deleteById(id);
    }
}
