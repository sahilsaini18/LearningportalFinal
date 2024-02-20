package com.learningportal.EfAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learningportal.EfAcademy.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT * FROM user_details WHERE email = :eml", nativeQuery = true)
	User findThroughEmail(@Param("eml") String email);
	
	
	
	
}
