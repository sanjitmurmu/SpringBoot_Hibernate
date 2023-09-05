package com.mapping.laptopuser.LaptopUserApp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_product")
public class Product {
	
	@Id
	private String pid;
	
	private String productName;
	
	@ManyToMany(mappedBy = "products")
	private List<Category> categories = new ArrayList<>();

	public Product() {
		super();
	}

	public Product(String pid, String productName, List<Category> categories) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.categories = categories;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
}
