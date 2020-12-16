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

    public String showPoints(){
        return String.valueOf(player.getPoint()) ;
    }
    public StringBuilder viewFavoriteGames(){
        StringBuilder favGames=new StringBuilder();
        for (Game game : player.getFavoriteGames()) {
            favGames.append(game.getName()+"  ");
        }
        return favGames;

    }
    //hame view ha miran tu khode view fuck u
    public String  viewPlatobotsMessage(){
        return player.getPlatoMessages().toString();
    }
    public String viewLastPlayed(){
        return
    }
    public String  viewAdminsSuggestion(){
        return player.getSuggestions().toString();
    }
    public void chooseSuggestedGame(){}
    public int usernameValidation(String user){
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(user)))
            return 8976;
        else
            return 1;
    }
    public void addFriend(String username){
        Request request=new Request(player,Player.getPlayerWithUser(username));
        request.setPending(true);
    }
    public int friendUserValidation(String ID){
        if (!Player.getAllAccounts().contains(Player.getPlayerWithUser(ID))){
            return 1;
        }
        return 98767;
    }

}
