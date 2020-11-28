package view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CommandProcessor commandProcessor=new CommandProcessor();
        Scanner scanner=new Scanner(System.in);
        commandProcessor.runPlato(scanner.nextLine(),scanner);
    }
}
