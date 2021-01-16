package controller;

import controller.GraphicController.FriendsMenuFx;
import controller.GraphicController.FriendsRequestsFx;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class PreFriendsMenu {
    public void loadFriendLists(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(FriendsMenuFx.class.getClassLoader().getResource("friendsMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadFriendsReqa(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(FriendsRequestsFx.class.getClassLoader().getResource("friendRequests.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
