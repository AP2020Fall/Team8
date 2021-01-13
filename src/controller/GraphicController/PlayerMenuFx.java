package controller.GraphicController;

import controller.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class PlayerMenuFx {
    public void loadFavGames(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(PlatoBotMessageFx.class.getClassLoader().getResource("platoBotsMessage.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadEventPlayer(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(EventsLogFx.class.getClassLoader().getResource("events.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadSearch(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(SearchMenu.class.getClassLoader().getResource("searchMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
