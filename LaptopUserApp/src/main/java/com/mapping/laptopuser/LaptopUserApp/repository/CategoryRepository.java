package com.mapping.laptopuser.LaptopUserApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.laptopuser.LaptopUserApp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
