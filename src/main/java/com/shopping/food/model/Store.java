package com.shopping.food.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer storeId;
	@Embedded
	private StoreAddress storeAddress;
	private String rating;
		@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="StoreProduct",
			   joinColumns = @JoinColumn(name="idStore"),
			   inverseJoinColumns = @JoinColumn(name="idProduct")			
			)
	private List<Product> products;
	private LocalTime openTill;
	private String storeDescription;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)//,fetch=FetchType.EAGER
	    @JoinColumn(name = "store_id")
	 private List<OrderDetail> details;

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public StoreAddress getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public LocalTime getOpenTill() {
		return openTill;
	}

	public void setOpenTill(LocalTime openTill) {
		this.openTill = openTill;
	}

	public String getStoreDescription() {
		return storeDescription;
	}

	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
	
	
}
