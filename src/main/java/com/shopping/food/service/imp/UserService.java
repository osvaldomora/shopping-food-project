package com.shopping.food.service.imp;

import java.util.Optional;

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
		
		Optional<User> user=	userRepo.findByNameAndPassword(name, pass);
//				.orElseThrow(() -> new UserNotFoundException("User not found"));
		
        if(!user.isPresent())
		    throw new UserNotFoundException("User not found");
        
		UserDto userDto=mapping.mappingUSer(user.get());
		System.out.println(userDto);
		return userDto;
	}

}
