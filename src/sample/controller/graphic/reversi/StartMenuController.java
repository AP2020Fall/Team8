package sample.controller.graphic.reversi;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Main;
import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.Player;
import sample.model.reversiModel.ReversiGame;
import sample.model.reversiModel.ReversiPlayer;

import java.io.IOException;

public class StartMenuController {
    public static ReversiGame reversiGame;
    public ComboBox Player1Combo;
    public ComboBox Player2Combo;
    public TextField player2ID;
    public Label alertReversi;
    ReversiPlayer reversiPlayer1 = new ReversiPlayer(1);
    ReversiPlayer reversiPlayer2 = new ReversiPlayer(2);
    public StartMenuController(){

    }
    @FXML
    public void initialize() {
        Player1Combo.getItems().removeAll(Player1Combo.getItems());
        Player1Combo.getItems().addAll("Black", "Cyan", "Red");
        Player1Combo.getSelectionModel().select("Black");
        Player2Combo.getItems().removeAll(Player2Combo.getItems());
        Player2Combo.getItems().addAll("White", "Pink", "Blue");
        Player2Combo.getSelectionModel().select("White");

    }
    public void OnStartCircleClicked() throws IOException {
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(player2ID.getText()))){
            alertReversi.setText("invalid username for player 2");
        }
        else {
            FindPlayer1Color();
            FindPlayer2Color();
            reversiGame = new ReversiGame(reversiPlayer1,reversiPlayer2);
            reversiPlayer1.setPlayer(FirstMenuFx.getLoggedInPlayer());
            reversiPlayer2.setPlayer(Player.getPlayerWithUser(player2ID.getText()));
            Main.menuController.openReversiBoard();
        }

    }
    public void FindPlayer1Color(){
        if (Player1Combo.getValue().toString().equals("Black")){
            reversiPlayer1.setColor(javafx.scene.paint.Color.BLACK);
        }else if (Player1Combo.getValue().toString().equals("Cyan")){
            reversiPlayer1.setColor(javafx.scene.paint.Color.CYAN);
        }else if (Player1Combo.getValue().toString().equals("Red")){
            reversiPlayer1.setColor(javafx.scene.paint.Color.RED);
        }
    }
    public void FindPlayer2Color(){
        if (Player2Combo.getValue().toString().equals("White")){
            reversiPlayer2.setColor(javafx.scene.paint.Color.WHITE);
        }else if (Player2Combo.getValue().toString().equals("Pink")){
            reversiPlayer2.setColor(javafx.scene.paint.Color.PINK);
        }else if (Player2Combo.getValue().toString().equals("Blue")){
            reversiPlayer2.setColor(javafx.scene.paint.Color.BLUE);
        }
    }
    public void OnExitCircleClicked() throws IOException {
        Main.menuController.closeStage();
    }
    public void OnScoreBoardCircleClicked() throws IOException {
        Main.menuController.openScoreBoardMenu();
    }

    public static ReversiGame getReversiGame() {
        return reversiGame;
    }
}
