package com.api.employee.controllers;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.entities.Cart;
import com.api.employee.entities.ProductEntity;
import com.api.employee.models.CartModal;
import com.api.employee.repos.CartRepository;
import com.api.employee.repos.ProductRepository;
import com.api.employee.service.CartService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@RestController
@CrossOrigin
public class CartController {
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CartService cartService;
	
	@GetMapping("/cart/get/all")
	public List<Cart> findAllCarts() {
		return cartRepository.findAll();
		
	}

	@PostMapping("/cart/save")
	public Cart saveToCart(@RequestBody Cart cart) {
		return cartService.saveProductsToCart(cart);		
	}
	
	@GetMapping("/cart/get")
	public Cart getCart(@RequestParam String emailId) {
		return cartService.findCartByEmail(emailZ LId);
	}
	
	@GetMapping("/cart/get/details")
	public List<ProductEntity> getCartProductDetails(@RequestParam List<Integer> ids) {
		 List<ProductEntity> productList = productRepository.findAllById(ids);
		 Set<ProductEntity> st = new HashSet<ProductEntity>(productList);
		 List<ProductEntity>  newProductList = st.stream().map(x ->{ x.setQuantity(Collections.frequency(ids, x.getProductId() )); return x;}).collect(Collectors.toList());
		 return newProductList;
	}
	
	
	
}
