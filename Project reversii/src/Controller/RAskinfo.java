package Controller;

import Model.Player;
import Model.ReversiGame;

import java.awt.*;
import java.util.Scanner;

public class RAskinfo {
    static Scanner scanner = new Scanner(System.in);
    public static void AskPrimaryQuestions(ReversiGame reversiGame){
        System.out.println("Enter username of whom you wanna play with :");
        String secondPlayerUsername = scanner.nextLine();
        reversiGame.setPlayer2(Player.getPlayerByUsername(Integer.parseInt(secondPlayerUsername)));
        System.out.println("player1 , what color do you choose ? ( black , white , red , green ) :");
        String color = scanner.nextLine();
        switch (color){
            case "black" :
                reversiGame.getPlayer1().setColor(Color.BLACK);
                System.out.println("your color has been set to black !");
                break ;
            case "white" :
                reversiGame.getPlayer1().setColor(Color.white);
                System.out.println("your color has been set to white !");
            case "red" :
                reversiGame.getPlayer1().setColor(Color.red);
                System.out.println("your color has been set to red !");
            case "green" :
                reversiGame.getPlayer1().setColor(Color.green);
                System.out.println("your color has been set to green !");
            default:
                reversiGame.getPlayer1().setColor(Color.black);
                System.out.println("there was no match , so we have set your color black !");
        }
        System.out.println("player2 , what color do you choose ? ( black , white , red , green ) :");
        String color2 = scanner.nextLine();
        switch (color2){
            case "black" :
                reversiGame.getPlayer2().setColor(Color.BLACK);
                System.out.println("your color has been set to black !");
                break ;
            case "white" :
                reversiGame.getPlayer2().setColor(Color.white);
                System.out.println("your color has been set to white !");
            case "red" :
                reversiGame.getPlayer2().setColor(Color.red);
                System.out.println("your color has been set to red !");
            case "green" :
                reversiGame.getPlayer2().setColor(Color.green);
                System.out.println("your color has been set to green !");
            default:
                reversiGame.getPlayer2().setColor(Color.white);
                System.out.println("there was no match , so we have set your color white !");
        }
    }
}

