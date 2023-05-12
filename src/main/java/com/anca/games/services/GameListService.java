package com.anca.games.services;



import com.anca.games.dto.GameListDTO;
import com.anca.games.entities.GameList;
import com.anca.games.repository.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll () {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x-> new GameListDTO(x)).toList();
        return dto;
    }
}
