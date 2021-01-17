package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import sample.model.platoModel.*;

import java.time.Duration;
import java.time.LocalDateTime;

public class FriendProfile {
    public Text frUsernameT;
    public Text frWinsCountT;
    public Text frDatePassedT;
    public Text frScoreT;
    private static Player player;

    @FXML
    public void initialize(){
        frUsernameT.setText(player.getUserName());
        frWinsCountT.setText(String.valueOf(player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount()));
        frDatePassedT.setText(String.valueOf(Duration.between(player.getPlatoAge(), LocalDateTime.now()).toDays()));
        frScoreT.setText(String.valueOf(player.getDBScore()+player.getReversiScore()));
    }

    public static void setPlayer(Player player) {
        FriendProfile.player = player;
    }
}
