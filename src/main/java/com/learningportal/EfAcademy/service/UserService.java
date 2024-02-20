package com.learningportal.EfAcademy.service;

import org.springframework.stereotype.Service;

import com.learningportal.EfAcademy.dto.LoginUserDto;
import com.learningportal.EfAcademy.dto.RegisterUserDto;
import com.learningportal.EfAcademy.entity.Role;
import com.learningportal.EfAcademy.entity.User;
import com.learningportal.EfAcademy.mapper.UserMapper;
import com.learningportal.EfAcademy.repository.RoleRepository;
import com.learningportal.EfAcademy.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	private final UserRepository userRepository;

	private final RoleRepository roleRepository;

	private final UserMapper userMapper;

	public UserService(UserRepository userRepository, RoleRepository roleRepository, UserMapper userMapper) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.userMapper = userMapper;
	}

	public boolean registerUser(RegisterUserDto registerUser) {

		User user = userRepository.findByEmail(registerUser.getEmail());
		if (user != null)
			return false;

		user = userMapper.registerUserDtoToUser(registerUser);
		Role defaultRole = roleRepository.findByRoleType("Learner");

		if (defaultRole == null) {
			defaultRole = new Role();
			defaultRole.setRoleType("Learner");

			roleRepository.save(defaultRole);
		}
		user.getRoles().add(defaultRole);
		userRepository.save(user);

		return true;

	}

	public boolean loginUser(LoginUserDto loginUser) {

		try {
			User user = userRepository.findByEmail(loginUser.getEmail());
			RegisterUserDto userDetails = userMapper.userToRegisterUserDto(user);

			if (userDetails.getPassword().equals(loginUser.getPassword())) {
				log.info("User logged in successfully: {}", loginUser.getEmail());
				return true;
			} else {
				log.warn("User authentication failed for email: {}", loginUser.getEmail());
				return false;
			}
		} catch (Exception e) {
			log.error("Error occurred during user authentication.", e);
			return false;
		}
	}
}