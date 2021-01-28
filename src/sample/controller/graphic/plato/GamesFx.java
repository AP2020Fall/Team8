package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import sample.Main;


import java.io.IOException;
import java.util.Objects;

public class GamesFx {
    public Button ReversiB;
    public Button DBB;
    private static Parent pre;

    public static void setPre(Parent pre) {
        GamesFx.pre = pre;
    }

    public void loadReversi(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Reversi");
        GameMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/games.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadDB(ActionEvent actionEvent) throws IOException {
        GameMenuFx.setGameName("Dots and Boxes");
        GameMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/games.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
