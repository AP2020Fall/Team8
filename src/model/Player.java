package model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Player extends  Account {
    private int point;
    private  ArrayList<String> platoMessages;
    private Set<Suggestion> suggestions;
    private  ArrayList<Player> friends;
    private  ArrayList<Player> friendRequest;
    private Set<String> favoriteGames;
    private int reversiAndWinsCounts=0;
    private int dotsAndBoxesAndWinsCount=0;
    private int reversiPlayedCounts=0;
    private int dotsAndBoxesPlayedCounts=0;
    private static ArrayList<Player> allPlayers=new ArrayList<>();
    private  ArrayList<GameReq> gameReqs;
    public void addFriend(){}


    public Player getPlayerWithId(String Id){
        for (Player player : allPlayers) {
            if (player.getAccountID().equals(Id))
                return player;
        }
        return null;
    }
    public  ArrayList<GameReq> getGameReqs() {
        return gameReqs;
    }

    public int getPoint() {
        return point;
    }

    public ArrayList<String> getPlatoMessages() {
        return platoMessages;
    }


    public ArrayList<Player> getFriendRequest() {
        return friendRequest;
    }

    public Set<Suggestion> getSuggestions() {
        return suggestions;
    }

    public Set<String> getFavoriteGames() {
        return favoriteGames;
    }

    public int getReversiAndWinsCounts() {
        return reversiAndWinsCounts;
    }

    public int getDotsAndBoxesAndWinsCount() {
        return dotsAndBoxesAndWinsCount;
    }

    public int getReversiPlayedCounts() {
        return reversiPlayedCounts;
    }

    public int getDotsAndBoxesPlayedCounts() {
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
        suggestions=new LinkedHashSet<>();
        favoriteGames=new LinkedHashSet<String>();
        friendRequest=new ArrayList<>();
        friends=new ArrayList<>();
        allPlayers.add(this);

    }
    public String statistic(){
        int winsTotal=reversiAndWinsCounts+dotsAndBoxesAndWinsCount;
        long noOfDaysBetween = ChronoUnit.DAYS.between(getPlatoAge(), LocalDateTime.now());
        return "numbers of friends:"+friends.size()+" wins count:"+winsTotal+" plato age: "+noOfDaysBetween;

            }



    public static Player getPlayerWithUser(String username){
        for (Player player : allPlayers) {
            if (player.getUserName().equals(username))
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
