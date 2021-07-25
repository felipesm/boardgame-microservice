package com.ifdeveloper.boardgamemicroservice.bgoauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ifdeveloper.boardgamemicroservice.bgoauth.entities.User;
import com.ifdeveloper.boardgamemicroservice.bgoauth.feignclient.BgUserFeignClient;

@Service
public class UserService implements UserDetailsService {
	
	private static Logger log = LoggerFactory.getLogger(UserService.class); 
	
	@Autowired
	private BgUserFeignClient bgUserFeignClient;
	
	public User findByEmail(String email) {
		User user = bgUserFeignClient.findByEmail(email).getBody();
		if (user == null) {
			log.error("Email não encontrado - {}", email);
			throw new IllegalArgumentException("Email não encontrado!");
		}
		log.info("Email encontrado - {}", email);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = bgUserFeignClient.findByEmail(username).getBody();
		if (user == null) {
			log.error("Email não encontrado - {}", username);
			throw new UsernameNotFoundException("Email não encontrado!");
		}
		log.info("Email encontrado - {}", username);
		return user;
	}
}
