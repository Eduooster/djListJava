package com.example.dsgamelist.services;


import com.example.dsgamelist.dtos.gamelist.GameListDTO;
import com.example.dsgamelist.entities.GameList;
import com.example.dsgamelist.repositories.GameListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;


    public GameListService(GameListRepository repository) {
        this.gameListRepository = repository;
    }

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();

        return result.stream().map(GameListDTO::new)
                .toList();

    }
}
