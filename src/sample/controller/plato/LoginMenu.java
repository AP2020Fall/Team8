package sample.controller.plato;

import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.Account;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import java.util.Objects;

public class LoginMenu {
    public static int getNum() {
        return num;
    }
    private static Boolean isAdmin;
    private static int num;
    public static void deleteUserName(String user, String password){
        correctPasswordDelete(user,password);
        if (num==1){
        Account.getAllAccounts().remove(Account.getAccountWithId(user));
        }
    }
    public static void correctPasswordLogin(String id, String password){
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(id)))
            num= 2;
         else if(!Objects.requireNonNull(Account.getAccountWithId(id)).getPassWord().equals(password))
            num= 3;
        else
            num= 1;


    }

    public static void correctPasswordDelete(String id, String password){
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(id)))
            num= 2;
        else if(!Objects.requireNonNull(Account.getAccountWithId(id)).getPassWord().equals(password))
            num= 3;
        else
            num= 4;


    }

    public static boolean isIsAdmin() {
        return isAdmin;
    }

    public static void setIsAdmin(boolean isAdmin) {
        LoginMenu.isAdmin = isAdmin;
    }

    public static void login(String id, String password){
        correctPasswordLogin(id,password);
        if(num==4){
        if (id.equals(Admin.adminId)){
            isAdmin=true;
       //     CommandProcessor.setMainMenuStatus(MainMenuStatus.AdminMenu);
            FirstMenuFx.setLoggedInAdmin(Admin.getAdmin().get(0));
            FirstMenuFx.loginAccount=Admin.getAdmin().get(0);
            AdminMenu.setAdmin(Admin.getAdmin().get(0));
            AccountsMenu.setAccount(Admin.getAdmin().get(0));
        }
        else{
            isAdmin=false;
            //CommandProcessor.setMainMenuStatus(MainMenuStatus.PlayerMenu);
            FirstMenuFx.setLoggedInPlayer(Player.getPlayerWithUser(id));
            FirstMenuFx.loginAccount=Player.getPlayerWithUser(id);
            PlayerMenu.setPlayer(Player.getPlayerWithUser(id));
            FriendsMenu.setPlayer(Player.getPlayerWithUser(id));
            AccountsMenu.setAccount(Player.getPlayerWithUser(id));
          }
        }
    }
}
