package com.shopping.food.service;

import com.shopping.food.dto.UserDto;



public interface IUserService {
	
	 UserDto findByNameAndPassword(String name, String pass) ;
	 
	 
	 

}
