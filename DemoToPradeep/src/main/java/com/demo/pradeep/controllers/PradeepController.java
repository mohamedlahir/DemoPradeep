package com.demo.pradeep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pradeep.Models.DemoAPOI;
import com.demo.pradeep.repos.UserRepository;

@RestController
public class PradeepController {

	@Autowired
	UserRepository userRepos;

	@GetMapping("/Get")
	public DemoAPOI hello(@RequestParam int id) {
		
		return userRepos.findById(id).get();
	}

	@PostMapping("/Post")
	public String hello1(@RequestBody DemoAPOI user) {
		userRepos.save(user);
		return "Created Succesfully";
	}

	@PutMapping("/put")
	public String putMapping() {

		return "Put Mapping";
	}

	@DeleteMapping("/delete")
	public String deleteMapping(@RequestHeader int deleteID) {
	userRepos.deleteById(deleteID);	
	return "Deleted";
	}
}
