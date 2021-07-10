package com.ifdeveloper.boardgamemicroservice.bgworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifdeveloper.boardgamemicroservice.bgworker.entities.BoardGame;

public interface BoardGameRepository extends JpaRepository<BoardGame, Long> {

}
