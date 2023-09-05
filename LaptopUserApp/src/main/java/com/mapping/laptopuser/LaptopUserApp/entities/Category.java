package com.mapping.laptopuser.LaptopUserApp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_category")
public class Category {

	@Id
	private String cid;

	private String categoryName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();

	public Category(String cid, String categoryName, List<Product> products) {
		super();
		this.cid = cid;
		this.categoryName = categoryName;
		this.products = products;
	}

	public Category() {
		super();
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
