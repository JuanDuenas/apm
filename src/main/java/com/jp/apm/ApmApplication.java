package com.jp.apm;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jp.apm.repository.RoleRepository;
import com.jp.apm.repository.UserRepository;
import com.jp.apm.domain.model.Role;
import com.jp.apm.domain.model.User;


@SpringBootApplication
public class ApmApplication implements CommandLineRunner {

	private final RoleRepository repositoryRole;
	private final UserRepository repositoryUser;

	public ApmApplication(RoleRepository repositoryRole, UserRepository repositoryUser) {
    	this.repositoryRole = repositoryRole;
    	this.repositoryUser = repositoryUser;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Role> roles = repositoryRole.findAll();
		List<User> users = repositoryUser.findAll();

		roles.forEach(role -> System.out.println("Role: " + role.getName()));
		users.forEach(user -> System.out.println("User: " + user.getName()));
	}
}
