package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import sample.Main;
import sample.model.platoModel.Player;


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

    public static void setGameName(String gameName) {
        GameMenuFx.gameName = gameName;
    }

    public static void setPlayer(Player player) {
        GameMenuFx.player = player;
}

    @FXML
    public void initialize(){
        if(gameName.equals("Reversi")){
            showPlayedCountText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiPlayedCounts()));
            showWinsText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiAndWinsCounts()));
            gameDet.setText("Image result for reversi game rules\n" +
                    "You must place the piece so that an opponent's piece, or a row of opponent's pieces, is flanked by your pieces. All of the opponent's pieces between your pieces are then turned over to become your color. The object of the game is to own more pieces than your opponent when the game is over.") ;
            gameDet.setEditable(false);
        }

        else if(gameName.equals("Dots and Boxes")){
            showPlayedCountText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getDotsAndBoxesPlayedCounts()));
            showWinsText.setText(String.valueOf(FirstMenuFx.getLoggedInPlayer().getDotsAndBoxesAndWinsCount()));
            gameDet.setText("Usually two players take turns adding a single horizontal or vertical line between two unjoined adjacent dots. A player who completes the fourth side of a 1×1 box earns one point and takes another turn. (A point is typically recorded by placing a mark that identifies the player in the box, such as an initial.)");
            gameDet.setEditable(false);
        }

    }

    public void addToFavorite(ActionEvent actionEvent) {
        if (gameName.equals("Reversi")){
            player.setReversiFav(true);
        }
        else
            player.setDBFav(true);
    }

    public void runGame(ActionEvent actionEvent) throws IOException {
        if(gameName.equals("Reversi")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/reversiFirstMenu.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
        else{
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/DBFirstMenu.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
    }

    public void loadScoreBoard(ActionEvent actionEvent) throws IOException {
        if (gameName.equals("Reversi")){
            ScoreBoardMenuFx.setGameName("Reversi");
        }
        else
            ScoreBoardMenuFx.setGameName("Dots and Boxes");
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/scoreBoardMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadGameLog(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameHistory.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
