package com.example.dsgamelist.dtos.gamelist;

import com.example.dsgamelist.entities.GameList;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity, this);
    }

}
