package com.shopping.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.food.model.OrderDetail;

public interface IOrderDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
