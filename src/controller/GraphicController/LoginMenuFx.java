package controller.GraphicController;

import controller.LoginMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class LoginMenuFx {
    public PasswordField passwordLoginTF;
    public TextField userLoginTF;
    public Button loginButton;
    public Label alertLog;
    public Button deleteLoginButton;

    public  void login(ActionEvent actionEvent) throws IOException {
        alertLog.setText(String.valueOf(LoginMenu.getNum()));
        LoginMenu.login(userLoginTF.getText(),passwordLoginTF.getText());
        if (LoginMenu.isIsAdmin()){
            Parent root = FXMLLoader.load(Objects.requireNonNull(AdminMenuFx.class.getClassLoader().getResource("adminMenuFx.fxml")));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();

        }
        else{
            Parent root = FXMLLoader.load(Objects.requireNonNull(AdminMenuFx.class.getClassLoader().getResource("playerMenuFx.fxml")));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
        
    }

    public void deleteUserName(ActionEvent actionEvent) {
        LoginMenu.deleteUserName(userLoginTF.getText(),passwordLoginTF.getText());
        alertLog.setText(String.valueOf(LoginMenu.getNum()));
        
    }
}
