package controller.GraphicController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import model.Player;
import view.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class SearchMenu {
    public TextField searchTF;
    public ListView<String> searchList;
    ObservableList<String> friendsName = FXCollections.observableArrayList();
    ArrayList<String> searchResult=new ArrayList<>();
    @FXML
    public void initialize(){
        //primaryStage.setTitle("ListView Experiment 1");

        friendsName.clear();
        friendsName.addAll(searchResult);
        searchList.setItems(friendsName);
        searchList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);




    }
    public void searchProcess(InputMethodEvent inputMethodEvent) {
        //ArrayList<String> searchResult=new ArrayList<>();
        for (Player friend : FirstMenuFx.getLoggedInPlayer().getFriends()) {
            if (friend.getUserName().contains(searchTF.getText())){
                searchResult.add(friend.getUserName());
            }
        }
        initialize();
    }

    public void openUser(javafx.event.ActionEvent actionEvent) throws IOException {
        ObservableList<Integer> selectedIndices = searchList.getSelectionModel().getSelectedIndices();
        for (Object index : selectedIndices) {
           Player p1= Player.getPlayerWithUser(index.toString());
            FriendProfile.setPlayer(p1);
        }

        Parent root = FXMLLoader.load(Objects.requireNonNull(FriendProfile.class.getClassLoader().getResource("friendProfile.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
