package sample.controller.graphic.dots;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import sample.Main;
import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.Player;
import sample.model.reversiModel.ReversiGame;

public class StartDotsController {
    public Circle StartGameCircle;
    public Circle ScoreBoardCircle;
    public Circle ExitCircle;
    public TextField player2IDDots;
    public Label alertDots;

    public void OnExitCircleClicked(MouseEvent mouseEvent) {
        Main.allStage.close();
        System.exit(0);
    }

    public void OnScoreBoardCircleClicked(MouseEvent mouseEvent) {
    }

    public void OnStartCircleClicked(MouseEvent mouseEvent) {
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(player2IDDots.getText()))){
            alertDots.setText("invalid username for player 2");
        }
        else {
         //   reversiGame = new ReversiGame(reversiPlayer1,reversiPlayer2);
         //   reversiPlayer1.setPlayer(FirstMenuFx.getLoggedInPlayer());
          //  reversiPlayer2.setPlayer(Player.getPlayerWithUser(player2ID.getText()));
           // Main.menuController.openReversiBoard();
        }

    }
}
