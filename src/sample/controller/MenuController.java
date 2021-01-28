package sample.controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.graphic.plato.FirstMenuFx;

import java.io.IOException;

public class MenuController {
    static Stage stage = new Stage();
    public void openStartMenu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/firstMenu.fxml"));
        stage.setTitle("Start Menu");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    public void openScoreBoardMenu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/ScoreBoardMenu.fxml"));
        stage.setTitle("Score Board Menu");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    public void openReversiBoard() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/ReversiBoard.fxml"));
        stage.setTitle("Game Board");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    public void openDotsBoard() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/DotsAndBoxes.fxml"));
        stage.setTitle("Game Board");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    public void closeStage() throws  IOException{
        stage.close();
    }
}
