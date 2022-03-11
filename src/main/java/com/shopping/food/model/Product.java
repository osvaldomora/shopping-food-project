package com.shopping.food.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.shopping.food.enumeration.Category;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	private Long price;
	private String description;
	@Enumerated(EnumType.STRING)
	private Category category;
	private Boolean isAvailable;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	/*  //If we have problems we use it
	 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)//,fetch=FetchType.EAGER
	    @JoinColumn(name = "product_id")
	 private List<Store> stores;*/
	
	
}
