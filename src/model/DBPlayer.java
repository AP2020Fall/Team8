package model;

import java.util.ArrayList;

public class DBPlayer extends GamePlayer {
    public DBPlayer(Player player) {
        super(player);
    }

    private ArrayList<Player> players = new ArrayList<Player>();

    public boolean isMyTurn;

    public void getPlayer(){}

    public void setPlayer(){}

    public void getUserName(){}

    public void setUserName(){}

    @Override
    public void endTurn(){}

    public void readTurn(){}

    public void showTurn(){}

    @Override
    public void increaseScore(){}

}
