package sample.controller.plato;

import sample.model.platoModel.Player;

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
        for (String game : player.getFavoriteGames()) {
            favGames.append(game+"  ");
        }
        return favGames;

    }
    //hame view ha miran tu khode view fuck u
    public static String viewPlatobotsMessage(){
        return player.getPlatoMessages().toString();
    }
    public static void viewLastPlayed(){
    }
    public static String viewAdminsSuggestion(){
        return player.getSuggestions().toString();
    }
    public static void chooseSuggestedGame(){}
    public static void addFriend(String username){
        player.getFriendRequest().add(Player.getPlayerWithUser(username));
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
