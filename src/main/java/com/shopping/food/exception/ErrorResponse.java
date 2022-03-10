package com.shopping.food.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	
	

	public ErrorResponse(String message, String statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	private static final long serialVersionUID = 1L;

	private  String message;
	
	private  String statusCode;
	
}
