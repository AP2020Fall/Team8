package controller;

import model.Player;
import model.Request;

public class FriendsMenu {
    Player player;
    public void showFriends(){
        player.getFriends().toString();
    }
    public void showFriendReq(){
        player.getFriendRequest().toString();
    }
    public void processRemoveFriend(String friendId){
        Player.getPlayerWithUser(friendId).getFriends().remove(player);
        player.getFriends().remove(Player.getPlayerWithUser(friendId));
    }
    public void viewFriendProfile(){}
    public void processAcceptUser(String userId){
        player.getFriends().add(Player.getPlayerWithUser(userId));
        Player.getPlayerWithUser(userId).getFriends().add(player);
        player.getFriendRequest().remove(Player.getPlayerWithUser(userId));

    }
    public void processDeclineUser(String userId){
        player.getFriendRequest().remove(Player.getPlayerWithUser(userId));
    }
    public void addUsername(String userName){
        Player.getPlayerWithUser(userName).getFriendRequest().add(player);
    }
}
