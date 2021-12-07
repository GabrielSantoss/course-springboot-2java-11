package com.glipsolutions.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glipsolutions.curse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
