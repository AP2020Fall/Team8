package sample.model.reversiModel;

import java.util.ArrayList;

public class ReversiPlayer {
    public  javafx.scene.paint.Color color;
    public static ArrayList<ReversiPlayer> allplayers = new ArrayList<>();
    private int wins, draws, looses;
    private int username;
    private int playerNum;
    public boolean hasMadeMove ;
    public ReversiPlayer(int username){
        allplayers.add(this);
        this.username=username;
        this.setColor(javafx.scene.paint.Color.RED);
        hasMadeMove = false;
    }
    public void setColor(javafx.scene.paint.Color color) {
        this.color = color;
    }
    public javafx.scene.paint.Color getColor() {
        return color;
    }
    public int getWins() {
        return wins;
    }
    public int getLooses() {
        return looses;
    }
    public int getDraws() {
        return draws;
    }
    public void won(){
        wins++;
    }
    public void lost(){
        looses++;
    }
    public void draw(){
        draws++;
    }
    public static ReversiPlayer getPlayerByUsername(int pUsername) {
        for (ReversiPlayer allplayer : allplayers) {
            if (allplayer.getUsername() == pUsername)
                return allplayer;
        }
        return null;
    }

    public void setHasMadeMove(boolean hasMadeMove) {
        this.hasMadeMove = hasMadeMove;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public ArrayList<ReversiPlayer> getAllPlayers() {
        return allplayers;
    }
    public int getUsername() {
        return username;
    }
}
