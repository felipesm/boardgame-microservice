package com.ifdeveloper.boardgamemicroservice.bguser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifdeveloper.boardgamemicroservice.bguser.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	Users findByEmail(String email);

}
