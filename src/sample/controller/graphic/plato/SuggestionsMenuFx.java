package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.controller.plato.AdminMenu;
import sample.model.platoModel.*;

import java.io.IOException;
import java.util.ArrayList;

public class SuggestionsMenuFx {
    public ListView<Suggestion> SuggestionsMenuList;
    public Button addsugB;
    public Label alertSug;
    public TextField usersugTf;
    public TextField gamesSugTf;
    public TextField userPBMessage;
    public TextArea PBTAMessage;
    public TreeTableView sugTable;
    public TreeTableColumn sugIdC;
    public TreeTableColumn gameNameC;
    public TreeTableColumn userSugC;
    public TreeTableColumn dateSugC;
    ObservableList<Suggestion> sugObserve = FXCollections.observableArrayList();
    public static ArrayList<Suggestion> sugShow =new ArrayList<>();
    public void addSuggestion(ActionEvent actionEvent) {
        String message=AdminMenu.addSuggestion(usersugTf.getText(), gamesSugTf.getText());
        alertSug.setText(message);
        if (message.equals("you have already suggested this game")){
            AdminMenu.addSuggestion(usersugTf.getText(),gamesSugTf.getText());
        }
    }
    public void removeSug(ActionEvent actionEvent) {
        String message=AdminMenu.removeSuggestion(usersugTf.getText(), gamesSugTf.getText())
        alertSug.setText(AdminMenu.removeSuggestion(usersugTf.getText(), gamesSugTf.getText()));
        if (AdminMenu.addSuggestion(usersugTf.getText(), gamesSugTf.getText()).equals("you have already suggested this game")){
            AdminMenu.addSuggestion(usersugTf.getText(),gamesSugTf.getText());
        }
    }

    public void sendPlatoBotsMessage(ActionEvent actionEvent) {
       if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(userPBMessage.getText()))){
           alertSug.setText("invalid user");
       }
       else {
           Player.getPlayerWithUser(userPBMessage.getText()).getPlatoMessages().add(userPBMessage.getText());
       }

    }
    @FXML
    public void initialize(){
        makeTree();
    }
    public void makeTree() {
        sugObserve.clear();
        sugShow.clear();
        list();
        sugObserve.addAll(sugShow);
        SuggestionsMenuList.setEditable(true);
        SuggestionsMenuList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
       // SuggestionsMenuList.getSelectionModel().getSelectionMode(true);
        SuggestionsMenuList.setItems(sugObserve);


    }

    public   static void list(){
        sugShow.addAll(Suggestion.getAllSugs());
    }
}
