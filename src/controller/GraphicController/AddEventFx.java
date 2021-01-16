package controller.GraphicController;

import controller.AdminMenu;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import model.Admin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss.nnn");
        LocalDateTime start = LocalDateTime.parse(startDateAddEventTF.getText());
        LocalDateTime end = LocalDateTime.parse(endDateAddEventTF.getText());
        if (gameName == null){
            alertCreateEvent.setText("you must choose your game first!");
        }
        else {
        alertCreateEvent.setText(AdminMenu.validation(start,end,eventScoreTF.getText(),gameName));}
      //  AdminMenu.processAddEvent(start,end,Integer.parseInt(eventScoreTF.getText()),gameMenuB.getI);

    }


    public void addReversi(ActionEvent actionEvent) {
        gameName="reversi";
    }

    public void addDB(ActionEvent actionEvent) {
        gameName="Dots and Boxes";
    }
}
