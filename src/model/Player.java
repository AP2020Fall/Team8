package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends  Account {
    private ArrayList<String> suggestions;
    private  ArrayList<Player> friends;
    private  ArrayList<Request> friendRequest;
    private ArrayList<Game> favoriteGames;
    private ArrayList<Integer> reversiAndWinsCounts;
    private ArrayList<Integer> dotsAndBoxesAndWinsCount;
    private ArrayList<Integer> reversiPlayedCounts;
    private ArrayList<Integer> dotsAndBoxesPlayedCounts;
    private static ArrayList<Player> allPlayers;
    public void addFriend(){}

    public static ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }

    public ArrayList<Player> getFriends() {
        return friends;
    }

    public Player(String name, String lastName, String accountID, String passWord, ArrayList<String> suggestions) {
        super(name, lastName, accountID, passWord);
        this.suggestions = suggestions;
    }


    public static Player getPlayerWithUser(String username){
        for (Player player : allPlayers) {
            if (player.getUserName()==username)
                return player;
        }
        return null;
    }
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }
}
