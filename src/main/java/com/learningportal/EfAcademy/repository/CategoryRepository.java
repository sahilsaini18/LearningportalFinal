package com.learningportal.EfAcademy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learningportal.EfAcademy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
	 @Query(value = "SELECT * FROM category WHERE category_type = :category", nativeQuery = true)
	 Optional<Category> findByCategoryType(String category);
} 
