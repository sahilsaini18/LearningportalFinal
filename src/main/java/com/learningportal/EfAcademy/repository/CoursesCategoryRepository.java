package com.learningportal.EfAcademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningportal.EfAcademy.entity.Category;
import com.learningportal.EfAcademy.entity.CoursesCategory;

public interface CoursesCategoryRepository extends JpaRepository<CoursesCategory, Long> {
    
	List<CoursesCategory> findByCategory(Category category);
} 