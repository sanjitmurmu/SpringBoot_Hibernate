package com.mapping.laptopuser.LaptopUserApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_address")
public class Address {
	
	@Id
	private int id;
	
	private String street;
	
	private String city;
	
	private String country;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public Address() {
		super();
	}
	public Address(int id, String street, String city, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
