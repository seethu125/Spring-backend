package com.api.employee.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employee.entities.Cart;
import com.api.employee.entities.ProductEntity;
import com.api.employee.models.CartModal;
import com.api.employee.repos.CartRepository;
import com.api.employee.repos.ProductRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Cart findCartByEmail(String email) {
		Cart cart =  cartRepository.findCartByEmail(email).orElseGet(() -> saveToCart(email));
		if(cart.getProducts()!=null)
		cart.getProducts().stream().collect(Collectors.groupingBy( p-> p, Collectors.counting()));	
		return cart;
	}

	private Cart saveToCart(String emailId) {
		Cart cr = new Cart();
		cr.setEmailId(emailId);
		return cartRepository.save(cr);
	}

	@Override
	public Cart saveProductsToCart(Cart cart) {
		return cartRepository.save(cart);
	}
}
