package com.anca.games.services;


import com.anca.games.dto.GameDTO;
import com.anca.games.entities.Game;
import com.anca.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll () {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x-> new GameDTO(x)).toList();
        return dto;
    }
}
