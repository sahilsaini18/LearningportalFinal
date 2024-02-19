package com.learningportal.EfAcademy.mapper;

import org.mapstruct.Mapper;

import com.learningportal.EfAcademy.dto.RegisterUserDto;
import com.learningportal.EfAcademy.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	User registerUserDtoToUser(RegisterUserDto registerUser);

	RegisterUserDto userToRegisterUserDto(User user);
}
