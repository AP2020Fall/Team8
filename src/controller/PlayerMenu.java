package controller;

import model.Game;
import model.Player;
import model.Request;

public class PlayerMenu {
    private Player player;
    public String showPoints(){
        return String.valueOf(player.getPoint()) ;
    }
    public void viewFavoriteGames(){

    }
    //hame view ha miran tu khode view fuck u
    public void viewPlatobotsMessage(){}
    public void viewLastPlayed(){}
    public void viewAdminsSuggestion(){}
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

}
