package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.util.ArrayList;

public class ShowFavoriteGamesFx {
    public ListView<String> ShowFavoriteGamesList=new ListView<>();
    ObservableList<String> gameNames = FXCollections.observableArrayList();
  //  ListView<String> ShowF = new ListView<String>();
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
}
