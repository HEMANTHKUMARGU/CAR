package com.example.SpringJdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControlerClass {
	@Autowired
	private UserRepository userrepo;
	
	@PostMapping
	public Users createUser(@RequestBody Users user)
	{
		return userrepo.save(user);
	}
	@GetMapping
	public List<Users> getAllUsers()
	{
		List<Users> users = userrepo.findAll();
		return users;
	}
	@GetMapping("/{id}")
	public Users getUser(@PathVariable int id)
	{
		 Users user = userrepo.findById(id).get();
		 
		 return user;
	}
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id)
	{
		userrepo.deleteById(id);
		return "Deleted";
	}
	

}
