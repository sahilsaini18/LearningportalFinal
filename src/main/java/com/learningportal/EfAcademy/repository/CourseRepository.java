package com.learningportal.EfAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningportal.EfAcademy.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
