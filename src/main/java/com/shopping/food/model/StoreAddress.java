package com.shopping.food.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class StoreAddress {
	
	private String storeStreet;
	private String storeCity;
	private String storeState;
}
