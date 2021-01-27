package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.controller.plato.PlayerMenu;
import sample.model.platoModel.Player;
import sample.model.platoModel.UserShow;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class UsersMenuFx {
    public TableColumn<Player,String> userColumn;
    public TableColumn<Player,Integer> scoreColumn;
    public TableColumn<Player,Long> daysPassedColumn;
    public TableColumn<Player,Integer> winCountColumn;
    public TableView<Player> userTable;
    private String gameName;
    ObservableList<Player> names = FXCollections.observableArrayList();
    public static ArrayList<Player> users =new ArrayList<>();
  //  ListView<Player> listView = new ListView<Player>(names);
    @FXML
    public void initialize() throws IOException {
        makeTree();
    }
    public void makeTree() {
        userColumn.setCellValueFactory(new PropertyValueFactory<Player, String >("userName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<Player,Integer>("point"));
        daysPassedColumn.setCellValueFactory(new PropertyValueFactory<Player,Long>("datesPassed"));
        winCountColumn.setCellValueFactory(new PropertyValueFactory<Player,Integer>("totalWins"));
        names.clear();
        users.clear();
        list();
        names.addAll(users);
        userTable.setEditable(true);
        userTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        userTable.getSelectionModel().setCellSelectionEnabled(true);
        userTable.setItems(names);
    }

    private  static void list(){
        users.addAll(Player.getAllPlayers());
    }


}
