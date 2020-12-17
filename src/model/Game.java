package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    private String name;
    private String gameId;
    private HashMap<Player,Integer> allOfThisGamesPlayers=new HashMap<>();
    private GamePlayer playerOne;
    private GamePlayer playerTwo;
    private GameResult playerOneResult;
    private GameResult playerTwoResult;
    private boolean isFinished;
    private boolean isFavorite;
    private String gameDetail;

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

    public void updateScoreboard(){
        allOfThisGamesPlayers
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
