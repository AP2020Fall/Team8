package controller;

import model.Account;
import model.Admin;
import model.Player;
import view.CommandProcessor;
import view.MainMenuStatus;

public class LoginMenu {
    public static void deleteUserName(String user){
        Account.getAllAccounts().remove(Account.getAccountWithId(user));
    }
    public static int userIDValidation(String id){
        if(Player.getAllPlayers().contains(Player.getPlayerWithUser(id)))
            return 4;
        return 2;}
    public static int correctPassword(String id,String password){
        if(Account.getAccountWithId(id).getPassWord()==password)
            return 9786754;
        else
            return 3;


    }
    public void setLoginAccount(String id){
        if (Admin.getAdmin().contains(Admin.getAccountWithId(id))){
            CommandProcessor.setMainMenuStatus(MainMenuStatus.AdminMenu);
            AdminMenu.setAdmin(Admin.getAdmin().get(0));
            AccountsMenu.setAccount(Admin.getAdmin().get(0));
        }
        else{
            CommandProcessor.setMainMenuStatus(MainMenuStatus.PlayerMenu);
            PlayerMenu.setPlayer
        }
    }
}
