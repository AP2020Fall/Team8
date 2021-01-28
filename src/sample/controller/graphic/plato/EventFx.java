package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import sample.Main;
import sample.model.platoModel.*;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class EventFx {
    public Text evGameT;
    public Text evStartT;
    public Text evScoreT;
    public Text evEndT;
     private static Event event;
    private static Parent pre;

    public static void setPre(Parent pre) {
        EventFx.pre = pre;
    }

    public static void setEvent(Event event) {
        EventFx.event = event;
    }


    @FXML
    public void initialize() throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateStart = event.getStartOfGame().format(formatter);
        String formattedDateEnd = event.getEndOfGame().format(formatter);
        evGameT.setText(event.getGameName());
        evStartT.setText(formattedDateStart);
        evEndT.setText(formattedDateEnd);
        evScoreT.setText(String.valueOf(event.getEventScore()));

            }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
