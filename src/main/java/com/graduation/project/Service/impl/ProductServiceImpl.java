package com.graduation.project.Service.impl;

import com.graduation.project.DAO.ProductDAO;
import com.graduation.project.Model.Product;
import com.graduation.project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
    @Override
    public Product findById(Integer id) {
        return productDAO.findById(id).get();
    }

    @Override
    public List<Product> findByCategoryId(String cid) {
        return productDAO.findByCategoryId(cid);
    }

    @Override
    public Product create(Product product) {
        return productDAO.save(product);
    }

    @Override
    public Product update(Product product) {
        return productDAO.save(product);
    }

    @Override
    public void delete(Integer id) {
        productDAO.deleteById(id);

    }
}
