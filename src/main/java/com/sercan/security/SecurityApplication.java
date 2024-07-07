package com.sercan.security;

import com.sercan.security.dto.CreateUserRequest;
import com.sercan.security.model.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sercan.security.service.UserService;

import java.util.Set;

@SpringBootApplication
public class SecurityApplication{

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}

