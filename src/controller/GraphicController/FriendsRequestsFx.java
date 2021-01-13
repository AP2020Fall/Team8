package controller.GraphicController;

import controller.FriendsMenu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Player;

public class FriendsRequestsFx {
    public ListView<Player> FriendRequestsList;
    public Button declineB;
    public Button acceptB;
    public Button addB;
    public TextField userTF;

    @FXML
    public void initialize(){
        ObservableList<Player> reqs = FXCollections.observableArrayList(FirstMenuFx.getLoggedInPlayer().getFriendRequest());
        FriendRequestsList.setItems(reqs);

    }

    public void declineReq(ActionEvent actionEvent) {
       String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processDeclineUser(selectedP);

    }

    public void acceptReq(ActionEvent actionEvent) {
        String selectedP=FriendRequestsList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processAcceptUser(selectedP);
    }

    public void sendFreindReq(ActionEvent actionEvent) {
        FriendsMenu.addUsername(userTF.getText());
    }
}
