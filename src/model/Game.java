package model;

import java.util.ArrayList;

public class Game {
    private String name;
    private String gameId;
    private ArrayList<Player> allOfThisGamesPlayers;
    private GamePlayer playerOne;
    private GamePlayer playerTwo;
    private GameResult playerOneResult;
    private GameResult playerTwoResult;
    private boolean isFinished;
    private boolean isFavorite;

    public String getName() {
        return name;
    }

    public Game(String gameId, GamePlayer playerOne, GamePlayer playerTwo) {
        this.gameId = gameId;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        isFinished=false;
        //if (!allOfThisGamesPlayers.contains(pla))
    }

    public void setPlayerOneResult(GameResult playerOneResult) {
        this.playerOneResult = playerOneResult;
    }

    public void setPlayerTwoResult(GameResult playerTwoResult) {
        this.playerTwoResult = playerTwoResult;
    }
    public void endGame(){
        isFinished=true;
    }
}
