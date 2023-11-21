package com.graduation.project.DAO;

import com.graduation.project.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, String> {
}
