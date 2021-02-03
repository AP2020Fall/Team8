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
import java.io.File;

public class Main extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();

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

    public static void main(String[] args) {
        launch(args);
    }
}
