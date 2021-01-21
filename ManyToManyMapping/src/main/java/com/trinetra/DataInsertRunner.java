package com.trinetra;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.trinetra.entity.Roles;
import com.trinetra.entity.User;
import com.trinetra.repository.RolesRepository;
import com.trinetra.repository.UserRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RolesRepository rolesRepo;
	@Override
	public void run(String... args) throws Exception {

		Roles r1 = new Roles(101,"Comedian");
		Roles r2 = new Roles(102,"Hero");
		Roles r3= new Roles(103,"Villan");
		
		rolesRepo.save(r1);
		rolesRepo.save(r2);
		rolesRepo.save(r3);
		
		
		User u1 = new User(51,"Sunil","s@gmail.com",Arrays.asList(r1,r2));
		User u2 = new User(52,"Rana", "r@gmail.com",Arrays.asList(r2,r3));
		User u3 = new User(53,"KotaSrinivasRao","k@gmail.com",Arrays.asList(r1,r3));
		
		
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
		
	}

}
