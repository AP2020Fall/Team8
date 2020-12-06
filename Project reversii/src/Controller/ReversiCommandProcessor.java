package Controller;

import Model.Player;
import Model.ReversiGame;
import View.BoardVisual;

import java.awt.*;

public class ReversiCommandProcessor {
    public  void Place(int x1 , int y1 , Color color){}
    public static void ShowTurn(ReversiGame reversiGame){}
    public static void ProcessCommand(String input , ReversiGame reversiGame){
        String[] splittedInput ;
        if (input.equals("end of my turn")){
            reversiGame.switchCurrentPlayer();
        }else if (input.equals("show grid")){
            BoardVisual.showBoardNull();
        }else if (input.equals("show disks")){
            // should code for BoardVisual. by colored 0's
        }else if (input.equals("Who is next?")){
            System.out.println("its player "+ reversiGame.getCurrentPlayer().getUsername() +"'s turn!");
        }else if (input.equals("show score")){
            System.out.println();
        }

    }

}
