package Model;

import java.awt.*;
import java.security.PrivateKey;
import java.util.ArrayList;

public class Player {
    private Color color ;
    private static ArrayList<Player> allplayers ;
    private int wins , draws , looses ;
    private ArrayList<ReversiGame> Gamesplayed;
    private int username ;
    private int turnParity ;
    private int playerNum;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWins() {
        return wins;
    }

    public static Player getPlayerByUsername(int pUsername) {
        for (Player allplayer : allplayers) {
            if (allplayer.getUsername() == pUsername)
                return allplayer;
        }
        return null;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getDraws() {
        return draws;
    }

    public int getLooses() {
        return looses;
    }

    public ArrayList<ReversiGame> getGamesPlayed() {
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
    public int getTurnParity() {
        return turnParity;
    }
}
