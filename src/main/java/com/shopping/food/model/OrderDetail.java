package com.shopping.food.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.shopping.food.enumeration.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private LocalDate orderDate;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;*/
//	private Integer storeId;
//	@ManyToOne
//	@JoinColumn(name= "storeId")
//	private Store store;
	@ElementCollection
	@JoinTable(name = "orderproducts", joinColumns = @JoinColumn(name = "orderDetailId"))
	private List<OrderProduct> orderProductList = new ArrayList<>();
	
	private Double totalPrice;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;//OrderStatus status;

	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", orderDate=" + orderDate +  ", orderProductList="
				+ orderProductList + ", totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	
	
	
}
