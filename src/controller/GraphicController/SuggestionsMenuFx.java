package controller.GraphicController;

import controller.AdminMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Player;

public class SuggestionsMenuFx {
    public ListView SuggestionsMenuList;
    public Button addsugB;
    public Label alertSug;
    public TextField usersugTf;
    public TextField gamesSugTf;
    public TextField userPBMessage;
    public TextArea PBTAMessage;

    public void addSuggestion(ActionEvent actionEvent) {
        if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(userPBMessage.getText()))){
            alertSug.setText("invalid user");
        }
        else if(gamesSugTf.getText().equalsIgnoreCase("reverrsi")||gamesSugTf.getText().equalsIgnoreCase("dots and boxes")){
            alertSug.setText("invalid game name");

        }
        else {
         //   Player.getPlayerWithUser(userPBMessage.getText()).getSuggestions().add(usersugTf.getText());
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

    }
}
