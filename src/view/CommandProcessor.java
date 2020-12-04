package view;

import controller.LoginMenu;
import controller.RegisterMenu;
import model.Account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandProcessor {
    private Account loginAccount;
    private boolean isFirstRun=true;
    private static int output;
    private static MainCommandStatus mainCommandStatus=null;
    private static SubCommandStatus subCommandStatus =null;
    private static MainMenuStatus mainMenuStatus=MainMenuStatus.RegisterMenu;
    //todolist: error ha,regex megexa, age admin e ashghal accountesho pak kone chi?!,new kardan login account ro ye check bokon,
    // jahayi ke lazeme subcom haro null karde bash!;
    //plato bot message ro az kojam biaram?!

    public static void setOutput(int output) {
        CommandProcessor.output = output;
    }
    //public void
   /* public static void  setMainCommandStatusMenu(String command){
        if(command.equals("Show friends"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIENDS;
        else if (command.equals("Show friend requests"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIEND_REQUESTS;

    }*/
    public static void setMainCommandStatus(String command){
        // register menu commands
          if (command==("Register .+,.+"))
            mainCommandStatus=MainCommandStatus.REGISTER_USERNAME;
          //login menu
        else if(command==("Delete .+"))
            mainCommandStatus=MainCommandStatus.DELETE_USERNAME;
        else if (command==("Login .+"))
            mainCommandStatus=MainCommandStatus.LOGIN_USERNAME;
        //player menu
          else if(command==("Show Points"))
              mainCommandStatus=MainCommandStatus.SHOW_POINTS;
          else if (command==("View favorite games"))
              mainCommandStatus=MainCommandStatus.VIEW_FAVORITE_GAMES;
          else if(command==("View platobot's message"))
              mainCommandStatus=MainCommandStatus.VIEW_PLATOBOTS_MESSAGE;
          else if (command==("View last played"))
              mainCommandStatus=MainCommandStatus.VIEW_LAST_PLAYED;
          else if (command==("View admin's suggestions"))
              mainCommandStatus=MainCommandStatus.VIEW_ADMINS_SUGGESTION;
          else if (command==("Choose suggested game"))
              mainCommandStatus=MainCommandStatus.CHOOSE_SUGGESTED_GAME;
          //admin
          //regex event o check bokn
          else if (command==("Add event .+,.+,.+,\\d+"))
              mainCommandStatus=MainCommandStatus.ADD_EVENT;
          else if (command==("View events"))
              mainCommandStatus=MainCommandStatus.VIEW_EVENTS;
          else if (command==("Add suggestion .+,.+"))
              mainCommandStatus=MainCommandStatus.ADD_SUGGESTION;
          else if (command==("View suggestions"))
              mainCommandStatus=MainCommandStatus.VIEW_SUGGESTIONS;
          else if (command==("View users"))
              mainCommandStatus=MainCommandStatus.VIEW_USERS;
          //gamesss
          else if (command==("Open .+"))
              mainCommandStatus=MainCommandStatus.OPEN_GAME;
          //gamee menu
          else if (command==("Show scoreboard"))
              mainCommandStatus=MainCommandStatus.SHOW_SCOREBOARD;
          else if (command==("Details"))
              mainCommandStatus=MainCommandStatus.DETAILS;
          else if (command==("Show log"))
              mainCommandStatus=MainCommandStatus.SHOW_LOG;
          else if (command==("Show wins count"))
              mainCommandStatus=MainCommandStatus.SHOW_WINS_COUNT;
          else if (command==("Show played count"))
              mainCommandStatus=MainCommandStatus.SHOW_PLAYED_COUNT;
          else if (command==("Add to favorties"))
              mainCommandStatus=MainCommandStatus.ADD_TO_FAVORITE;
          else if (command==("Run game"))
              mainCommandStatus=MainCommandStatus.RUN_GAME;
          else if (command==("Show points"))
              mainCommandStatus=MainCommandStatus.SHOW_POINTS_GAME;
          //account menu
          else if (command==("View account menu"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command==("View personal info"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command==("View plato statistics"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command==("Games history"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command==("Game statistics .+"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command==("Logout"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;

        //friends menu commands
        else  if(command==("Show friends"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIENDS;
        else if (command==("Show friend requests"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIEND_REQUESTS;
        else if(command.equals("Add .+"))
            mainCommandStatus=MainCommandStatus.ADD_FRIEND;
        //



    }
    public static void setShowReqSub(String command){
        if(command.matches("Add .+ "))
            subCommandStatus = SubCommandStatus.ADD_USERNAME;
        else if (command.equals("Accept .+"))
            subCommandStatus =SubCommandStatus.ACCEPT_USERNAME;
        else if (command.equals("Decline .+"))
            subCommandStatus=SubCommandStatus.DECLINE_USERNAME;
    }
    public static void setFriendsMenuStatus(String command){
        if(command.equals("Show friends"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIENDS;
        else if (command.equals("Show friend requests"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIEND_REQUESTS;

    }
    public static void runPlato(Scanner scanner){
        while (true){
            String command=scanner.nextLine();
            String[] splitCommand =command.split(" ");
            setMainCommandStatus(command);
            if (mainMenuStatus==MainMenuStatus.RegisterMenu){
                if(mainCommandStatus==MainCommandStatus.REGISTER_USERNAME){
                    String user=splitCommand[1].split(",")[0],password=splitCommand[1].split(",")[1];
                    if (RegisterMenu.userPassValidation(user,password)==1){
                        System.out.println(OutputHandler.showRegisterMenuOutput(1));
                        subCommandStatus=SubCommandStatus.GET_REGISTER_INFO;
                    }
                    else{
                        System.out.println(RegisterMenu.userPassValidation(user,password));
                        subCommandStatus=null;
                    }
                    if (subCommandStatus==SubCommandStatus.GET_REGISTER_INFO){
                        if(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2],splitCommand[3])==9)
                            RegisterMenu.registerAccount(user,password,splitCommand[0],splitCommand[1],splitCommand[2],splitCommand[3]);
                    }
                    else
                        System.out.println(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2],splitCommand[3]));

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
            else if(mainMenuStatus==MainMenuStatus.LoginMenu){
                if (mainCommandStatus==MainCommandStatus.DELETE_USERNAME){
                    String user=splitCommand[1];
                    if (LoginMenu.userIDValidation(user)==4){
                        subCommandStatus=SubCommandStatus.GET_PASSWORD;
                    }
                    else
                        System.out.println(LoginMenu.userIDValidation(user));
                    if(subCommandStatus==SubCommandStatus.GET_PASSWORD){
                        if ()
                    }

                }
                else if (mainCommandStatus==MainCommandStatus.LOGIN_USERNAME){}
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
