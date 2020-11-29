package view;

import controller.RegisterMenu;
import model.Account;
import model.Admin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandProcessor {
    private Account loginAccount;
    private boolean isFirstRun=true;
    private static int output;
    private static MainCommandStatus mainCommandStatus;
    private static subMenuStatus subMenuStatus;
    private static MainMenuStatus mainMenuStatus=MainMenuStatus.RegisterMenu;

    public static void setOutput(int output) {
        CommandProcessor.output = output;
    }
    //public void

    public static void processRegister(){
        boolean isCompleted=false;
        while (!isCompleted){
            if (RegisterMenu.nameValidation())
        }
    }
    public static void runPlato(Scanner scanner){
        while (true){
            String command=scanner.nextLine();
            String[] splitCommand =command.split(" ");
            if (mainMenuStatus==MainMenuStatus.RegisterMenu){
                if(mainCommandStatus==MainCommandStatus.REGISTER_USERNAME){
                    if (RegisterMenu.nameValidation(splitCommand[1].split(",")[0])==1&&RegisterMenu.passwordValidation(splitCommand[1].split(",")[1])==1){
                        System.out.println(OutputHandler.showRegisterMenuOutput(1));

                    }
                }

            }
            else if (mainMenuStatus==MainMenuStatus.AccountMenu){
                if (mainCommandStatus==MainCommandStatus.VIEW_ACCOUNT_MENU){}
                else if(mainCommandStatus==MainCommandStatus.VIEW_PERSONAL_INFO){}
                else if(mainCommandStatus==MainCommandStatus.VIEW_PLATO_STATISTICS){}
                else if(mainCommandStatus==MainCommandStatus.GAMES_HISTORY){}
                else if(mainCommandStatus==MainCommandStatus.GAMES_STATISTICS){}
                else if(mainCommandStatus==MainCommandStatus.LOGOUT){}
            }
            else if (mainMenuStatus==MainMenuStatus.PlayerMenu){
                if (mainCommandStatus==MainCommandStatus.SHOW_POINTS){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_FAVORITE_GAMES){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_PLATOBOTS_MESSAGE){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_LAST_PLAYED){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_ADMINS_SUGGESTION){}
                else if (mainCommandStatus==MainCommandStatus.ADD_FRIEND){}
            }
            else if (mainMenuStatus==MainMenuStatus.AdminMenu){
                if (mainCommandStatus==MainCommandStatus.ADD_EVENT){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_EVENTS){}
                else if (mainCommandStatus==MainCommandStatus.ADD_SUGGESTION){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_SUGGESTIONS){}
                else if (mainCommandStatus==MainCommandStatus.VIEW_USERS){}

            }
            else if (mainMenuStatus==MainMenuStatus.FriendsMenu){
                 if (mainCommandStatus==MainCommandStatus.SHOW_FRIENDS){}
                else if (mainCommandStatus==MainCommandStatus.SHOW_FRIEND_REQUESTS){}
            }
            else if (mainMenuStatus==MainMenuStatus.GameMenu){
                if (mainCommandStatus==MainCommandStatus.SHOW_SCOREBOARD){}
                else if (mainCommandStatus==MainCommandStatus.DETAILS){}
                else if (mainCommandStatus==MainCommandStatus.SHOW_LOG){}
                else if (mainCommandStatus==MainCommandStatus.SHOW_WINS_COUNT){}
               else if (mainCommandStatus==MainCommandStatus.SHOW_PLAYED_COUNT){}
                else if (mainCommandStatus==MainCommandStatus.ADD_TO_FAVORITE){}
                else if (mainCommandStatus==MainCommandStatus.RUN_GAME){}
                else if (mainCommandStatus==MainCommandStatus.SHOW_POINTS){}

            }
            else if (mainMenuStatus==MainMenuStatus.GamesMenu){
                if (mainCommandStatus==MainCommandStatus.OPEN_GAME){

                }
            }
        }


    }
    public static boolean matchRegex(String command,String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(command);
        return matcher.find();

    }
    public void runReversi(){}
    public void runDB(){}
}
