package model;

public class Game {
    private String gameId;
    private GamePlayer playerOne;
    private GamePlayer playerTwo;
    private GameResult playerOneResult;
    private GameResult playerTwoResult;
    private boolean isFinished;
    private boolean isFavorite;

    public Game(String gameId, GamePlayer playerOne, GamePlayer playerTwo) {
        this.gameId = gameId;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        isFinished=false;
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
