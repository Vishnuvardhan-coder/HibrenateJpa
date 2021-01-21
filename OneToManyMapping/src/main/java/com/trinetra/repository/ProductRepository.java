package com.trinetra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
