package controller;

import model.Player;
import model.Reversi;

import java.awt.*;

public class ReversiController extends GameMenu {
    public void SaveDataInFile(){}
    public void ReadAndProcessCommands(){

    }
}
 class ReversiValidity {
    public static boolean isValidInput(int x1 , int y1 , Color color , Reversi.Board board){return true; }
    public static boolean canMakeNextMove(Reversi reversiGame , Player player){return true;}
}
 class ReversiEndProcess {
    public static void SaveData(Reversi reversiGame){}
    public void findWinner(Reversi reversiGame){}
    public static void setWinner(Reversi reversiGame){}
}
 class ReversiDataBase {
    public static void saveData(Reversi reversiGame){}
}


