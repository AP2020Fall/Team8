package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.model.platoModel.*;
import java.io.IOException;
import java.util.ArrayList;

public class SearchMenu {
    public TextField searchTF;
    public ListView<String> searchList;
    ObservableList<String> friendsName = FXCollections.observableArrayList();
    ArrayList<String> searchResult=new ArrayList<>();
    private static Parent pre;

    public static void setPre(Parent pre) {
        SearchMenu.pre = pre;
    }

    @FXML
    public void initialize(){
      //   friendsName.clear();
        friendsName.addAll(searchResult);
        searchList.setItems(friendsName);
        //searchList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    public void searchProcess(KeyEvent inputMethodEvent) {
        //ArrayList<String> searchResult=new ArrayList<>();
        System.out.println("searching");
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
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/platoStatistics.fxml"));
    //    Parent root = FXMLLoader.load(Objects.requireNonNull(FriendProfile.class.getClassLoader().getResource("friendProfile.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
