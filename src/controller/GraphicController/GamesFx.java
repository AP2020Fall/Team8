package controller.GraphicController;

import controller.GameMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class GamesFx {
    public Button ReversiB;
    public Button DBB;

    public void loadReversi(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Reversi");
        Parent root = FXMLLoader.load(Objects.requireNonNull(GameMenuFx.class.getClassLoader().getResource("gameMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadDB(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Dots and Boxes");
        Parent root = FXMLLoader.load(Objects.requireNonNull(GameMenuFx.class.getClassLoader().getResource("gameMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
