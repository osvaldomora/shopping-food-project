package com.shopping.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Data {
	
	private UserDto data;

	public UserDto getData() {
		return data;
	}

	public void setData(UserDto data) {
		this.data = data;
	}
	
	
	

}
