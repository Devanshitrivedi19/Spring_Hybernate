package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.entity.UserEntity;
import com.repository.userRepository;

@Controller
public class UserController 
{	
	
	userRepository userrepository;
	@GetMapping("/newuser")
	public String newUser()
	{
		return "NewUser";
	}	
	@PostMapping("/saveuser")
	public String saveUser(UserEntity user)
	{
		System.out.println(user.getEmail());
		
		userrepository.save(user);
		return "NewUser";
	}
}
