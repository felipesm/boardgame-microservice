package com.ifdeveloper.boardgamemicroservice.bgworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifdeveloper.boardgamemicroservice.bgworker.entities.BoardGame;
import com.ifdeveloper.boardgamemicroservice.bgworker.repositories.BoardGameRepository;

@RestController
@RequestMapping("/boardgames")
public class BoardGameResource {

	@Autowired
	private BoardGameRepository repository;
	
	@GetMapping
	public ResponseEntity<List<BoardGame>> findAll() {
		List<BoardGame> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BoardGame> findById(@PathVariable Long id) {
		BoardGame boardGame = repository.findById(id).get();
		return ResponseEntity.ok(boardGame);
	}
}
