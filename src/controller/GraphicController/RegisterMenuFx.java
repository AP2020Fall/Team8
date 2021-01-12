package controller.GraphicController;

import controller.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import view.OutputHandler;

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

    public void register(ActionEvent actionEvent) {
        RegisterMenu.registerAccount(userTFReg.getText(),passPFReg.getText(),nameTFReg.getText(),lastnameTFReg.getText(),emailTFReg.getText(),phoneTFReg.getText());
        RegisterMenu.userPassValidation(userTFReg.getText(),passPFReg.getText());
        RegisterMenu.emailAndPhoneNumberValidation(emailTFReg.getText(),phoneTFReg.getText());
        alertReg.setText(OutputHandler.showRegisterMenuOutput(RegisterMenu.getNum()));
    }

    public void processExit(ContextMenuEvent contextMenuEvent) {
    }

    public void processBack(ContextMenuEvent contextMenuEvent) {
    }
}
