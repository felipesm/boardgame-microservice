package com.ifdeveloper.boardgamemicroservice.bguser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ifdeveloper.boardgamemicroservice.bguser.entities.Users;
import com.ifdeveloper.boardgamemicroservice.bguser.repositories.UsersRepository;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {

	@Autowired
	private UsersRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id) {
		Users user = repository.findById(id).get();
		return ResponseEntity.ok(user);
	}
	
	@GetMapping(value = "/email")
	public ResponseEntity<Users> findByEmail(@RequestParam String email) {
		Users user = repository.findByEmail(email);
		return ResponseEntity.ok(user);
	}
}
