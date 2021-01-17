package sample.controller.plato;
import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.*;

public class AccountsMenu {
    private static Account account;
    private boolean isLogin;
    public static String viewAccountInfo(){
        return account.toString();
    }
    public static void changePassWord(String password){
        account.setPassWord(password);
    }
    public static int passwordValidation(String oldPassword, String newPass){
        if (!account.getPassWord().equals(oldPassword))   {
            return 1;
        }
        else if (newPass.length()<8||newPass.length()>26)
            return 7;
        else{
            changePassWord(newPass);
            return 8;
        }
    }


    public static int editField(String field, String value){
        if (field.equalsIgnoreCase("name")){
            account.setName(value);
            return 4;
        }
        else if (field.equalsIgnoreCase("lastname")){
            account.setLastName(value);
            return 4;
        }
        else if (field.equalsIgnoreCase("userid")){
            account.setAccountID(field);
            return 4;
        }
        else if (field.equalsIgnoreCase("email")){
            if (value.matches("^.+@.+$")){
                account.setEmail(value);
                return 4;
            }
            else return 5;

        }
        else if (field.equalsIgnoreCase("phone no")){
            if (value.matches("\\d{11}")){
                account.setPhone(value);
                return 4;
            }
            else return 6;
        }
        return 2;

    }
    public static String viewPlatoStatistics(){
        if (account instanceof Player){

        }
        else
        return "your not a player";

        return null;
    }

    public static void setAccount(Account account) {
        AccountsMenu.account = account;
    }

    public static void logout(){
        FirstMenuFx.setLoggedInAdmin(null);
        FirstMenuFx.setLoggedInPlayer(null);
        setAccount(null);
        PlayerMenu.setPlayer(null);
        AdminMenu.setAdmin(null);
      //  CommandProcessor.setMainCommandStatus(null);
        //CommandProcessor.setMainMenuStatus(null);
    }
    public static void gameNameValidation(String name){}
    public static void showGameHistory(){}
    public static void showGameStatistics(String gameName){}

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
