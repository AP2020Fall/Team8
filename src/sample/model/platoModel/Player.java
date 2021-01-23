package sample.model.platoModel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Player{
    private int point;
    private ArrayList<String> platoMessages;
    private ArrayList<Suggestion> suggestions;
    private ArrayList<Player> friends;
    private ArrayList<Player> friendRequest;
    private Set<String> favoriteGames;
    private int reversiAndWinsCounts = 0;
    private int reversiScore;
    private boolean isReversiFav;
    private boolean isDBFav;
    private int DBScore;
    private int dotsAndBoxesAndWinsCount = 0;
    private int reversiPlayedCounts = 0;
    private int dotsAndBoxesPlayedCounts = 0;
    private static ArrayList<Player> allPlayers = new ArrayList<>();
    private ArrayList<GameReq> gameReqs;

    public void addFriend() {

    }

    private String name;
    private String lastName;
    private String userName;
    private String accountID;
    private String passWord;
    private String email;
    private String phone;
    private LocalDateTime platoAge;


    public void setDetails(String name, String lastName, String accountID, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.accountID = accountID;
        this.email = email;
        this.phone = phone;
    }

    public void setReversiFav(boolean reversiFav) {
        isReversiFav = reversiFav;
    }

    public boolean isReversiFav() {
        return isReversiFav;
    }

    public boolean isDBFav() {
        return isDBFav;
    }

    public void setDBFav(boolean DBFav) {
        isDBFav = DBFav;
    }

    //for scoreboards
    public void setReversiScore(int reversiScore) {
        this.reversiScore = reversiScore;
    }

    public void setDBScore(int DBScore) {
        this.DBScore = DBScore;
    }

    public int getReversiScore() {
        return reversiScore;
    }

    public int getDBScore() {
        return DBScore;
    }

    public Player getPlayerWithId(String Id) {
        for (Player player : allPlayers) {
            if (player.getAccountID().equals(Id))
                return player;
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getPlatoAge() {
        return platoAge;
    }


    public void setPlatoAge() {
        this.platoAge = LocalDateTime.now();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<GameReq> getGameReqs() {
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

    public ArrayList<Suggestion> getSuggestions() {
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
        this.userName=username;
        this.passWord=password;
        suggestions = new ArrayList<>();
        favoriteGames = new LinkedHashSet<String>();
        friendRequest = new ArrayList<>();
        friends = new ArrayList<>();
        allPlayers.add(this);

    }

    public String getUserName() {
        return userName;
    }

    public String statistic() {
        int winsTotal = reversiAndWinsCounts + dotsAndBoxesAndWinsCount;
        long noOfDaysBetween = ChronoUnit.DAYS.between(getPlatoAge(), LocalDateTime.now());
        return "numbers of friends:" + friends.size() + " wins count:" + winsTotal + " plato age: " + noOfDaysBetween;

    }


    public static Player getPlayerWithUser(String username) {
        for (Player player : allPlayers) {
            if (player.getUserName().equals(username))
                return player;
        }
        return null;
    }
}