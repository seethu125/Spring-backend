package com.api.employee.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	
	private @Id @GeneratedValue int productId;
	@NotNull
	private String productName;

	private String productUrl;
	
	private double productPrice;
	
	@Transient
	private int quantity;
	

}
