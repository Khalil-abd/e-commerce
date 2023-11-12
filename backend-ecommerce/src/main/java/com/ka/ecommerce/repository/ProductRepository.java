package com.ka.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ka.ecommerce.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
