package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ReversiGame
{
    private ArrayList<ReversiGame> allGames ;
    private LocalDateTime date ;
    private Player player1 ;
    private Player player2 ;
    private Player currentPlayer ;
    private Player winner = null;
    private int gameID ;
    private Board board;
    private Boolean GameIsOnGoing  ;
    public ReversiGame(Player player1 ){
        LocalDateTime myDate = LocalDateTime.now();
        this.setGameIsOnGoing(true);
        this.date = myDate;
        this.player1 = player1;
        this.player1.setPlayerNum(1);
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("ssddMMyyyy");
        this.gameID =Integer.parseInt(myDateFormat.toString());
        this.currentPlayer = player1;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public void switchCurrentPlayer(){
        if (this.getCurrentPlayer() == player1){
            this.setCurrentPlayer(this.getPlayer2());
        }else if (this.getCurrentPlayer() == player2){
            this.setCurrentPlayer(this.getPlayer1());
        }
    }
    public int getGameID() {
        return gameID;
    }
    public Player getWinner() {
        return winner;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
        this.player2.setPlayerNum(2);
    }
    public ArrayList<ReversiGame> getAllGames() {
        return allGames;
    }
    public void saveGame(int gameID){
    }

    public void setWinner(Player winner) {
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
