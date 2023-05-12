package com.anca.games.controllers;


import com.anca.games.dto.GameListDTO;
import com.anca.games.dto.GameMinDTO;
import com.anca.games.services.GameListService;
import com.anca.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return ResponseEntity.ok(result);
    }





}

