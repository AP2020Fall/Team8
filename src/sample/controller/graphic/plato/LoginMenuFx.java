package sample.controller.graphic.plato;

//import controller.LoginMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.LoginMenu;
import sample.model.platoModel.Player;
import sample.view.OutputHandler;

import java.io.IOException;

//import view.Main;

public class LoginMenuFx {
    public PasswordField passwordLoginTF;
    public TextField userLoginTF;
    public Button loginButton;
    public Label alertLog;
    public Button deleteLoginButton;
    private static Parent pre;

    public static void setPre(Parent pre) {
        LoginMenuFx.pre = pre;
    }

    public  void login(ActionEvent actionEvent) throws IOException {
        LoginMenu.login(userLoginTF.getText(),passwordLoginTF.getText());
        alertLog.setText(OutputHandler.showLoginMenuOutput(LoginMenu.getNum()));
        if (LoginMenu.getNum()==4) {
            if (LoginMenu.isIsAdmin()) {
                AdminMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/loginMenuFx.fxml")));
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                Main.allStage.show();

            } else {
                PlayerMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/loginMenuFx.fxml")));
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/playerMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                Main.allStage.show();
            }
        }

    }

    public void deleteUserName(ActionEvent actionEvent) {
        LoginMenu.deleteUserName(userLoginTF.getText(),passwordLoginTF.getText());
        alertLog.setText(String.valueOf(LoginMenu.getNum()));
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
