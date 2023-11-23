package com.graduation.project.DAO;

import com.graduation.project.Model.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail,Long> {
}
