package com.ifdeveloper.boardgamemicroservice.bguser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifdeveloper.boardgamemicroservice.bguser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
