package com.anca.games.repository;

import com.anca.games.entities.Game;
import com.anca.games.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
