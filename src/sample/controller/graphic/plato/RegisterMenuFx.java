package sample.controller.graphic.plato;

import sample.controller.plato.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import sample.Main;
import sample.model.platoModel.Admin;
import sample.view.OutputHandler;

import java.io.IOException;
import java.util.Objects;

public class RegisterMenuFx {
    public TextField userTFReg;
    public PasswordField passPFReg;
    public TextField nameTFReg;
    public TextField lastnameTFReg;
    public TextField emailTFReg;
    public TextField phoneTFReg;
    public Button registerB;
    public Label alertReg;
    public ImageView exitReg;
    public ImageView backReg;

    public void register(ActionEvent actionEvent) throws IOException {
        RegisterMenu.registerAccount(userTFReg.getText(),passPFReg.getText(),nameTFReg.getText(),lastnameTFReg.getText(),emailTFReg.getText(),phoneTFReg.getText());
        RegisterMenu.userPassValidation(userTFReg.getText(),passPFReg.getText());
        RegisterMenu.emailAndPhoneNumberValidation(emailTFReg.getText(),phoneTFReg.getText());
        alertReg.setText(OutputHandler.showRegisterMenuOutput(RegisterMenu.getNum()));
        if (Admin.getAdmin().size()==0){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/playerMenuFx.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
       // Parent pri= FXMLLoader.load(Objects.requireNonNull(RegisterMenuFx.class.getClassLoader().getResource("registerMenuFx.fxml")));

    }

    public void processExit(ContextMenuEvent contextMenuEvent) {
    }

    public void processBack(ContextMenuEvent contextMenuEvent) {
    }
}
