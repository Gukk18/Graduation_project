package com.graduation.project.Service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.criteria.Order;


public interface OrderService {
    public Order create(JsonNode orderData);

    public Order findById(Long id);

    public List<Order> findByUsername(String username);
}