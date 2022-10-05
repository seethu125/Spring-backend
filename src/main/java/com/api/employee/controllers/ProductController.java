package com.api.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.entities.ProductEntity;
import com.api.employee.repos.ProductRepository;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/list/products")
	public List<ProductEntity> listAllProducts() {
		return productRepository.findAll();		
	}
	
	@GetMapping("/list/product")
	public ProductEntity listProduct(@RequestParam int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/add/product")
	public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}
	
	@GetMapping("/delete/product")
	public void deleteProduct(@RequestParam int id) {
		 productRepository.findById(id).ifPresent(product -> productRepository.delete(product));
	}
}
