package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;


import java.io.IOException;
import java.util.Objects;

public class GamesFx {
    public Button ReversiB;
    public Button DBB;

    public void loadReversi(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Reversi");
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadDB(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Dots and Boxes");
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
