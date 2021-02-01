package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import sample.Main;
import sample.controller.graphic.dots.StartDotsController;
import sample.controller.graphic.reversi.StartMenuController;
import sample.controller.plato.FriendsMenu;
import sample.model.platoModel.Player;


import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class GameMenuFx {
    @FXML
    private static String gameName;
    private static Player player;
    public Text showWinsText;
    public Text showPlayedCountText;
    public Button addToFavoritesB;
    public Button runGameB;
    public TextArea gameDet;
    public Label game;
    private static Parent pre;
    public Button showSCB;
    public Button showLogB;
    public ImageView back;
    public ImageView exit;
    public Button updatetB;
    public Button gameLogB;
    public Label WCL;
    public Label PCL;
    private static boolean isReversiUpdating;
    private static boolean isDotsUpdating;
    public Label alert;

    public static void setPre(Parent pre) {
        GameMenuFx.pre = pre;
    }

    public static void setGameName(String gameName) {
        GameMenuFx.gameName = gameName;
    }

    public static void setPlayer(Player player) {
        GameMenuFx.player = player;
}

    @FXML
    public void initialize(){
        if (FirstMenuFx.getLoggedInPlayer()!=null){
        if(gameName.equals("Reversi")){
            game.setText("Reversi");
            showPlayedCountText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiPlayedCounts()));
            showWinsText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiAndWinsCounts()));
            gameDet.setText("Image result for reversi game rules\n" +
                    "You must place the piece so that an opponent's piece, or a row of opponent's pieces, is flanked by your pieces. All of the opponent's pieces between your pieces are then turned over to become your color. The object of the game is to own more pieces than your opponent when the game is over.") ;
            gameDet.setEditable(false);
        }

        else if(gameName.equals("Dots and Boxes")){
            game.setText("Dots and Boxes");
            showPlayedCountText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getDotsAndBoxesPlayedCounts()));
            showWinsText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getDotsAndBoxesAndWinsCount()));
            gameDet.setText("Usually two players take turns adding a single horizontal or vertical line between two unjoined adjacent dots. A player who completes the fourth side of a 1×1 box earns one point and takes another turn. (A point is typically recorded by placing a mark that identifies the player in the box, such as an initial.)");
            gameDet.setEditable(false);
        }
        WCL.setVisible(true);
        PCL.setVisible(true);
        runGameB.setVisible(true);
        addToFavoritesB.setVisible(true);
        showLogB.setVisible(true);
        showSCB.setVisible(true);
        updatetB.setVisible(false);
        gameLogB.setVisible(false);
        }
        else {
            updatetB.setVisible(true);
            WCL.setVisible(false);
            PCL.setVisible(false);
            runGameB.setVisible(false);
            addToFavoritesB.setVisible(false);
            showLogB.setVisible(false);
            showSCB.setVisible(false);
            gameLogB.setVisible(true);
        }


    }

    public void addToFavorite(ActionEvent actionEvent) {
        if (gameName.equals("Reversi")){
            FirstMenuFx.getLoggedInPlayer().setReversiFav(true);
        }
        else
            FirstMenuFx.getLoggedInPlayer().setDBFav(true);
    }

    public void runGame(ActionEvent actionEvent) throws IOException {
        if(gameName.equals("Reversi")){
            StartMenuController.setPre(FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml")));
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/ReversiStartMenu.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            playMusicStartRev();
            Main.allStage.show();
        }
        else{
            StartDotsController.setPre(FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml")));
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/DBFirstMenu.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            playMusicStartDB();
            Main.allStage.show();
        }
    }

    public void loadScoreBoard(ActionEvent actionEvent) throws IOException {
        if (gameName.equals("Reversi")){
            ScoreBoardMenuFx.setGameName("Reversi");
            ScoreBoardMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml")));
            playSCRev();
        }
        else{
            ScoreBoardMenuFx.setGameName("Dots and Boxes");
            playSCDB();
        }
        ScoreBoardMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/scoreBoardMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadGameLog(ActionEvent actionEvent) throws IOException {
        GameHistoryFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameHistory.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
    public void playMusicStartRev(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void playMusicStartDB(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playSCRev(){
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playSCDB(){
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

    public void update(ActionEvent actionEvent) {
        if(gameName.equalsIgnoreCase("reversi")){
            isReversiUpdating=true;
            if (FirstMenuFx.getLoggedInPlayer()!=null) {
                runGameB.setDisable(true);
                alert.setText("Unable to access the game because updates.");
            }
        }
        else if (gameName.equalsIgnoreCase("dots and boxes")){
            isDotsUpdating=true;
           // if ()
            if (FirstMenuFx.getLoggedInPlayer()!=null) {
                runGameB.setDisable(true);
                alert.setText("Unable to access the game because updates.");
            }
        }
    }

    public void changeLog(ActionEvent actionEvent) {

    }
}
