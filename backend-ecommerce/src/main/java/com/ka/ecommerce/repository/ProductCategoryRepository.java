package com.ka.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ka.ecommerce.domain.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
