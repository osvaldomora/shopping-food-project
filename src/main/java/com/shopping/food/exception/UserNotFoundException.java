package com.shopping.food.exception;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	public UserNotFoundException(String message) {
		super(message);
		
		
		
	}
	
	

}
