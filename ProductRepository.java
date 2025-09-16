package com.dpcart.dp_Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dpcart.dp_Store.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
