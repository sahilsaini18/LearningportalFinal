package com.learningportal.EfAcademy.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learningportal.EfAcademy.entity.Courses;
import com.learningportal.EfAcademy.entity.Role;

import lombok.Data;

@Data
public class RegisterUserDto {
    
     private String name;
     
    
     private String email;
     
     private String password;
     
     private Set<Role> roles;
     
     private Set<Courses> courses;
}
