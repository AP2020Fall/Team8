package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.controller.plato.FriendsMenu;
import sample.model.platoModel.Player;

public class FriendsRequestsFx {
    public ListView<Player> FriendRequestsList;
    public Button declineB;
    public Button acceptB;
    public Button addB;
    public TextField userTF;
    public Label alertReq;

    @FXML
    public void initialize(){
        ObservableList<Player> reqs = FXCollections.observableArrayList(FirstMenuFx.getLoggedInPlayer().getFriendRequest());
        FriendRequestsList.setItems(reqs);

    }

    public void declineReq(ActionEvent actionEvent) {
       String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processDeclineUser(selectedP);
        FriendRequestsList.getItems().remove(FriendRequestsList.getSelectionModel().getSelectedItem());
    }

    public void acceptReq(ActionEvent actionEvent) {

        String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processAcceptUser(selectedP);
        FriendRequestsList.getItems().remove(FriendRequestsList.getSelectionModel().getSelectedItem());
    }

    public void sendFreindReq(ActionEvent actionEvent) {
        FriendsMenu.addUsername(userTF.getText());
        alertReq.setText(FriendsMenu.output);
    }
}
