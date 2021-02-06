package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.AdminMenu;
import sample.model.platoModel.*;
import sample.view.Client;

import java.io.IOException;
import java.util.ArrayList;

public class SuggestionsMenuFx {
   // public ListView<Suggestion> SuggestionsMenuList;
    public Button addsugB;
    public Label alertSug;
    public TextField usersugTf;
    public TextField gamesSugTf;
    public TextField userPBMessage;
    public TextArea PBTAMessage;
    public TableView<Suggestion> sugTable;
    public TableColumn<Suggestion, String> sugIdC;
    public TableColumn<Suggestion, String> gameNameC;
    public TableColumn<Suggestion, String> userSugC;
    public TableColumn<Suggestion, String> dateSugC;
    ObservableList<Suggestion> sugObserve = FXCollections.observableArrayList();
    public static ArrayList<Suggestion> sugShow =new ArrayList<>();
    private static Parent pre;

    public static void setPre(Parent pre) {
        SuggestionsMenuFx.pre = pre;
    }

    public void addSuggestion(ActionEvent actionEvent) {
        try {
            Client.dos.writeUTF("addSug"+","+usersugTf.getText()+","+gamesSugTf.getText());
            // myWriter.close();
            System.out.println(" addSug Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
      //  String message=AdminMenu.addSuggestion(usersugTf.getText(), gamesSugTf.getText());
        //alertSug.setText(message);
        makeTree();
    }
    public void removeSug(ActionEvent actionEvent) {
        try {
            Client.dos.writeUTF("removeSug,"+sugTable.getSelectionModel().getSelectedItem().getSuggestionId());
            // myWriter.close();
            System.out.println(" removeSug Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    //  Suggestion suggestion =sugTable.getSelectionModel().getSelectedItem();
      //  String message=AdminMenu.removeSuggestion(suggestion.getSuggestionId());
        //alertSug.setText(AdminMenu.removeSuggestion(message));
    }

    public void sendPlatoBotsMessage(ActionEvent actionEvent) {
        try {
            Client.dos.writeUTF("sendPB,"+userPBMessage.getText()+","+PBTAMessage.getText());
            // myWriter.close();
            System.out.println(" sendPb Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       // String message=AdminMenu.sendPBMessage(userPBMessage.getText(),PBTAMessage.getText());
     //  alertSug.setText(message);


    }
    @FXML
    public void initialize(){
        makeTree();
    }
    public void makeTree() {
        sugIdC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("suggestionId"));
        gameNameC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("suggestedGame"));
        userSugC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("player"));
        dateSugC.setCellValueFactory(new PropertyValueFactory<Suggestion, String>("dateOfSuggestion"));
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
