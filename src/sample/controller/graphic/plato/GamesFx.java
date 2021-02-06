package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sample.Main;


import java.io.File;
import java.io.IOException;

public class GamesFx {
    public Button ReversiB;
    public Button DBB;
    private static Parent pre;
    public TextField gameText;
    public Button deleteGameB;
    public ImageView back;
    public ImageView exit;
    public Label alert;

    public static void setPre(Parent pre) {
        GamesFx.pre = pre;
    }
    @FXML
    public void initialize(){
        if(FirstMenuFx.getLoggedInAdmin()!=null){
            deleteGameB.setVisible(true);
            gameText.setVisible(true);
        }
        else {
            deleteGameB.setVisible(false);
            gameText.setVisible(false);
        }
    }

    public void loadReversi(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Reversi");
        GameMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/games.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicRev();
        Main.allStage.show();
    }

    public void loadDB(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Dots and Boxes");
        GameMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/games.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicDB();
        Main.allStage.show();
    }    public void playMusicRev(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicDB(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void deleteGame(ActionEvent actionEvent) {
        //nemikhad nemizanam
        if (gameText.getText().equalsIgnoreCase("reversi")){
            ReversiB.setVisible(false);
        }
        else if (gameText.getText().equalsIgnoreCase("dots and boxes")){
            DBB.setVisible(false);
        }
        else
            alert.setText("invalid game name!");

    }
}
