package com.graduation.project.Service.impl;

import com.graduation.project.DAO.CategoryDAO;
import com.graduation.project.Model.Category;
import com.graduation.project.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(String id) {
        return categoryDAO.findById(id).get();
    }

    @Override
    public Category create(Category category) {
        return categoryDAO.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryDAO.save(category);
    }

    @Override
    public void delete(String id) {
        categoryDAO.deleteById(id);
    }
}
