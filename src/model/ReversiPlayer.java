package model;

//import java.awt.*;
import java.awt.*;
import java.util.ArrayList;

public class ReversiPlayer {
    private Color color;
    private static ArrayList<ReversiPlayer> allplayers = new ArrayList<>();
    private int username;
    private int playerNum;
    private boolean hasMadeMove ;

    public ReversiPlayer(int username){
        this.username = username;
        allplayers.add(this);
    }
    public boolean hasmadeMove(){
        return hasMadeMove;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getUsername() {
        return username;
    }
}
