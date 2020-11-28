package model;

import java.util.ArrayList;
import java.util.Date;

public class Reversi extends Game {
    public Reversi(String gameId, GamePlayer playerOne, GamePlayer playerTwo) {
        super(gameId, playerOne, playerTwo);
    }

    private ArrayList<Reversi> allGames ;
    private Date date ;
    private Player player1 ;
    private Player player2 ;
    private int winner ;
    private int gameID ;
    private Board board;
    private Boolean GameIsOnGoing ;
    private int turn;

    public Date getDate() {
        return date;
    }

    public int getGameID() {
        return gameID;
    }

    public int getWinner() {
        return winner;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getTurn() {
        return turn;
    }
    public void incrementTurn(){
        turn++;
    }
    public ArrayList<Reversi> getAllGames() {
        return allGames;
    }
    public void saveGame(int gameID){
    }

    public void setWinner(int winner) {
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
    public class Board {
        private int[][] Board = new int[8][8];
        private int lastX , lastY;
        public int[][] getBoard() {
            return Board;
        }

        public void setLastX(int lastX) {
            this.lastX = lastX;
        }

        public void setLastY(int lastY) {
            this.lastY = lastY;
        }

        public int getLastX() {
            return lastX;
        }

        public int getLastY() {
            return lastY;
        }
    }
}
