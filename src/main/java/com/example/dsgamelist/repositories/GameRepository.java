package com.example.dsgamelist.repositories;

import com.example.dsgamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
