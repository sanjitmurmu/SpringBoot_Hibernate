package com.mapping.laptopuser.LaptopUserApp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapping.laptopuser.LaptopUserApp.entities.Category;
import com.mapping.laptopuser.LaptopUserApp.entities.Product;
import com.mapping.laptopuser.LaptopUserApp.repository.CategoryRepository;
import com.mapping.laptopuser.LaptopUserApp.repository.ProductRepository;
import com.mapping.laptopuser.LaptopUserApp.repository.StudentRepository;

@SpringBootApplication
public class LaptopUserAppApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(LaptopUserAppApplication.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LaptopUserAppApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception {
		
//		One-to-One Mapping
		
//		Student student = new Student();
//		student.setStudentId(1);
//		student.setStudentName("Sanjit Murmu");
//		student.setAbout("I am as Software Engineer");
//		
//		Laptop laptop = new Laptop(1993, "as-562032", "ASUS", student);
//		student.setLaptop(laptop);
//		
//		Student save =  studentRepository.save(student);
//		
//		logger.info("Student saved id {}"+save.getStudentName());
		
//		Fetching user laptop
		
//		Student student = studentRepository.findById(1).get();
//		
//		logger.info("Student is {}",student.getStudentName());
//		
//		Laptop laptop = student.getLaptop();
//		
//		logger.info("laptop is {}",laptop.getBrand());
		
		//One To Many 
//		Student student = new Student();
//		student.setAbout("Data engineer");
//		student.setStudentId(2);
//		student.setStudentName("Rafa");
//		
//		Address address1 = new Address();
//		address1.setId(100);
//		address1.setCity("BLR");
//		address1.setCountry("IND");
//		address1.setStreet("55/454");
//		address1.setStudent(student);
//		
//		Address address2 = new Address();
//		address2.setId(101);
//		address2.setStreet("604/704");
//		address2.setCity("KOL");
//		address2.setCountry("IND");
//		address2.setStudent(student);
//		
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(address2);
//		addressList.add(address1);
//		
//		student.setAddressList(addressList);
//		
//		Student save = studentRepository.save(student);
//		
//		logger.info("Student name {}, city1 {}",save.getStudentName(),save.getAddressList().get(0).getCity());
		
		//Many To Many
		
		Product product1 = new Product();
		product1.setPid("pid1");
		product1.setProductName("IPhone 14 pro max");
		
		
		Product product2 = new Product();
		product2.setPid("pid2");
		product2.setProductName("Samsung galaxy 19");
		
		Product product3 = new Product();
		product3.setPid("pid3");
		product3.setProductName("LG Tv");
		
		Category category1 = new Category();
		category1.setCid("cid1");
		category1.setCategoryName("Electronics");
		List<Product> category1Products = category1.getProducts();
		
		Category category2 = new Category();
		category2.setCid("cid2");
		category2.setCategoryName("Mobile Phones");
		List<Product> category2Products = category2.getProducts();
		
		
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);
		
		category2Products.add(product1);
		category2Products.add(product2);
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
		
		
		
	}
	
	

}
