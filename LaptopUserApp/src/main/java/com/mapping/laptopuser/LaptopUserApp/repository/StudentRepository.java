package com.mapping.laptopuser.LaptopUserApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.laptopuser.LaptopUserApp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
