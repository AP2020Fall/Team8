package controller.reversiController;

import model.ReversiGame;
import model.ReversiPlayer;

import java.awt.*;
import java.util.Scanner;

public class ReversiAskInfo {
    static Scanner scanner = new Scanner(System.in);
    public static void AskPrimaryQuestions(ReversiGame reversiGame){
        System.out.println("Enter username of whom you wanna play with :");
        String secondPlayerUsername = scanner.nextLine();
        reversiGame.setPlayer2(ReversiPlayer.getPlayerByUsername(Integer.parseInt(secondPlayerUsername)));
        System.out.println("player1 , what color do you choose ? ( blue , white , red , green ) :");
        String color = scanner.nextLine();
        switch (color){
            case "blue" : {
                reversiGame.getPlayer1().setColor(Color.blue);
                System.out.println("your color has been set to blue !");
                break;
            }
            case "white" : {
                reversiGame.getPlayer1().setColor(Color.white);
                System.out.println("your color has been set to white !");
                break;
            }
            case "red" : {
                reversiGame.getPlayer1().setColor(Color.red);
                System.out.println("your color has been set to red !");
                break;
            }
            case "green" : {
                reversiGame.getPlayer1().setColor(Color.green);
                System.out.println("your color has been set to green !");
                break;
            }
            default: {
                reversiGame.getPlayer1().setColor(Color.green);
                System.out.println("there was no match , so we have set your color green !");
            }
        }
        System.out.println("player2 , what color do you choose ? ( blue , white , red , green ) " + " note that color" + reversiGame.getPlayer1().getColor() + "is chosen");
        String color2 = scanner.nextLine();
        switch (color2){
            case "blue" : {
                reversiGame.getPlayer2().setColor(Color.blue);
                System.out.println("your color has been set to blue !");
                break;
            }
            case "white" : {
                reversiGame.getPlayer2().setColor(Color.white);
                System.out.println("your color has been set to white !");
                break;
            }
            case "red" : {
                reversiGame.getPlayer2().setColor(Color.red);
                System.out.println("your color has been set to red !");
                break;
            }
            case "green" : {
                reversiGame.getPlayer2().setColor(Color.green);
                System.out.println("your color has been set to green !");
                break;
            }
            default: {
                reversiGame.getPlayer2().setColor(Color.white);
                System.out.println("there was no match , so we have set your color white !");
                break;
            }
        }
    }
}
