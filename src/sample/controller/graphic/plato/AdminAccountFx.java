package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.AccountsMenu;

import java.io.IOException;

public class AdminAccountFx {
    public Button viewProB;
    public Button logoutB;
    private static Parent pre;

    public static void setPre(Parent pre) {
        AdminAccountFx.pre = pre;
    }

    public void viewAdminPro(ActionEvent actionEvent) throws IOException {
        UserPro.setPre(FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/userProfile.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void logout(ActionEvent actionEvent) {
        AccountsMenu.logout();
        Main.allStage.close();
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
