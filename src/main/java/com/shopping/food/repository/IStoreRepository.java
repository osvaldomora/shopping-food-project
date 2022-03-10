package com.shopping.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.food.model.OrderDetail;

public interface IStoreRepository extends JpaRepository<OrderDetail, Integer>{

}
