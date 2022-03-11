package com.shopping.food.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Embeddable
public class StoreAddress {
	
	private String storeStreet;
	private String storeCity;
	private String storeState;
	public String getStoreStreet() {
		return storeStreet;
	}
	public void setStoreStreet(String storeStreet) {
		this.storeStreet = storeStreet;
	}
	public String getStoreCity() {
		return storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	public String getStoreState() {
		return storeState;
	}
	public void setStoreState(String storeState) {
		this.storeState = storeState;
	}
	
}
