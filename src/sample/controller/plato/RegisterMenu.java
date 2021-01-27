package sample.controller.plato;


import sample.controller.graphic.plato.FirstMenuFx;
import sample.controller.graphic.plato.RegisterMenuFx;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import javax.swing.*;
import java.util.Objects;
import java.util.UUID;

import static sample.model.platoModel.Admin.getAdminWithUser;

public class RegisterMenu {
   // private Account toRegisterAccount;
    //public void register(){}
    private static int num;

    private static boolean registered;
    public static int getNum() {
        return num;
    }

    public static void userPassValidation(String username, String password,String email,String phone) {
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(username))){
            num= 2;
        }
        else if (password.length() < 9)
            num= 3;
        else if (password.length() > 26)
            num= 4;
        else if(!email.matches("^.+@.+$"))
                num= 7;
        else if (!phone.matches("\\d{11}"))
                num= 8;
        else if (FirstMenuFx.getLoggedInPlayer()!=null || FirstMenuFx.getLoggedInAdmin()!=null)
                num=10;
        //user and password are right
        else
            num= 9;
    }
    //account id ro random bezar
    public static void registerAccount(String username, String password, String name, String lastname, String email, String phone)throws NullPointerException {
        registered=false;
        userPassValidation(username,password,email,phone);
        if (num==9){
        String uniqueID = UUID.randomUUID().toString();
        if (!Admin.isThereAdmin){
          registerAdmin(username,password,name,lastname,email,phone);
          Admin.adminId=username;
            FirstMenuFx.setLoggedInAdmin(getAdminWithUser(username));
            System.out.println(Admin.getAdmin().contains(getAdminWithUser(username)));
            System.out.println(Objects.requireNonNull(getAdminWithUser(username)).getPassWord());
            Admin.isThereAdmin=true;
            registered=true;
        }
        if (!registered){
           registerPlayer(username,password,name,lastname,email,phone);
            FirstMenuFx.setLoggedInPlayer(Player.getPlayerWithUser(username));
            registered=false;
            System.out.println(Player.getPlayerWithUser(username));

        }}
       // Admin.isThereAdmin=true;
    }
    public static void registerPlayer(String username, String password, String name, String lastName, String email, String phone){
        Player player= new Player(username,password);
        player.setDetails(name,lastName,UUID.randomUUID().toString(),email,phone);
        player.setPlatoAge();
    }
    public static void registerAdmin(String username, String password, String name, String lastName, String email, String phone){
         Admin admin=new Admin(username,password);
         admin.setDetails(name,lastName,UUID.randomUUID().toString(),email,phone);

          }

}
