package controller.reversiController;

import model.ReversiGame;

import java.util.Scanner;

public class RGameLauncher {
    static Scanner scanner = new Scanner(System.in);
    public static void launchGame(ReversiGame reversiGame){
        ReversiAskinfo.AskPrimaryQuestions(reversiGame);
        // after asking primary information such as : second player username and both players colors we go for a while loop which reads the commands until the game is finished
        while (reversiGame.getGameIsOnGoing()){
            String input =scanner.nextLine();
            ReversiCommandProcessor.ProcessCommand( input , reversiGame );
        }
        ReversiEndProcess.CalculatePointsAndSetWinner(reversiGame);
    }
}
