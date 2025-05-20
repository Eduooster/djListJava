package com.example.dsgamelist.controller;

import com.example.dsgamelist.dtos.game.GameMinDTO;
import com.example.dsgamelist.dtos.gamelist.GameListDTO;
import com.example.dsgamelist.services.GameListService;
import com.example.dsgamelist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }




    @GetMapping
    public List<GameListDTO> findall(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findbyList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
