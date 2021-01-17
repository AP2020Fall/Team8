package sample.model.platoModel;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Game {
    private String name;
    private Player player;
   // private String gameId;
    private static Set<Game> allGames=new LinkedHashSet<>();
    private HashMap<Player, Integer> allOfThisGamesPlayers=new HashMap<>();
   // private GamePlayer playerOne;
    //private GamePlayer playerTwo;
  //  private GameResult playerOneResult;
   // private GameResult playerTwoResult;
    //private boolean isFinished;
    private boolean isFavorite;
    private String gameDetail;

    public void setName(String name) {
        this.name = name;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public void setGameDetail(String gameDetail) {
        this.gameDetail = gameDetail;
    }

    public String getName() {
        return name;
    }


    public Set<Game> getAllGames() {
        return allGames;
    }

    public HashMap<Player, Integer> getAllOfThisGamesPlayers() {
        return allOfThisGamesPlayers;
    }


    public boolean isFavorite() {
        return isFavorite;
    }

    public String getGameDetail() {
        return gameDetail;
    }

    public Game(String name, Player player, boolean isFavorite, String gameDetail) {
        this.name = name;
        this.player = player;
        this.isFavorite = isFavorite;
        this.gameDetail = gameDetail;
    }

    public static Game getGameWithName(String gameName){
        for (Game game : allGames) {
            if (game.getName().equalsIgnoreCase(gameName))
                return game;
        }
        return null;
    }

    public void updateScoreboard(Player player,int score){
        int preScore=allOfThisGamesPlayers.get(player);
        allOfThisGamesPlayers.replace(player,preScore+score);}
}
