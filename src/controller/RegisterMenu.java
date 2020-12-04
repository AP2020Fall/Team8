package controller;

import model.Account;
import model.Admin;
import model.Player;
import view.CommandProcessor;

public class RegisterMenu {
   // private Account toRegisterAccount;
    //public void register(){}
    public static int userPassValidation(String username,String password) {
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(username))){
            CommandProcessor.setOutput(2);
            return 2;
        }
        else if (password.length() < 9) {
            CommandProcessor.setOutput(3);
            return 3;
        } else if (password.length() > 26){
            CommandProcessor.setOutput(4);
            return 4;
    }
        return 1;
    }
    //account id ro random bezar
    public static int emailAndPhoneNumberValidation(String phone,String email){
        if(!email.matches(""))
            return 7;
        else if (!phone.matches(""))
            return 8;
        else
            return 9;
    }
    public static void registerAccount(String username,String password,String name,String lastname,String email,String phone){
        if (Admin.getAdmin().isEmpty()){
            addAdminDetails(registerAdmin(username,password),name,lastname,randomid,email,phone);
        }
        else {
            Player player=registerPlayer(username,password);
            addPlayerDetails(player,name,lastname,randomid,email,phone);
            player.setPlatoAge();
        }
    }
    public static Player registerPlayer(String username,String password){
        Player player =new Player(username,password);
        return player;
    }
    public static Admin registerAdmin(String username,String password){
          Admin admin=new Admin(username,password);
                return admin;

          }
    public static void addAdminDetails(Admin admin,String name,String lastName,String accountID,String email,String phone){
        admin.setDetails(name,lastName,accountID,email,phone);
    }
    public static void addPlayerDetails(Player player,String name,String lastName,String accountID,String email,String phone){
        player.setDetails(name,lastName,accountID,email,phone);
    }

}
