package controller;

import model.Game;
import model.GamePlayer;
import model.GameResult;
import model.Player;

public abstract class GameMenu {
    private Game game;
    private Player player;
    public void showScoreboard(){}
    public void showDetails(){}
    public void showGameLog(){}
    public String showWinsCount(){
        if (game.getName().equalsIgnoreCase("reversi"))
            return String.valueOf(player.getReversiAndWinsCounts());
        else if (game.getName().equalsIgnoreCase("dots and boxes"))
            return String.valueOf(player.getDotsAndBoxesAndWinsCount());
        return null;
    }
    public String showPlayedCount(){
        if (game.getName().equalsIgnoreCase("reversi"))
            return String.valueOf(player.getReversiPlayedCounts());
        else if (game.getName().equalsIgnoreCase("dots and boxes"))
            return String.valueOf(player.getDotsAndBoxesPlayedCounts());
        return null;
    }
    public abstract void runGame();
    public void addToFavorite(){}


}
