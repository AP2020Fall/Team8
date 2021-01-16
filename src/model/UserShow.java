package model;

import java.util.ArrayList;

public class UserShow {
    private Player player;
    private String userName;
    private int score;
    private int datesPassed;
    private int winsCount;
    private ArrayList<UserShow> allUserShows=new ArrayList<>();

    public UserShow(String userName, int score, int datesPassed, int winsCount) {
        this.userName = userName;
        this.score = score;
        this.datesPassed = datesPassed;
        this.winsCount = winsCount;
        allUserShows.add(this);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
