package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sample.controller.MenuController;

import java.io.File;

public class Main extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
       /* Parent root = FXMLLoader.load(getClass().getResource("/sample/view/DotsAndBoxes.fxml"));
       primaryStage.setTitle("ReversiStartMenu");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();*/
      // playMusic();
        menuController.openStartMenu();
    }



    public static void playMusic() {
        File file = new File("src\\sounds\\Click.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
