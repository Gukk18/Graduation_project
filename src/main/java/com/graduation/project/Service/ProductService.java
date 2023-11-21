package com.graduation.project.Service;

import com.graduation.project.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    public Product findById(Integer id);

    public List<Product> findByCategoryId(String cid);

    public Product create(Product product);

    public Product update(Product product);

    public void delete(Integer id);

}
