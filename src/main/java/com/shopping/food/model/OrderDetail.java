package com.shopping.food.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private LocalDateTime orderDate;
	private int userId;
	
	@ManyToOne
	@JoinColumn(name= "storeId")
	private Store store;
	
	private Double totalPrice;
	private String status;
}
