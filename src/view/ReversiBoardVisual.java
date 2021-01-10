package view;

import model.*;


import java.awt.*;

public class ReversiBoardVisual {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static void showBoardNull(){
                for (int i = 0; i <= 7; i++) {
                        for (int j = 0; j <=7 ; j++) {
                                System.out.print(0 + "\t");
                        }
                        System.out.println();
                }
        }

        public static void showBoardWithDots(ReversiGame reversiGame){
                Color player1 = reversiGame.getPlayer1().getColor();
                Color player2 = reversiGame.getPlayer2().getColor();
                for (int y = 8; y >=1 ; y --) {
                        for (int x = 1; x <=8 ; x++) {
                                // checks that this dot relates to which player and then call the PrintDot method that it calls Print methods
                                switch (reversiGame.getBoard().getBoard()[x][y]){
                                        case 0 : {
                                                PrintSpace();
                                                break;
                                        }
                                        case 1 : {
                                                PrintDot(player1);
                                                break;
                                        }
                                        case 2 : {
                                                PrintDot(player2);
                                        }
                                }
                        }
                        System.out.println();
                }

        }
        public static void showLastMove(Board board){
                if (board.getLastX()==0 && board.getLastY()==0){
                        System.out.println("No move made mate ! chill!");
                }else {
                        System.out.println(" last move was : (" + board.getLastX() + "," + board.getLastY()+")");
                }
        }

        // this methods gets the color of dot and then calls the proper method for printing that dot
        public static void PrintDot(Color color){
                if (Color.blue.equals(color)) {
                        PrintBlue();
                }else if (Color.green.equals(color)){
                        PrintGreen();
                }else if (Color.red.equals(color)){
                        PrintRed();
                }else if(Color.white.equals(color)){
                        PrintWhite();
                }
        }

        // this method counts the points of each player and then prints the scores related to user names.
        public static void showPoints(Board board , ReversiPlayer player1 , ReversiPlayer player2){
                int player1Score =0;
                int player2Score =0;
                for (int i = 1; i <= 8; i++){
                        for (int j = 1; j <=8 ; j++){
                                if (board.getBoard()[i][j] == 1){
                                        player1Score++;
                                }else if (board.getBoard()[i][j]==2){
                                        player2Score++;
                                }
                        }
                }
                System.out.println(player1.getUsername() + " players score is : " + player1Score);
                System.out.println(player2.getUsername() + " players score is : " + player2Score);
        }

        // checks if the point is free , and the we can put that there
        public static void ShowAvailableMoves(ReversiGame reversiGame , ReversiPlayer reversiPlayer){
                boolean foundOne = false;
                for (int i = 1; i <= 8; i++) {
                        for (int j = 1; j <=8 ; j++) {
                                if (reversiGame.getBoard().getBoard()[i][j] == 0 && reversiGame.getBoard().isValid(i,j,reversiPlayer.getPlayerNum())) {
                                        System.out.println("(" + i + "," + j + ") is a valid coordinate for you to place");
                                        foundOne = true;
                                }
                        }
                }
                if (!foundOne){
                        System.out.println("no available moves!");
                }
        }

        public static void NotValidMoveError(){
                System.out.println("This move is not valid");
        }
        public static void MoveDone(int x , int y , int playerNum){
                System.out.println("A move to "+ x+" and "+ y +" has been made by player"+ playerNum);
        }
        // these methods are written so that we can print different color dots
        public static void PrintRed(){
                System.out.print(ANSI_RED + "8\t" + ANSI_RESET );
        }
        public static void PrintGreen(){
                System.out.print(ANSI_GREEN + "8\t" + ANSI_RESET);
        }
        public static void PrintBlue(){
                System.out.print(ANSI_BLUE + "8\t" + ANSI_RESET);
        }
        public static void  PrintWhite(){
                System.out.print("8\t");
        }
        public static void PrintSpace(){
                System.out.print("0\t");
        }
}
