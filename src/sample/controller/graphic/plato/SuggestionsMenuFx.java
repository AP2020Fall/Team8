package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.controller.plato.AdminMenu;
import sample.model.platoModel.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SuggestionsMenuFx {
    public ListView<Suggestion> SuggestionsMenuList;
    public Button addsugB;
    public Label alertSug;
    public TextField usersugTf;
    public TextField gamesSugTf;
    public TextField userPBMessage;
    public TextArea PBTAMessage;
    public TableView<Suggestion> sugTable;
    public TableColumn<Suggestion, String> sugIdC;
    public TableColumn<Suggestion, String> gameNameC;
    public TableColumn<Suggestion, Player> userSugC;
    public TableColumn<Suggestion, LocalDateTime> dateSugC;
    ObservableList<Suggestion> sugObserve = FXCollections.observableArrayList();
    public static ArrayList<Suggestion> sugShow =new ArrayList<>();
    public void addSuggestion(ActionEvent actionEvent) {
        String message=AdminMenu.addSuggestion(usersugTf.getText(), gamesSugTf.getText());
        alertSug.setText(message);
    }
    public void removeSug(ActionEvent actionEvent) {
      Suggestion suggestion =sugTable.getSelectionModel().getSelectedItem();
        String message=AdminMenu.removeSuggestion(suggestion.getSuggestionId());
        alertSug.setText(AdminMenu.removeSuggestion(message));
    }

    public void sendPlatoBotsMessage(ActionEvent actionEvent) {
        String message=AdminMenu.sendPBMessage(userPBMessage.getText(),PBTAMessage.getText());
       alertSug.setText(message);


    }
    @FXML
    public void initialize(){
        makeTree();
    }
    public void makeTree() {
        sugIdC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("suggestedGame"));
        gameNameC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("suggestionId"));
        userSugC.setCellValueFactory(new PropertyValueFactory<Suggestion, Player>(" player"));
        dateSugC.setCellValueFactory(new PropertyValueFactory<Suggestion, LocalDateTime>("dateOfSuggestion"));
        sugObserve.clear();
        sugShow.clear();
        list();
        sugObserve.addAll(sugShow);
        sugTable.setEditable(true);
        sugTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        sugTable.getSelectionModel().getSelectionMode();
        sugTable.setItems(sugObserve);


    }

    public   static void list(){
        sugShow.addAll(Suggestion.getAllSugs());
    }
}
