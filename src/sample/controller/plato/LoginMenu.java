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
        if (num==4){
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(user)))
            Player.getAllPlayers().remove(Player.getPlayerWithUser(user));
        else Admin.getAdmin().remove(Admin.getAdminWithUser(user));
        }

    }
    public static void correctPasswordLogin(String id, String password) {
        //  boolean invalid = true;
        //   if (invalid) {
        if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(id))&&!Admin.getAdmin().contains(Admin.getAdminWithUser(id))) {
            System.out.println("not player");
            num = 2;

        } else if (Player.getAllPlayers().contains(Player.getPlayerWithUser(id))){
            if (!Player.getPlayerWithUser(id).getPassWord().equals(password)) {
                num = 3;

            } else {
                num = 4;
                return;
            }

        }
        else if (Admin.getAdmin().contains(Admin.getAdminWithUser(id))){
            if (!Admin.getAdminWithUser(id).getPassWord().equals(password)) {
                System.out.println("wrong pass?!");
                num = 3;
            } else{
                num = 4;
          }
        }
         else if (FirstMenuFx.getLoggedInAdmin()!=null||FirstMenuFx.getLoggedInPlayer()!=null)
            num=5;

    }


    /*    if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(id))&&!Admin.getAdmin().contains(Admin.getAdminWithUser(id)))
            num= 2;
        try{
          if(!Objects.requireNonNull(Player.getPlayerWithUser(id)).getPassWord().equals(password)&&!Objects.requireNonNull(Admin.getAdminWithUser(id)).getPassWord().equalsIgnoreCase(password))
            num= 3;
         else if(!Objects.requireNonNull(Admin.getAdminWithUser(id)).getPassWord().equalsIgnoreCase(password))
             num=3;
         else
             num=2;
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(3);

        }




    }*/

    public static void correctPasswordDelete(String id, String password){
        if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(id))) {
            System.out.println("not player");
            num = 2;
        } else {
            if (!Player.getPlayerWithUser(id).getPassWord().equals(password)) {
                num = 3;
            } else
                num = 1;
        }
        if (!Admin.getAdmin().contains(Admin.getAdminWithUser(id))) {
            System.out.println("no admin? ");
            num = 2;
        } else {
            if (!Admin.getAdminWithUser(id).getPassWord().equals(password)) {
                System.out.println("wrong pass?!");
                num = 3;
            } else
                num = 1;
        }
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
            AdminMenu.setAdmin(Admin.getAdmin().get(0));
            //AccountsMenu.setAccount(Admin.getAdmin().get(0));
        }
        else{
            isAdmin=false;
            FirstMenuFx.setLoggedInPlayer(Player.getPlayerWithUser(id));
            PlayerMenu.setPlayer(Player.getPlayerWithUser(id));
            FriendsMenu.setPlayer(Player.getPlayerWithUser(id));
          }
        }
    }
}
