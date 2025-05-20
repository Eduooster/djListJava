package com.example.dsgamelist.services;


import com.example.dsgamelist.dtos.game.GameDTO;
import com.example.dsgamelist.dtos.game.GameMinDTO;
import com.example.dsgamelist.dtos.game.GameMinProjection;
import com.example.dsgamelist.entities.Game;
import com.example.dsgamelist.repositories.GameRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class GameService {


    private final  GameRepository gameRepository;


    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameRepository.findById(id)
                .map(GameDTO::new)
                .orElseThrow(() -> new EntityNotFoundException("Jogo com ID " + id + " não encontrado"));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new)
                .toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);

        return result.stream().map(GameMinDTO::new)
                .toList();

    }


}
