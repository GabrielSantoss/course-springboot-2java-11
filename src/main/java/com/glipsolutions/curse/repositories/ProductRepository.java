package com.glipsolutions.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glipsolutions.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}