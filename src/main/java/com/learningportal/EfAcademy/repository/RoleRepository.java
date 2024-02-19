package com.learningportal.EfAcademy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningportal.EfAcademy.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByRoleType(String roletype);
}
