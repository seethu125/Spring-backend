package com.api.employee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.employee.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{


}