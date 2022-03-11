package com.shopping.food.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Embeddable
@ToString
public class OrderProduct {
	private Integer productId;
	private int quantity;
	private double productPrice;
}
