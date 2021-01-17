package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import sample.Main;
import sample.controller.plato.AccountsMenu;

import java.io.IOException;

public class AccountMenuFx {
    public Label usernameLablel;
    public Label reversiStatistics;
    public Label DBStatics;


    public void logout(ActionEvent actionEvent) {
        AccountsMenu.logout();
    }

    public void loadGamesHistory(ActionEvent actionEvent) {
    }

    public void loadProfile(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/accountMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }

    public void loadPlatoStatistics(ActionEvent actionEvent) {
    }
}
