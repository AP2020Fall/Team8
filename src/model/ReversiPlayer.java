package model;

import java.awt.*;
import java.util.ArrayList;

public class ReversiPlayer extends GamePlayer {
    private Color color ;
    private ArrayList<Player> allplayers ;
    private int wins , draws , looses ;
    private ArrayList<Reversi> Gamesplayed;
    private int username ;
    private int turnParity ;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLooses() {
        return looses;
    }

    public ArrayList<Reversi> getGamesPlayed() {
        return Gamesplayed;
    }

    public ArrayList<Player> getAllPlayers() {
        return allplayers;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }
  //  public static Player getPlayerByUsername(int username){    }
    public int getTurnParity() {
        return turnParity;
    }

    @Override
    public void increaseScore() {

    }

    @Override
    public void endTurn() {

    }

    public ReversiPlayer(Player player) {
        super(player);
    }

}

