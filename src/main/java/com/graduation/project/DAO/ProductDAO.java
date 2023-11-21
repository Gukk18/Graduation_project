package com.graduation.project.DAO;


import com.graduation.project.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.category .id=?1")
    List<Product> findByCategoryId(String cid);
}
