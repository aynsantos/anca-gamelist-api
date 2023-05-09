package com.anca.games.dto;

import com.anca.games.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }


}
