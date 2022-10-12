package com.api.employee.entities;

import java.util.List;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cart {
	private @Id @GeneratedValue int cartId;
	
	@NotNull
	private String emailId;
	
	private List<Integer> products;

	private int quantity;
	
}
