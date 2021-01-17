package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

public class UserPro {
    public Label userProfile;
    public Label nameProfile;
    public Label lastnameProfile;
    public Label emailProfile;
    public Label phoneProfile;
    public Label alertProfile;
    private static Player player;
    private static Admin admin;
    @FXML
    public void initialize(){
        if(player!=null){
        userProfile.setText(player.getUserName());
        nameProfile.setText(player.getName());
        lastnameProfile.setText(player.getLastName());
        emailProfile.setText(player.getEmail());
        phoneProfile.setText(player.getPhone());
    }
        else if(admin!=null){
            userProfile.setText(admin.getUserName());
            nameProfile.setText(admin.getName());
            lastnameProfile.setText(admin.getLastName());
            emailProfile.setText(admin.getEmail());
            phoneProfile.setText(admin.getPhone());
        }
    }

}
