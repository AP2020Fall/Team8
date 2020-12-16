package view;

import controller.AccountsMenu;
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

    public static void setMainMenuStatus(MainMenuStatus mainMenuStatus) {
        CommandProcessor.mainMenuStatus = mainMenuStatus;
    }

    // VIEW LASTPLAYED az player KAR DARE!!
    //todolist: error ha,regex megexa, age admin e ashghal accountesho pak kone chi?!,new kardan login account ro ye check bokon,
    // jahayi ke lazeme subcom haro null karde bash!;
    //plato bot message ro az kojam biaram?!
    //age yaru login kard bege gamereq dari
    //login o logout kamel
    //allplayer o inaro bayad new konam ya na?
    //unja ke az register set mikone koja bere bara faz haye dige
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
    public static void setMainCommandStatus(String command) {
        // register menu commands
          if (command.matches("Register .+,.+")){
            mainCommandStatus=MainCommandStatus.REGISTER_USERNAME;
            mainMenuStatus=MainMenuStatus.RegisterMenu;
          }
          //login menu
          else if(command.equalsIgnoreCase("View account menu")){
              mainMenuStatus=MainMenuStatus.AccountMenu;
          }
        else if(command.matches("Delete .+")){
            mainCommandStatus=MainCommandStatus.DELETE_USERNAME;
            mainMenuStatus=MainMenuStatus.LoginMenu;
        }
        else if (command.matches("Login .+")){
            mainMenuStatus=MainMenuStatus.LoginMenu;
            mainCommandStatus=MainCommandStatus.LOGIN_USERNAME;}
        //player menu
          else if(command.matches("Show Points"))
              mainCommandStatus=MainCommandStatus.SHOW_POINTS;
          else if (command.matches("View favorite games"))
              mainCommandStatus=MainCommandStatus.VIEW_FAVORITE_GAMES;
          else if(command.equals("View platobot's message"))
              mainCommandStatus=MainCommandStatus.VIEW_PLATOBOTS_MESSAGE;
          else if (command.equals("View last played"))
              mainCommandStatus=MainCommandStatus.VIEW_LAST_PLAYED;
          else if (command.equals("View admin's suggestions"))
              mainCommandStatus=MainCommandStatus.VIEW_ADMINS_SUGGESTION;
          else if (command.equals("Choose suggested game"))
              mainCommandStatus=MainCommandStatus.CHOOSE_SUGGESTED_GAME;
          //admin
          //regex event o check bokn
          else if (command.matches("Add event .+,.+,.+,\\d+"))
              mainCommandStatus=MainCommandStatus.ADD_EVENT;
          else if (command.equals("View events"))
              mainCommandStatus=MainCommandStatus.VIEW_EVENTS;
          else if (command.matches("Add suggestion .+,.+"))
              mainCommandStatus=MainCommandStatus.ADD_SUGGESTION;
          else if (command.equals("View suggestions"))
              mainCommandStatus=MainCommandStatus.VIEW_SUGGESTIONS;
          else if (command.equals("View users"))
              mainCommandStatus=MainCommandStatus.VIEW_USERS;
          //gamesss
          else if (command.matches("Open .+"))
              mainCommandStatus=MainCommandStatus.OPEN_GAME;
          //gamee menu
          else if (command.equals("Show scoreboard"))
              mainCommandStatus=MainCommandStatus.SHOW_SCOREBOARD;
          else if (command.equals("Details"))
              mainCommandStatus=MainCommandStatus.DETAILS;
          else if (command.equals("Show log"))
              mainCommandStatus=MainCommandStatus.SHOW_LOG;
          else if (command.equals("Show wins count"))
              mainCommandStatus=MainCommandStatus.SHOW_WINS_COUNT;
          else if (command.equals("Show played count"))
              mainCommandStatus=MainCommandStatus.SHOW_PLAYED_COUNT;
          else if (command.equals("Add to favorites"))
              mainCommandStatus=MainCommandStatus.ADD_TO_FAVORITE;
          else if (command.equals("Run game"))
              mainCommandStatus=MainCommandStatus.RUN_GAME;
          else if (command.equals("Show points"))
              mainCommandStatus=MainCommandStatus.SHOW_POINTS_GAME;
          //account menu
          else if (command.equals("View account menu"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command.equals("View personal info"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command.equalsIgnoreCase("Change password .+,.+")&&mainCommandStatus.equals(MainCommandStatus.VIEW_PERSONAL_INFO)){
              subCommandStatus=SubCommandStatus.CHANGE_PASSWORD;
          }
          else if (command.equalsIgnoreCase("edit .+,.+")&&mainCommandStatus.equals(MainCommandStatus.VIEW_PERSONAL_INFO)){
              subCommandStatus=SubCommandStatus.EDIT_FIELD;
          }
          else if (command.equals("View plato statistics"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command.equals("Games history"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command.matches("Game statistics .+"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;
          else if (command.equals("Logout"))
              mainCommandStatus=MainCommandStatus.ADD_FRIEND;

        //friends menu commands
        else  if(command.equals("Show friends"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIENDS;
        else if (command.equals("Show friend requests"))
            mainCommandStatus=MainCommandStatus.SHOW_FRIEND_REQUESTS;
        else if(command.matches("Add .+"))
            mainCommandStatus=MainCommandStatus.ADD_FRIEND;
        //
        else if (command.equalsIgnoreCase("exit"))
            System.exit(0);


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
               // System.out.println("ma tu registerim gusale");
                if(mainCommandStatus.equals(MainCommandStatus.REGISTER_USERNAME)){
                    String user=splitCommand[1].split(",")[0],password=splitCommand[1].split(",")[1];
                   // System.out.println("input gereftm");
                    if (RegisterMenu.userPassValidation(user,password)==1){
                        System.out.println(OutputHandler.showRegisterMenuOutput(1));
                        subCommandStatus=SubCommandStatus.GET_REGISTER_INFO;
                    }
                    else{
                        System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.userPassValidation(user,password)));
                        subCommandStatus=null;
                    }
                        if (subCommandStatus==SubCommandStatus.GET_REGISTER_INFO) {
                            boolean isCompleted=false;
                            while (!isCompleted){
                            splitCommand = scanner.nextLine().split(" ");
                                if (RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3]) == 9) {
                                RegisterMenu.registerAccount(user, password, splitCommand[0], splitCommand[1], splitCommand[2], splitCommand[3]);
                                System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));
                                isCompleted=true;
                            }   else {
                                System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));

                            }}}
                           /* getRegsterinfo:{
                            if (scanner.hasNextLine()) {
                                splitCommand = scanner.nextLine().split(" ");
                                int r = splitCommand.length;
                                for (int i = 0; i < r; ++i) {
                                    System.out.println(splitCommand[i]);
                                }
                                if (RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3]) == 9) {
                                    RegisterMenu.registerAccount(user, password, splitCommand[0], splitCommand[1], splitCommand[2], splitCommand[3]);
                                    System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));
                                } else {
                                    System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));
                                    continue getRegsterinfo;
                                }}
                            }
                       */ }




            }
            else if (mainMenuStatus==MainMenuStatus.AccountMenu){
                 if(mainCommandStatus==MainCommandStatus.VIEW_PERSONAL_INFO){
                     System.out.println(AccountsMenu.viewAccountInfo());
                     if (subCommandStatus==SubCommandStatus.CHANGE_PASSWORD){
                         boolean isCompleted=false;
                         while (!isCompleted){
                             splitCommand = scanner.nextLine().split(" ");
                             if (AccountsMenu.editField()== 9) {
                                 RegisterMenu.registerAccount(user, password, splitCommand[0], splitCommand[1], splitCommand[2], splitCommand[3]);
                                 System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));
                                 isCompleted=true;
                             }   else {
                                 System.out.println(OutputHandler.showRegisterMenuOutput(RegisterMenu.emailAndPhoneNumberValidation(splitCommand[2], splitCommand[3])));

                             }}
                     }
                     else if (subCommandStatus==SubCommandStatus.EDIT_FIELD){

                     }
                 }
                else if(mainCommandStatus==MainCommandStatus.VIEW_PLATO_STATISTICS){
                     System.out.println(AccountsMenu.viewPlatoStatistics());
                 }
                else if(mainCommandStatus==MainCommandStatus.GAMES_HISTORY){}
                else if(mainCommandStatus==MainCommandStatus.GAMES_STATISTICS){}
                else if(mainCommandStatus==MainCommandStatus.LOGOUT){
                    AccountsMenu.Logout();
                 }
            }
            else if(mainMenuStatus==MainMenuStatus.LoginMenu){
                String user=splitCommand[1];
                if (mainCommandStatus==MainCommandStatus.DELETE_USERNAME){
                    if (LoginMenu.userIDValidation(user)==4){
                        System.out.println(OutputHandler.showLoginMenuOutput(LoginMenu.userIDValidation(user)));
                        subCommandStatus=SubCommandStatus.GET_PASSWORD;
                    }
                    else
                        System.out.println(OutputHandler.showLoginMenuOutput(LoginMenu.userIDValidation(user)));
                    if (subCommandStatus==SubCommandStatus.GET_PASSWORD){
                        boolean isComplete=false;
                        while (!isComplete){
                            String password=scanner.nextLine();
                            if(LoginMenu.correctPassword(user,password)==3){
                                System.out.println(OutputHandler.showLoginMenuOutput(3));
                            }
                            else {
                                System.out.println(OutputHandler.showLoginMenuOutput(1));
                                LoginMenu.deleteUserName(user);
                                isComplete=true;
                            }
                        }


                    }

                }
                else if (mainCommandStatus==MainCommandStatus.LOGIN_USERNAME){
                        if (LoginMenu.userIDValidation(user)==4){
                            System.out.println(OutputHandler.showLoginMenuOutput(LoginMenu.userIDValidation(user)));
                            subCommandStatus=SubCommandStatus.GET_PASSWORD;
                        }
                        else
                            System.out.println(OutputHandler.showLoginMenuOutput(LoginMenu.userIDValidation(user)));
                    if (subCommandStatus==SubCommandStatus.GET_PASSWORD){
                    boolean isComplete=false;
                    while (!isComplete){
                        String password=scanner.nextLine();
                        if(LoginMenu.correctPassword(user,password)==3){
                            System.out.println(OutputHandler.showLoginMenuOutput(3));
                        }
                        else {
                            System.out.println(OutputHandler.showLoginMenuOutput(1));
                            LoginMenu.deleteUserName(user);
                            isComplete=true;
                        }}
                    }
                }
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
