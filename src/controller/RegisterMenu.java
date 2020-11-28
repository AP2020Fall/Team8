package controller;

import model.Account;
import model.Admin;
import model.Player;
import view.CommandProcessor;

public class RegisterMenu {
    private Account toRegisterAccount;
    //public void register(){}
    public static int passwordValidation(String password) {
        if (password.length() < 9) {
            CommandProcessor.setOutput(3);
            return 3;
        } else if (password.length() > 26){
            CommandProcessor.setOutput(4);
            return 4;
    }
        return 1;
    }
    public static int nameValidation(String name){
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(name))){
            CommandProcessor.setOutput(2);
            return 2;
        }
        else
            return 1;
       // return null;
    }
    public static void registerAdmin(String username,String password){
        if (passwordValidation(password)<3){
            if (nameValidation(username)==1){
                Admin admin=new Admin(username,password);
            }

        }
    }
    public static void addAdminDetails(Admin admin,String name,String lastName,String accountID,String email,String phone){
        admin.setDetails(name,lastName,accountID,email,phone);
    }
    public static void registerPlayer(){}

}
