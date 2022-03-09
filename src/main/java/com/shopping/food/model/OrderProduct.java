package com.shopping.food.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class OrderProduct {
	private Integer productId;
	private int quantity;
	private double productPrice;
}
