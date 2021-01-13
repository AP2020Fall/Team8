package model;

public class UserShow {
    private Player player;
    private String userName;
    private int score;
    private int datesPassed;
    private int winsCount;

    public UserShow(Player player, String userName, int score, int datesPassed, int winsCount) {
        this.player = player;
        this.userName = userName;
        this.score = score;
        this.datesPassed = datesPassed;
        this.winsCount = winsCount;
    }
}
