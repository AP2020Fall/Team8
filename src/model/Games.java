package model;

import java.util.ArrayList;

public class Games {
    Player player;
    ArrayList<Game> allGames;
    public  void showGames(){}

    @Override
    public String toString() {
        return "Games{" +
                "allGames=" + allGames +
                '}';
    }
}
