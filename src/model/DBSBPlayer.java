package model;

import java.util.ArrayList;

public class DBSBPlayer {
    private Player player;
    private int totalScore;
    private static ArrayList<DBSBPlayer> allDbPlayers=new ArrayList<>();

    public DBSBPlayer(Player player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
        allDbPlayers.add(this);
    }

    public static ArrayList<DBSBPlayer> getAllDbPlayers() {
        return allDbPlayers;
    }
}
