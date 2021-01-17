package sample.controller.plato;


import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import java.util.UUID;

public class RegisterMenu {
   // private Account toRegisterAccount;
    //public void register(){}
    private static int num;

    public static int getNum() {
        return num;
    }

    public static void userPassValidation(String username, String password,String email,String phone) {
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(username))){
           // CommandProcessor.setOutput(2);
            num= 2;
        }
        else if (password.length() < 9) {
            //CommandProcessor.setOutput(3);
            num= 3;
        } else if (password.length() > 26){
          //  CommandProcessor.setOutput(4);
            num= 4;}
            else if(!email.matches("^.+@.+$"))
                num= 7;
            else if (!phone.matches("\\d{11}"))
                num= 8;

        //user and password are right
        num= 9;
    }
    //account id ro random bezar
    public static void registerAccount(String username, String password, String name, String lastname, String email, String phone)throws NullPointerException {
        userPassValidation(username,password,email,phone);
        if (num==9){
        String uniqueID = UUID.randomUUID().toString();
        if (!Admin.isThereAdmin){
            FirstMenuFx.setLoggedInAdmin(Admin.getAccountWithId(username));
            addAdminDetails(registerAdmin(username,password),name,lastname,uniqueID,email,phone);
            Admin.adminId=username;
          //  CommandProcessor.setMainMenuStatus(MainMenuStatus.AdminMenu);
        }
        else {
            Player player=registerPlayer(username,password);
            addPlayerDetails(player,name,lastname,uniqueID,email,phone);
            player.setPlatoAge();
            //CommandProcessor.setMainMenuStatus(MainMenuStatus.PlayerMenu);
        }}
        Admin.isThereAdmin=true;
    }
    public static Player registerPlayer(String username, String password){
        Player player =new Player(username,password);
        return player;
    }
    public static Admin registerAdmin(String username, String password){
          Admin admin=new Admin(username,password);
                return admin;

          }
    public static void addAdminDetails(Admin admin, String name, String lastName, String accountID, String email, String phone){
        admin.setDetails(name,lastName,accountID,email,phone);
    }
    public static void addPlayerDetails(Player player, String name, String lastName, String accountID, String email, String phone){
        player.setDetails(name,lastName,accountID,email,phone);
    }

}
