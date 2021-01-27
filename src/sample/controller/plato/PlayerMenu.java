package sample.controller.plato;

import sample.model.platoModel.Player;

public class PlayerMenu {
    private static Player player;

    public static void setPlayer(Player player) {
        PlayerMenu.player = player;
    }

    //hame view ha miran tu khode view fuck u
    public static void addFriend(String username){
        player.getFriendRequest().add(Player.getPlayerWithUser(username));
    }
    public static int friendUserValidation(String ID){
        if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(ID))){
            return 1;
        }
        else {
            addFriend(ID);
            return 2;
        }
    }

}
