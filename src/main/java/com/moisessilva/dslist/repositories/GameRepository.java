package com.moisessilva.dslist.repositories;

import com.moisessilva.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
