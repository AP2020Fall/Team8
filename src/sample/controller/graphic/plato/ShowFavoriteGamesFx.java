package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import sample.Main;

import java.util.ArrayList;

public class ShowFavoriteGamesFx {
    public ListView<String> ShowFavoriteGamesList=new ListView<>();
    ObservableList<String> gameNames = FXCollections.observableArrayList();
  //  ListView<String> ShowF = new ListView<String>();
  private static Parent pre;

    public static void setPre(Parent pre) {
        ShowFavoriteGamesFx.pre = pre;
    }

    @FXML
    public void initialize(){
        gameNames.clear();
        gameNames.addAll(listFavGames());
        ShowFavoriteGamesList.setItems(gameNames);
        ShowFavoriteGamesList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
      //lazeme?  ShowFavoriteGamesList.getSelectionModel().selectFirst(true);

    }
    public ArrayList<String> listFavGames(){
        ArrayList<String> fav=new ArrayList<>();
        if(FirstMenuFx.getLoggedInPlayer().isReversiFav()){
            fav.add("Reversi");
        }
        else if (FirstMenuFx.getLoggedInPlayer().isDBFav()){
            fav.add("Dots and Boxes");
        }
        return fav;
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
