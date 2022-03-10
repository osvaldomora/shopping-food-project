package com.shopping.food.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.food.dto.UserDto;
import com.shopping.food.dto.service.IMappingService;
import com.shopping.food.exception.UserNotFoundException;
import com.shopping.food.model.User;
import com.shopping.food.repository.IUserRepository;
import com.shopping.food.service.IUserService;
@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepo;
	@Autowired
	IMappingService mapping;
	
	@Override
	public UserDto findByNameAndPassword(String name, String pass) {
		
		User user=	userRepo.findByNameAndPassword(name, pass)
				.orElseThrow(() -> new UserNotFoundException("USer not found"));
		

		
		UserDto userDto=mapping.mappingUSer(user);
		System.out.println(userDto);
		return userDto;
	}

}
