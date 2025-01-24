package com.moisessilva.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK belongingPK = new BelongingPK();

    private Integer position;

    public Belonging() {}

    public Belonging(Game game, GameList gameList, Integer position) {
        this.belongingPK.setGame(game);
        this.belongingPK.setGameList(gameList);
        this.position = position;
    }

    public BelongingPK getBelongingPK() {
        return belongingPK;
    }

    public void setBelongingPK(BelongingPK belongingPK) {
        this.belongingPK = belongingPK;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(belongingPK, belonging.belongingPK);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(belongingPK);
    }
}
