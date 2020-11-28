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
    private MainMenuStatus mainMenuStatus;
    private subMenuStatus subMenuStatus;

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
            if (matchRegex(command,"register ")){
                System.out.println("un lanatia ro vared kon aashghal");

            }
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}
            else if (matchRegex(command,"")){}



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
