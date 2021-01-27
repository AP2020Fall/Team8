package sample.model.platoModel;

import java.util.ArrayList;
import java.util.StringJoiner;

public class UserShow {
   // private Player player;
    private String userName;
    private String score;
    private String datesPassed;
    private String winsCount;
    private static ArrayList<UserShow> allUserShows=new ArrayList<>();

    public UserShow(String userName, String score, String datesPassed, String winsCount) {
        this.userName = userName;
        this.score = score;
        this.datesPassed = datesPassed;
        this.winsCount = winsCount;
        allUserShows.add(this);
    }


    public static ArrayList<UserShow> getAllUserShows() {
        return allUserShows;
    }
}
