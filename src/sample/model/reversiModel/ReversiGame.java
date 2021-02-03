package sample.model.reversiModel;

import sample.model.platoModel.GameHistoryInfo;
import sample.model.platoModel.GameResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReversiGame {
    private ArrayList<ReversiGame> allGames;
    private LocalDateTime date;
    private ReversiPlayer player1;
    private ReversiPlayer player2;
    private ReversiPlayer currentPlayer;
    private ReversiPlayer winner = null;
    private boolean isGameEven = false;
    private Board board;
    private Boolean GameIsOnGoing;
    /*
    to start a game , you should first new a ReversiGame , and it only need a player to be constructed
    author : @bardia
    then the next move is to call RGameLauncher.launchGame(reversigame);
    */
    public ReversiGame(ReversiPlayer player1 , ReversiPlayer player2) {
        LocalDateTime myDate = LocalDateTime.now();
        this.setGameIsOnGoing(true);
        this.date = myDate;
        this.player1 = player1;
        this.player2 = player2;
        this.player1.setPlayerNum(1);
        this.player2.setPlayerNum(2);
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("ssddMMyyyy");
        this.currentPlayer = player1;
        this.board = new Board();
    }
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

    public void saveGame( GameResult gameResult,ReversiPlayer reversiPlayer,int score) {
        GameHistoryInfo gameHistoryInfo=new GameHistoryInfo("Reversi",reversiPlayer.getPlayer(),date,gameResult);
        reversiPlayer.getPlayer().getGameHistories().add(gameHistoryInfo);
        int scoreplus=reversiPlayer.getPlayer().LoginCount;
        boolean win;
        win= gameResult.equals(GameResult.WIN);
        reversiPlayer.getPlayer().addReversiScore(score+scoreplus*5+reversiPlayer.getPlayer().getReversiPlayedCounts()*5,win);
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
