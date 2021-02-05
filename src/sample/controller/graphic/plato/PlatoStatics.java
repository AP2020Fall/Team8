package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import sample.Main;
import sample.model.platoModel.Player;

import java.time.Duration;
import java.time.LocalDateTime;

public class PlatoStatics {

    private static Player player=FirstMenuFx.getLoggedInPlayer();
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
    private static Parent pre;

    public static void setPre(Parent pre) {
        PlatoStatics.pre = pre;
    }

    @FXML
    public void initialize(){
        usernameT.setText(player.getUserName());
        winsCountT.setText(String.valueOf(player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount()));
        datePassedT.setText(String.valueOf(Duration.between(player.getPlatoAge(), LocalDateTime.now()).toDays()));
        scoreT.setText(String.valueOf(player.getDBScore()+player.getReversiScore()));
        friendsCountT.setText(String.valueOf(player.getFriends().size()));
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
}

