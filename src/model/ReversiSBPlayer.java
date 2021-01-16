package model;

import java.util.ArrayList;

public class ReversiSBPlayer {
    private Player player;
    private int totalScore;
    private static ArrayList<ReversiSBPlayer> allRSBPlayers=new ArrayList<>();

    public ReversiSBPlayer(Player player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
        allRSBPlayers.add(this);
    }

    public static ArrayList<ReversiSBPlayer> getAllRSBPlayers() {
        return allRSBPlayers;
    }
}
