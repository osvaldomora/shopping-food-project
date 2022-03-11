package com.shopping.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.food.model.OrderDetail;
import com.shopping.food.model.User;

public interface IOrderDetailRepository extends JpaRepository<OrderDetail, Integer>{
	
//	List<OrderDetail> findByUser(User user);

}
