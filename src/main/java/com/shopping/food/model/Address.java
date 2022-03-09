package com.shopping.food.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
	
	private String street;
	private String city;
	private String state;

}
