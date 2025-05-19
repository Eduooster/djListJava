package com.example.dsgamelist.controller;


import com.example.dsgamelist.dtos.GameMinDTO;
import com.example.dsgamelist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping(value = "/games")
@RestController
public class GameController {


    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping

    public List<GameMinDTO> findAll(){

        return gameService.findAll().stream()
                .map(GameMinDTO::new)
                .toList();

    }


}
