package controller;

import model.Account;
import model.Player;

public class LoginMenu {
    public static void deleteUserName(String user){
        Account.getAllAccounts().remove(Account.getAccountWithId(user));
    }
    public static int userIDValidation(String id){
        if(Player.getAllPlayers().contains(Player.getPlayerWithUser(id)))
            return 4;
        return 2;}
    public boolean processLoginValidation(){return true;}
    public static int correctPassword(String id,String password){
        if(Account.getAccountWithId(id).getPassWord()==password)
            return 9786754;
        else
            return 3;


    }
    public void setLoginAccount(){}
}
