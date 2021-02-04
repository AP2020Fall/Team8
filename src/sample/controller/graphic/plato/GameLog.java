package sample.controller.graphic.plato;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import sample.Client;

public class GameLog {
    private static Parent pre;

    public static void setPre(Parent pre) {
        GameLog.pre = pre;
    }

    public void exit(MouseEvent mouseEvent) {  System.exit(0);

    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Client.allStage.setScene(pageTwoScene);
        Client.allStage.show();
    }
}
