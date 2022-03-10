package com.shopping.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.food.constants.Constants;
import com.shopping.food.exception.ErrorResponse;
import com.shopping.food.exception.UserNotFoundException;
import com.shopping.food.model.request.UserReq;
import com.shopping.food.repository.IOrderDetailRepository;
import com.shopping.food.service.IUserService;

@RestController
@RequestMapping("/users/v1")
public class ControllerUser {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IOrderDetailRepository repo;
	
	
	
	@PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> users(@RequestBody UserReq userReq)  {

		System.out.println("osvaldo");
	
		return new ResponseEntity<>(userService.findByNameAndPassword(userReq.getName(), userReq.getPassword()), HttpStatus.OK);
	
	}
	
	
	@PostMapping(value = "/users2", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> users2(@RequestBody UserReq userReq)  {

		System.out.println("osvaldo");
	System.out.println(repo.findById(1).get());
		return new ResponseEntity<>(repo.findById(1).get(), HttpStatus.OK);
	
	}
	
	@PostMapping(value = "/users/{userId}/orderdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> enviaNotificacion(@PathVariable Integer userId)   {

		System.out.println("osvaldo");
	
//		return new ResponseEntity<>(userService.findByNameAndPassword(null, null)), HttpStatus.OK);
	
		return null;
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(UserNotFoundException ex)   {

		System.out.println("ErrorResponse:"+ex.getMessage());
		
		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(),Constants.USER_NOT_FOUND);//ex.getMessage(),Constants.USER_NOT_FOUND
		
		return new ResponseEntity<>(errorResponse, HttpStatus.OK);
	
	}
	
	
	
	

}
