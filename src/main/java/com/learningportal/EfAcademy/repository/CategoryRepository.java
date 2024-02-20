package com.learningportal.EfAcademy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learningportal.EfAcademy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Query(value = "SELECT * FROM category WHERE category_type = :ctg", nativeQuery = true)
	Optional<Category> findByCategoryType(@Param("ctg") String category);
}
