package com.api.employee.service;

import com.api.employee.entities.Cart;
import com.api.employee.models.CartModal;

public interface CartService {

	Cart findCartByEmail(String email);
	
	Cart saveProductsToCart(Cart cart);

}
