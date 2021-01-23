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
    private static boolean isFirstReg=true;
    private static boolean pageTurn=false;

    public static void setFirstReg(boolean firstReg) {
        RegisterMenuFx.isFirstReg=firstReg;
    }

    public static void setPageTurn(boolean pageTurn) {
        RegisterMenuFx.pageTurn = pageTurn;
    }

    public void register(ActionEvent actionEvent) throws IOException {
        //isFirstReg=false;
        pageTurn=false;
        if (!userTFReg.getText().isEmpty()&&!passPFReg.getText().isEmpty()&&!lastnameTFReg.getText().isEmpty()&&!emailTFReg.getText().isEmpty()&&!phoneTFReg.getText().isEmpty()){
        RegisterMenu.registerAccount(userTFReg.getText(),passPFReg.getText(),nameTFReg.getText(),lastnameTFReg.getText(),emailTFReg.getText(),phoneTFReg.getText());
            System.out.println(userTFReg.getText()+passPFReg.getText()+nameTFReg.getText()+lastnameTFReg.getText()+emailTFReg.getText()+phoneTFReg.getText());
        alertReg.setText(OutputHandler.showRegisterMenuOutput(RegisterMenu.getNum()));
      //  System.out.println(Admin.getAdmin());
        if(RegisterMenu.getNum()==9) {
            if (isFirstReg) {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                Main.allStage.show();
                isFirstReg=false;
                pageTurn=true;
            }
            else if (!pageTurn){
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/playerMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                Main.allStage.show();
                pageTurn=true;

            }
            }
        }
       // Parent pri= FXMLLoader.load(Objects.requireNonNull(RegisterMenuFx.class.getClassLoader().getResource("registerMenuFx.fxml")));

    }

    public void processExit(ContextMenuEvent contextMenuEvent) {
    }

    public void processBack(ContextMenuEvent contextMenuEvent) {
    }
}
