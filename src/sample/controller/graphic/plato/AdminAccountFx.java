package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;
import sample.controller.plato.AccountsMenu;

import java.io.IOException;

public class AdminAccountFx {
    public void viewAdminPro(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminAccount.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void logout(ActionEvent actionEvent) {
        AccountsMenu.logout();
    }
}
