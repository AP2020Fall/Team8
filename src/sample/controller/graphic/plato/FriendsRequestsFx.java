package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.controller.plato.FriendsMenu;
import sample.model.platoModel.Player;

import java.util.ArrayList;

public class FriendsRequestsFx {
    public ListView<String> FriendRequestsList;
    public Button declineB;
    public Button acceptB;
    public Button addB;
    public TextField userTF;
    public Label alertReq;
    ArrayList<String> names=new ArrayList<>();

    @FXML
    public void initialize(){
        list();
        ObservableList<String> reqs = FXCollections.observableArrayList(names);
        FriendRequestsList.setItems(reqs);
    }
    public void list(){
        for (Player player : FirstMenuFx.getLoggedInPlayer().getFriendRequest()) {
            names.add(player.getUserName());
        }
    }

    public void declineReq(ActionEvent actionEvent) {
       String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processDeclineUser(selectedP);
        FriendRequestsList.getItems().remove(FriendRequestsList.getSelectionModel().getSelectedItem());
    }

    public void acceptReq(ActionEvent actionEvent) {

        String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem();
        FriendsMenu.processAcceptUser(selectedP);
        FriendRequestsList.getItems().remove(FriendRequestsList.getSelectionModel().getSelectedItem());
    }

    public void sendFreindReq(ActionEvent actionEvent) {
        FriendsMenu.addUsername(userTF.getText());
        alertReq.setText(FriendsMenu.output);
    }
}
