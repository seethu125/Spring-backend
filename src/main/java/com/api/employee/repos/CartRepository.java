package com.api.employee.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.employee.entities.Cart;

public interface CartRepository  extends JpaRepository<Cart, Integer>{
	
	@Query("SELECT c FROM Cart c WHERE c.emailId = :email")
	Optional<Cart> findCartByEmail(String email);

}