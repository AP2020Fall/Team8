package view;

public class OutputHandler {
    public void showAccountOutput(int outputNo){}
    public void showMainMenuOutput(int outputNo){}
    public void showAdminOutput(int outputNo){}
    public void showGamesMenuOutput(int outputNo){}
    public void showReversiOutput(int outputNo){}
    public static void showFriendsMenuOutput(int outputNo){}
    public static String showRegisterMenuOutput(int outputNo){
        //getinfo output
        if(outputNo==1)
            return "in order enter your name,lastName,email and phone number";
        //error output
        else if (outputNo==2)
            return "this username  has already exist";
        else if (outputNo==3)
            return "password length must be more than 8!";
        else if(outputNo==4)
            return "password length must be less than 26!";
        else if (outputNo==5)
            return "invalid email format!";
        else if (outputNo==6)
            return "invalid password format!";



    }
    public static void showGameMenuOutput(int outputNo){}

}
