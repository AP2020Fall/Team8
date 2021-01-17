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
import sample.Main;
import sample.controller.plato.LoginMenu;
import sample.view.OutputHandler;

import java.io.IOException;

//import view.Main;

public class LoginMenuFx {
    public PasswordField passwordLoginTF;
    public TextField userLoginTF;
    public Button loginButton;
    public Label alertLog;
    public Button deleteLoginButton;

    public  void login(ActionEvent actionEvent) throws IOException {
        LoginMenu.login(userLoginTF.getText(),passwordLoginTF.getText());
        alertLog.setText(OutputHandler.showLoginMenuOutput(LoginMenu.getNum()));
        if (LoginMenu.getNum()==1) {
            if (LoginMenu.isIsAdmin()) {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                Main.allStage.show();

            } else {
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
}
