package com.api.employee.models;

import java.util.List;
import java.util.Map;

import com.api.employee.entities.ProductEntity;

import lombok.Data;

@Data
public class CartModal {
	private  int cartId;
	
	private String emailId;
	
	private List<Integer> products;

	private Map<ProductEntity,Long> productMap;

}
