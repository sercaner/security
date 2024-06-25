package com.sercan.security;

import com.sercan.security.dto.CreateUserRequest;
import com.sercan.security.model.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sercan.security.service.UserService;

import java.util.Set;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {

	private final UserService userService;

	public SecurityApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createDummyData();
	}

	private void createDummyData() {
		CreateUserRequest request = CreateUserRequest.builder()
				.name("Hande Yener")
				.username("hande")
				.password("pass")
				.authorities(Set.of(Role.ROLE_USER))
				.build();
		userService.createUser(request);


		CreateUserRequest request2 = CreateUserRequest.builder()
				.name("Sercan Er")
				.username("sercan")
				.password("pass")
				.authorities(Set.of(Role.ROLE_ADMIN))
				.build();
		userService.createUser(request2);
	}
}

