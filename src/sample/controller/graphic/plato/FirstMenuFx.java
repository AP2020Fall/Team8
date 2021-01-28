package sample.controller.graphic.plato;

//import controller.RegisterMenu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sample.Main;
import sample.model.platoModel.Account;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import java.io.File;
import java.io.IOException;

//import model.Admin;
//import model.Player;
//import view.Main;

public class FirstMenuFx {
    public Button firstMainMenuB;
    public Button firstAccountB;
    public Button firstRegB;
    public Button firstGamesB;
    public Button firstLoginB;
    public Button firstFriendB;
   private static Player loggedInPlayer;
    private static Parent pre;

    public static void setPre(Parent pre) {
        FirstMenuFx.pre = pre;
    }

    public static Player getLoggedInPlayer() {
        return loggedInPlayer;
    }

    public static Admin getLoggedInAdmin() {
        return loggedInAdmin;
    }

    public static void setLoggedInPlayer(Player loggedInPlayer) {
        FirstMenuFx.loggedInPlayer = loggedInPlayer;
    }

    public static void setLoggedInAdmin(Admin loggedInAdmin) {
        FirstMenuFx.loggedInAdmin = loggedInAdmin;
    }

    private static Admin loggedInAdmin;

    public static Account getLoginAccount() {
        return loginAccount;
    }

    public static Account loginAccount;
    public void openScoreBoardMenu() throws IOException {
     /* Parent root = FXMLLoader.load(getClass().getResource("../view/ScoreBoardMenu.fxml"));
        stage.setTitle("Score Board Menu");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();*/
    }

    public void loadMain() throws IOException {
        System.out.println("11");
        if(loggedInAdmin != null){
            System.out.println("22");
            AdminMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
       // Main.allStage.setTitle("Score Board Menu");
        Main.allStage.setScene(new Scene(root));
        playMusicMainAdmin();
        Main.allStage.show();}
        else if (loggedInPlayer!=null){
            PlayerMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
            System.out.println("33");
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/playerMenuFx.fxml"));
           // Main.allStage.setTitle("Score Board Menu");
            Main.allStage.setScene(new Scene(root));
            playMusicMainPlayer();
            Main.allStage.show();}
        }
        /* Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("register.fxml")));
        Main.allStage.setScene(new Scene(root));
        Main.allStage.show();*/
        public void playMusicMainAdmin() {
            File file = new File("src/sample/sounds/viva.mp3");
            Media media = new Media(file.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
        }
    public void playMusicMainPlayer() {
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicMainAccountAdmin(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicAccountPlayer (){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void playMusicReg(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicLogin() {
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicMainGames(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void playMusicMainFriends(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void loadAccount() throws IOException {
        System.out.println("1");
        if (loggedInAdmin != null) {
            AdminAccountFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
            System.out.println(2);
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminAccount.fxml"));
            Main.allStage.setScene(new Scene(root));
            playMusicMainAccountAdmin();
            Main.allStage.show();
        } else if (loggedInPlayer != null) {
            System.out.println("3");
            AccountMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/accountMenu.fxml"));
            Main.allStage.setScene(new Scene(root));
            playMusicAccountPlayer();
            Main.allStage.show();
        }
    }



    public void loadReg() throws IOException {
        RegisterMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/registerMenu.fxml"));
        Main.allStage.setScene(new Scene(root));
        playMusicReg();
        Main.allStage.show();}

    public void loadGames() throws IOException {
        GameMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/games.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicMainGames();
        Main.allStage.show();
    }

    public void loadLogin() throws IOException {
        LoginMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/loginMenuFx.fxml"));

            Main.allStage.setScene(new Scene(root));
            playMusicLogin();
            Main.allStage.show();
    }
//helia akhtarkavian pare shod.
    public void loadFriendMenu() throws IOException {
      FriendsMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/preFriendsMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        playMusicMainFriends();
        Main.allStage.show();

    }
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();


    }
}
