package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import sample.model.platoModel.Player;

import java.time.Duration;
import java.time.LocalDateTime;

public class PlatoStatics {

    private static Player player;
    public Text usernameT;
    public Text winsCountT;
    public Text datePassedT;
    public Text scoreT;
    public Label userProfile;
    public Label nameProfile;
    public Label lastnameProfile;
    public Label emailProfile;
    public Label phoneProfile;
    public Label alertProfile;
    public Text friendsCountT;

    public static void setPlayer(Player player) {
        PlatoStatics.player = player;
    }
    @FXML
    public void initialize(){
        usernameT.setText(player.getUserName());
        winsCountT.setText(String.valueOf(player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount()));
        datePassedT.setText(String.valueOf(Duration.between(player.getPlatoAge(), LocalDateTime.now()).toDays()));
        scoreT.setText(String.valueOf(player.getDBScore()+player.getReversiScore()));
    }
}

