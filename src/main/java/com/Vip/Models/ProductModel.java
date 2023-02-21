package com.Vip.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ProductModel {

	@Id
	private long id;
	private String type;
	private String price;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
