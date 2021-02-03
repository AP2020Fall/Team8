package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.AccountsMenu;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;
import sample.view.OutputHandler;

public class UserPro {
    public Label userProfile;
    public Label nameProfile;
    public Label lastnameProfile;
    public Label emailProfile;
    public Label phoneProfile;
    public Label alertProfile;
   // private static Player player;
    private static Admin admin;
    public TextField oldPassTf;
    public TextField newPassTf;
    public TextField fieldTF;
    public TextField newValueTf;
    private static Parent pre;



    public static void setPre(Parent pre) {
        UserPro.pre = pre;
    }

    @FXML
    public void initialize(){
        if(FirstMenuFx.getLoggedInPlayer()!=null){
            Player player=FirstMenuFx.getLoggedInPlayer();
            System.out.println("playere?");
        userProfile.setText(player.getUserName());
        nameProfile.setText(player.getName());
        lastnameProfile.setText(player.getLastName());
        emailProfile.setText(player.getEmail());
        phoneProfile.setText(player.getPhone());
    }
        else if(FirstMenuFx.getLoggedInAdmin()!=null){
            Admin admin=FirstMenuFx.getLoggedInAdmin();
            System.out.println("admine?");
            userProfile.setText(admin.getUserName());
            nameProfile.setText(admin.getName());
            lastnameProfile.setText(admin.getLastName());
            emailProfile.setText(admin.getEmail());
            phoneProfile.setText(admin.getPhone());
        }
    }

    public void changePass(ActionEvent actionEvent) {
       int messge= AccountsMenu.changePassword(oldPassTf.getText(),newPassTf.getText());
        alertProfile.setText(OutputHandler.showAccountOutput(messge));
    }

    public void edit(ActionEvent actionEvent) {
        int message =AccountsMenu.editField(fieldTF.getText(),newValueTf.getText());
        alertProfile.setText(OutputHandler.showAccountOutput(message));
        initialize();

    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void changePhoto(MouseEvent mouseEvent) {
    }
}
