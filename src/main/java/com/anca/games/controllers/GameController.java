package com.anca.games.controllers;

import com.anca.games.dto.GameDTO;
import com.anca.games.entities.Game;
import com.anca.games.services.GameService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> result = gameService.findAll();
        return ResponseEntity.ok(result);
    }
}
