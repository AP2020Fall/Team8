package sample.controller.graphic.reversi;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import sample.Main;
import sample.model.reversiModel.ReversiPlayer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ScoreBoardMenu  implements Initializable {
    public Circle ScoreBoardMenuBackCircle;
    public TextArea ScoreBoardTextArea;
    private  static Parent pre;

    public void OnScoreBoardMenuBackCircleClicked() throws IOException {
        Main.menuController.openStartMenu();
    }

    public void DeleteScoreBoard() {
        ScoreBoardTextArea.deleteText(0, ScoreBoardTextArea.getLength() - 1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ReversiPlayer allplayer : ReversiPlayer.allplayers) {
            stringBuilder.append(allplayer.getUsername() + " : " + allplayer.getWins() + " , " + allplayer.getLooses() + " , " + allplayer.getDraws() + "\n");
        }
        ScoreBoardTextArea.setText(stringBuilder.toString());
        if (stringBuilder.length() > 1)
        stringBuilder.delete(0,stringBuilder.length()-1);
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
