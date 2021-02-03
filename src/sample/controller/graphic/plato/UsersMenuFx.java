package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.model.platoModel.Player;

import java.io.IOException;
import java.util.ArrayList;

public class UsersMenuFx {
    public TableColumn<Player,String> userColumn;
    public TableColumn<Player,Integer> scoreColumn;
    public TableColumn<Player,Long> daysPassedColumn;
    public TableColumn<Player,Integer> winCountColumn;
    public TableView<Player> userTable;
    public ListView<String> reportList;
    private String gameName;
    public static ArrayList<String> reportedUsers=new ArrayList<>();
    ObservableList<Player> names = FXCollections.observableArrayList();
    public static ArrayList<Player> users =new ArrayList<>();
  //  ListView<Player> listView = new ListView<Player>(names);
  private static Parent pre;

    public static void setPre(Parent pre) {
        UsersMenuFx.pre = pre;
    }



    @FXML
    public void initialize() throws IOException {
        makeTree();
        ObservableList<String > friendsObs = FXCollections.observableArrayList(reportedUsers);
        reportList.setItems(friendsObs);
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
        for (Player player : Player.getAllPlayers()) {
            player.setDatesPassed();
        }
        users.addAll(Player.getAllPlayers());
    }


    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();


    }

    public void processBack(MouseEvent mouseEvent) throws IOException {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void banUser(MouseEvent mouseEvent) {
        PlayerMenuFx.setIsBanned(true);

    }
}
