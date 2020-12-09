package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends  Account {
    private int point;
    private  ArrayList<String> platoMessages;
    private ArrayList<String> suggestions;
    private  ArrayList<Player> friends;
    private  ArrayList<Request> friendRequest;
    private ArrayList<Game> favoriteGames;
    private ArrayList<Integer> reversiAndWinsCounts;
    private ArrayList<Integer> dotsAndBoxesAndWinsCount;
    private ArrayList<Integer> reversiPlayedCounts;
    private ArrayList<Integer> dotsAndBoxesPlayedCounts;
    private static ArrayList<Player> allPlayers=new ArrayList<>();
    private   ArrayList<GameReq> gameReqs;
    public void addFriend(){}

    public  ArrayList<GameReq> getGameReqs() {
        return gameReqs;
    }

    public int getPoint() {
        return point;
    }

    public ArrayList<String> getPlatoMessages() {
        return platoMessages;
    }

    public ArrayList<String> getSuggestions() {
        return suggestions;
    }

    public ArrayList<Request> getFriendRequest() {
        return friendRequest;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public ArrayList<Integer> getReversiAndWinsCounts() {
        return reversiAndWinsCounts;
    }

    public ArrayList<Integer> getDotsAndBoxesAndWinsCount() {
        return dotsAndBoxesAndWinsCount;
    }

    public ArrayList<Integer> getReversiPlayedCounts() {
        return reversiPlayedCounts;
    }

    public ArrayList<Integer> getDotsAndBoxesPlayedCounts() {
        return dotsAndBoxesPlayedCounts;
    }

    public static ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }

    public ArrayList<Player> getFriends() {
        return friends;
    }

    public Player(String username, String password) {
        super(username,password);
        suggestions=new ArrayList<>();
        favoriteGames=new ArrayList<>();
        friendRequest=new ArrayList<>();
        friends=new ArrayList<>();
        reversiAndWinsCounts=new ArrayList<>();
        reversiPlayedCounts=new ArrayList<>();
        dotsAndBoxesAndWinsCount=new ArrayList<>();
        dotsAndBoxesPlayedCounts=new ArrayList<>();
        allPlayers.add(this);

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
