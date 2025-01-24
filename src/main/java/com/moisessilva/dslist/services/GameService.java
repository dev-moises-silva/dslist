package com.moisessilva.dslist.services;

import com.moisessilva.dslist.dto.GameMinDTO;
import com.moisessilva.dslist.entities.Game;
import com.moisessilva.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> gameList = gameRepository.findAll();
        List<GameMinDTO> gameMinDTOList = gameList.stream().map(game -> new GameMinDTO(game)).toList();
        return gameMinDTOList;
    }
}
