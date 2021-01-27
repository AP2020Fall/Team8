package sample.controller.plato;
import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.*;

public class AccountsMenu {


    public static int changePassword(String oldPassword, String newPass){
        if (FirstMenuFx.getLoggedInPlayer()!=null){
        Player account=FirstMenuFx.getLoggedInPlayer();
            if (!account.getPassWord().equals(oldPassword))   {
                return 1;
            }
            else if (newPass.length()<8||newPass.length()>26)
                return 7;
            else{
                account.setPassWord(newPass);
                return 8;
            }}
        else{ Admin account=FirstMenuFx.getLoggedInAdmin();
            if (!account.getPassWord().equals(oldPassword))   {
                return 1;
            }
            else if (newPass.length()<8||newPass.length()>26)
                return 7;
            else{
                account.setPassWord(newPass);
                return 8;
            }
        }

    }


    public static int editField(String field, String value){
        if(FirstMenuFx.getLoggedInPlayer()!=null){
        Player account=FirstMenuFx.getLoggedInPlayer();
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
        return 2;}
        else{ Admin account= FirstMenuFx.getLoggedInAdmin();
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
            else
                    return 2;
        }

    }

    public static void logout(){
        FirstMenuFx.setLoggedInAdmin(null);
        FirstMenuFx.setLoggedInPlayer(null);
       // setAccount(null);
        PlayerMenu.setPlayer(null);
        AdminMenu.setAdmin(null);
      //  CommandProcessor.setMainCommandStatus(null);
        //CommandProcessor.setMainMenuStatus(null);
        //ridam dahane in zendegi
    }

}
