package controller.GraphicController;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.Event;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class EventFx {
    public Text evGameT;
    public Text evStartT;
    public Text evScoreT;
    public Text evEndT;
     private static Event event;

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
}
