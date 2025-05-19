package com.example.dsgamelist.services;


import com.example.dsgamelist.entities.Game;
import com.example.dsgamelist.repositories.GameRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {


    private final  GameRepository gameRepository;


    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
