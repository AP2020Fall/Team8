package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import sample.Main;
import sample.controller.plato.FriendsMenu;
import sample.model.platoModel.Player;


import java.io.IOException;

public class FriendsMenuFx {
    public ListView<Player> FriendsMenuList;
    public Button removeB;
    public Button viewUser;
    @FXML
    public void initialize(){
        ObservableList<Player> friends = FXCollections.observableArrayList(FirstMenuFx.getLoggedInPlayer().getFriends());
        FriendsMenuList.setItems(friends);

    }

    public void removeUser(ActionEvent actionEvent) {
        String selectedP=FriendsMenuList.getSelectionModel().getSelectedItem().toString();
        FriendsMenu.processRemoveFriend(selectedP);

    }

    public void viewUser(ActionEvent actionEvent) throws IOException {
        PlatoStatics.setPlayer(Player.getPlayerWithUser(FriendsMenuList.getSelectionModel().getSelectedItem().toString()));
      //  Parent root = FXMLLoader.load(Objects.requireNonNull(UserProfile.class.getClassLoader().getResource("platoStatistics.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/platoStatistics.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }
}
