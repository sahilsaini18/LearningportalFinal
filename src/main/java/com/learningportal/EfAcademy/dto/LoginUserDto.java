package com.learningportal.EfAcademy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LoginUserDto {
    
	
	private String email;
	
	
	private String password;
}
