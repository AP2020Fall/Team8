package sample.model.platoModel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReversiGame {
    private ArrayList<ReversiGame> allGames;
    private LocalDateTime date;
    private ReversiPlayer player1;
    private ReversiPlayer player2;
    private ReversiPlayer currentPlayer;
    private ReversiPlayer winner = null;
    private boolean isGameEven = false;
    private int gameID;
    private Board board;
    private Boolean GameIsOnGoing;
    /*
    to start a game , you should first new a ReversiGame , and it only need a player to be constructed
    author : @bardia
    then the next move is to call RGameLauncher.launchGame(reversigame);
     */

    public ReversiGame(ReversiPlayer player1, ReversiPlayer player2, ReversiPlayer currentPlayer, int gameID, Board board, Boolean gameIsOnGoing) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        this.gameID = gameID;
        this.board = board;
        GameIsOnGoing = gameIsOnGoing;
    }

    /*   public ReversiGame(ReversiPlayer player1) {
            this.setGameIsOnGoing(true);
            this.player1 = player1;
            this.player1.setPlayerNum(1);
            this.gameID = (int) Math.random();
            this.currentPlayer = player1;
            this.board = new Board();
        }*/
    public void GameIsEven(){
        this.isGameEven=true;
    }
    public void setCurrentPlayer(ReversiPlayer currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public ReversiPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchCurrentPlayer() {
        if (this.getCurrentPlayer() == player1) {
            this.setCurrentPlayer(this.getPlayer2());
            currentPlayer.setHasMadeMove(false);
        } else if (this.getCurrentPlayer() == player2) {
            this.setCurrentPlayer(this.getPlayer1());
            currentPlayer.setHasMadeMove(false);
        }
    }
    public int getGameID() {
        return gameID;
    }

    public ReversiPlayer getWinner() {
        return winner;
    }

    public ReversiPlayer getPlayer1() {
        return player1;
    }

    public ReversiPlayer getPlayer2() {
        return player2;
    }

    public void setPlayer2(ReversiPlayer player2) {
        this.player2 = player2;
        this.player2.setPlayerNum(2);
    }

    public ArrayList<ReversiGame> getAllGames() {
        return allGames;
    }

    public void saveGame(int gameID) {
    }

    public void setWinner(ReversiPlayer winner) {
        this.winner = winner;
    }

    public void setGameIsOnGoing(Boolean gameIsOnGoing) {
        GameIsOnGoing = gameIsOnGoing;
    }

    public Boolean getGameIsOnGoing() {
        return GameIsOnGoing;
    }

    public Board getBoard() {
        return board;
    }
}
