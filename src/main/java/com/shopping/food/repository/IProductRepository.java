package com.shopping.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.food.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
