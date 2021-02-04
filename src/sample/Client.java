package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;
import sample.controller.MenuController;

import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();
   public static String command= "";

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml"));
       primaryStage.setTitle("ReversiStartMenu");

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
      // playMusic();
     //   menuController.openStartMenu();
        playMusicFirst();
    }

    public void playMusicFirst() {
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public static void main(String[] args) throws IOException {
        launch(args);
        Socket socket=new Socket("localhost",9090);
        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

        while (true){
            System.out.println(">");
            String command=keyboard.readLine();
            if (command.equals("quit")) break;
            out.println(command);
            String serverResponse=input.readLine();
            System.out.println("Server says"+ serverResponse);
        }
    }
}
