package com.shopping.food.dto.service;

import org.springframework.stereotype.Service;

import com.shopping.food.dto.UserDto;
import com.shopping.food.model.User;


@Service
public class MappingService implements IMappingService{

	@Override
	public UserDto mappingUSer(User user) {
//		UserDto us=new UserDto();
		return UserDto.builder().userId(user.getUserId()).message("Successful Login").statusCode("200 OK").build();
	}

}
