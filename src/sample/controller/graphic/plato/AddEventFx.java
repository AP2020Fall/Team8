package sample.controller.graphic.plato;

import sample.controller.plato.*;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddEventFx {
    public MenuButton gameMenuB;
    public MenuItem reversiItem;
    public MenuItem DBItems;
    public TextField startDateAddEventTF;
    public TextField endDateAddEventTF;
    public TextField eventScoreTF;
    public Button createEventB;
    public Label alertCreateEvent;
    private String gameName;

    public void addEvent(ActionEvent actionEvent) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDateAddEventTF.getText(),formatter);
        LocalDate end = LocalDate.parse(endDateAddEventTF.getText(),formatter);
        if (gameName == null){
            alertCreateEvent.setText("you must choose your game first!");
        }
        else {
        alertCreateEvent.setText(AdminMenu.validationEvent(start,end,eventScoreTF.getText(),gameName));}
      //  AdminMenu.processAddEvent(start,end,Integer.parseInt(eventScoreTF.getText()),gameMenuB.getI);

    }


    public void addReversi(ActionEvent actionEvent) {
        gameName="reversi";
    }

    public void addDB(ActionEvent actionEvent) {
        gameName="Dots and Boxes";
    }
}
