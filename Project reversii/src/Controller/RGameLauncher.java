package Controller;

import Model.ReversiGame;

import java.util.Scanner;

public class RGameLauncher {
    static Scanner scanner = new Scanner(System.in);
    public static void launchGame(ReversiGame reversiGame){
        RAskinfo.AskPrimaryQuestions(reversiGame);
        while (reversiGame.getGameIsOnGoing()){
            ReversiCommandProcessor.ProcessCommand(scanner.nextLine() , reversiGame);
        }
    }
}
