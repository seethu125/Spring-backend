package com.api.employee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	
	private @Id @GeneratedValue int productId;
	@NotNull
	private String productName;

	private String productUrl;

}
