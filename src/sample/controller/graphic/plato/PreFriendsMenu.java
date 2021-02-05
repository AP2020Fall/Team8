package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sample.Main;

import java.io.File;
import java.io.IOException;

public class PreFriendsMenu {
    private static Parent pre;

    public static void setPre(Parent pre) {
        PreFriendsMenu.pre = pre;
    }

    public void loadFriendLists(ActionEvent actionEvent) throws IOException {
        FriendsMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/preFriendsMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/friendsMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicFriendsList();
        Main.allStage.show();
    }

    public void loadFriendsReqa(ActionEvent actionEvent) throws IOException {
        FriendsRequestsFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/preFriendsMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/friendsRequests.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicReqs();
        Main.allStage.show();
    }

    public void playMusicReqs(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicFriendsList(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
