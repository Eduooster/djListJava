package com.example.dsgamelist.dtos.game;

import com.example.dsgamelist.entities.Game;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private String shortDescription;
    private String imgUrl;
    private Integer year;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();

    }

    public GameMinDTO(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImage();
        year = projection.getYears();
        shortDescription = projection.getShortDescription();
    }

}
