package controller;

import controller.GraphicController.FirstMenuFx;
import model.Account;
import model.Admin;
import model.Player;

import java.util.Objects;

public class LoginMenu {
    public static int getNum() {
        return num;
    }
    private static boolean isAdmin;
    private static int num;
    public static void deleteUserName(String user,String password){
        correctPassword(user,password);
        Account.getAllAccounts().remove(Account.getAccountWithId(user));
    }
    public static void correctPassword(String id,String password){
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(id)))
            num= 2;
         else if(!Objects.requireNonNull(Account.getAccountWithId(id)).getPassWord().equals(password))
            num= 3;
        else
            num= 1;


    }

    public static boolean isIsAdmin() {
        return isAdmin;
    }

    public static void setIsAdmin(boolean isAdmin) {
        LoginMenu.isAdmin = isAdmin;
    }

    public static void login(String id,String password){
        correctPassword(id,password);
        if (Admin.getAdmin().contains(Admin.getAccountWithId(id))){
            isAdmin=true;
       //     CommandProcessor.setMainMenuStatus(MainMenuStatus.AdminMenu);

            FirstMenuFx.loginAccount=Admin.getAdmin().get(0);
            AdminMenu.setAdmin(Admin.getAdmin().get(0));
            AccountsMenu.setAccount(Admin.getAdmin().get(0));
        }
        else{
            isAdmin=false;
            //CommandProcessor.setMainMenuStatus(MainMenuStatus.PlayerMenu);
            FirstMenuFx.loginAccount=Player.getPlayerWithUser(id);
            PlayerMenu.setPlayer(Player.getPlayerWithUser(id));
            AccountsMenu.setAccount(Player.getPlayerWithUser(id));
        }
    }
}
