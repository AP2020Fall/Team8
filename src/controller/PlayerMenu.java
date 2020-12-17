package controller;

import model.Account;
import model.Game;
import model.Player;
import model.Request;

public class PlayerMenu {
    private static Player player;

    public static void setPlayer(Player player) {
        PlayerMenu.player = player;
    }

    public static String showPoints(){
        return String.valueOf(player.getPoint()) ;
    }
    public static StringBuilder viewFavoriteGames(){
        StringBuilder favGames=new StringBuilder();
        for (Game game : player.getFavoriteGames()) {
            favGames.append(game.getName()+"  ");
        }
        return favGames;

    }
    //hame view ha miran tu khode view fuck u
    public static String  viewPlatobotsMessage(){
        return player.getPlatoMessages().toString();
    }
    public static String viewLastPlayed(){
        return
    }
    public static String  viewAdminsSuggestion(){
        return player.getSuggestions().toString();
    }
    public static void chooseSuggestedGame(){}
    public static void addFriend(String username){
        Request request=new Request(player,Player.getPlayerWithUser(username));
        request.setPending(true);
    }
    public static int friendUserValidation(String ID){
        if (!Player.getAllAccounts().contains(Player.getPlayerWithUser(ID))){
            return 1;
        }
        else {
            addFriend(ID);
            return 2;
        }
    }

}
