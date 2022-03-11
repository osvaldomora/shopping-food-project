package com.shopping.food.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String name;
	private String password;
	private String email;
	private String phoneNo;
	@Embedded
	private Address address;
	
	 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	    @JoinColumn(name = "user_id")
/*	@OneToMany(
			mappedBy = "user",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			,fetch=FetchType.EAGER
			)*/
	 private List<OrderDetail> details;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	


}


