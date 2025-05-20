package com.example.dsgamelist.dtos.game;

import com.example.dsgamelist.entities.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String longDescription;
    private String shortDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
