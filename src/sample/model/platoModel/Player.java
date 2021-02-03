package sample.model.platoModel;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Player{
    private int point;
    private ArrayList<PBMessage> platoMessages;
    private ArrayList<Suggestion> suggestions;
    private ArrayList<Player> friends;
    private ArrayList<Player> friendRequest;
    private Set<String> favoriteGames;
    private int reversiAndWinsCounts = 0;
    private int totalWins;
    private int reversiScore;
    private boolean isReversiFav;
    private boolean isDBFav;
    private int DBScore;
    private int dotsAndBoxesAndWinsCount = 0;
    private int reversiPlayedCounts = 0;
    private int dotsAndBoxesPlayedCounts = 0;
    private static ArrayList<Player> allPlayers = new ArrayList<>();
    private ArrayList<GameReq> gameReqs;
    private String status;
    private String name;
    private String lastName;
    private String userName;
    private String accountID;
    private String passWord;
    private String email;
    private String phone;
    private LocalDateTime platoAge;
    private long datesPassed;
    public static int LoginCount=0;

    private ArrayList<GameHistoryInfo> gameHistories;
    public Player(String username, String password) {
        this.userName=username;
        this.passWord=password;
        suggestions = new ArrayList<>();
        favoriteGames = new LinkedHashSet<>();
        friendRequest = new ArrayList<>();
        friends = new ArrayList<>();
        allPlayers.add(this);
        gameHistories=new ArrayList<>();
        platoMessages=new ArrayList<>();
        platoAge=LocalDateTime.now();
    }



    public void setDetails(String name, String lastName, String accountID, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.accountID = accountID;
        this.email = email;
        this.phone = phone;
    }
    public void setPlatoMessages(ArrayList<PBMessage> platoMessages) {
        this.platoMessages = platoMessages;
    }
    public void setSuggestions(ArrayList<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }
   public void setFriends(ArrayList<Player> friends) {
        this.friends = friends;
    }
    public void setFriendRequest(ArrayList<Player> friendRequest) {
        this.friendRequest = friendRequest;
    }

    public void setFavoriteGames(Set<String> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void setReversiAndWinsCounts(int reversiAndWinsCounts) {
        this.reversiAndWinsCounts = reversiAndWinsCounts;
    }

    public void setDotsAndBoxesAndWinsCount(int dotsAndBoxesAndWinsCount) {
        this.dotsAndBoxesAndWinsCount = dotsAndBoxesAndWinsCount;
    }

    public void setReversiPlayedCounts(int reversiPlayedCounts) {
        this.reversiPlayedCounts = reversiPlayedCounts;
    }

    public void setDotsAndBoxesPlayedCounts(int dotsAndBoxesPlayedCounts) {
        this.dotsAndBoxesPlayedCounts = dotsAndBoxesPlayedCounts;
    }

    public static void setAllPlayers(ArrayList<Player> allPlayers) {
        Player.allPlayers = allPlayers;
    }

    public void setGameReqs(ArrayList<GameReq> gameReqs) {
        this.gameReqs = gameReqs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPlatoAge(LocalDateTime platoAge) {
        this.platoAge = platoAge;
    }

    public void setGameHistories(ArrayList<GameHistoryInfo> gameHistories) {
        this.gameHistories = gameHistories;
    }

    public void setStatus(String status) {
        this.status = status;
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
    public void addReversiScore(int score,boolean win){
        reversiScore+=score;
        point+=score;
        reversiPlayedCounts++;
        if (win){
            reversiAndWinsCounts++;
            totalWins++;
        }

    }
    public void addDBScore(int score,boolean win){
        DBScore+=score;
        point+=score;
        dotsAndBoxesPlayedCounts++;
        if (win) {
            dotsAndBoxesAndWinsCount++;
            totalWins++;
        }
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

    public ArrayList<PBMessage> getPlatoMessages() {
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


    public ArrayList<GameHistoryInfo> getGameHistories() {
        return gameHistories;
    }

    public String getStatus() {
        return status;
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


    public long getDatesPassed() {
        return datesPassed;
    }

    public void setDatesPassed() {
        datesPassed= ChronoUnit.DAYS.between(LocalDate.now(), platoAge);

    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
}