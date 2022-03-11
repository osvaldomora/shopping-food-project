package com.shopping.food.dto.service;

import org.springframework.stereotype.Service;

import com.shopping.food.dto.UserDto;
import com.shopping.food.model.User;


@Service
public class MappingService implements IMappingService{

	@Override
	public UserDto mappingUSer(User user) {
		//UserDto.builder().userId(user.getUserId()).message("Successful Login").statusCode("200 OK").build();
		UserDto us=new UserDto();
		us.setMessage("Successful Login");
		us.setStatusCode("200 OK");
		return us;
	}

}
