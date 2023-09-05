package com.mapping.laptopuser.LaptopUserApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.laptopuser.LaptopUserApp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
