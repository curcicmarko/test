package com.curcic.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curcic.app.rest.models.User;
import com.curcic.app.rest.repo.UserRepo;

@RestController
public class ApiController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping(value= "/")
	public String getPage() {
		return "Welcome";
	}
	
	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	@PostMapping(value= "/save")
   public String saveUser(@RequestBody User user) {
	   
		repo.save(user);
		return "Saved ...";
   }
}
