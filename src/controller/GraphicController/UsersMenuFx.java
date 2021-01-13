package controller.GraphicController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Player;

import java.io.IOException;

public class UsersMenuFx {
    public ListView UsersMenuList;
    private String gameName;
    ObservableList<Player> names = FXCollections.observableArrayList(Player.getAllPlayers());
    ListView<Player> listView = new ListView<Player>(names);
    @FXML
    public void initialize() throws IOException {

    }

}
