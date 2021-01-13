package controller.GraphicController;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.Player;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserProfile {

    private Player player;
    public Text usernameT;
    public Text winsCountT;
    public Text datePassedT;
    public Text scoreT;

    public void setPlayer(Player player) {
        this.player = player;
    }
    @FXML
    public void initialize(){
        usernameT.setText(player.getUserName());
        winsCountT.setText(String.valueOf(player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount()));
        datePassedT.setText(String.valueOf(Duration.between(player.getPlatoAge(), LocalDateTime.now()).toDays()));
        scoreT.setText(String.valueOf(player.getDBScore()+player.getReversiScore()));
    }
}

