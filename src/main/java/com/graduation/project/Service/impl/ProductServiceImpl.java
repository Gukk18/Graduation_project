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
    public List<Product> fillAll() {
        return productDAO.findAll();
    }
}
