package controller.GraphicController;

import controller.AdminMenu;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.format.DateTimeFormatter;

public class CreateEventFx {
    public TextField gameCreateEvTF;
    public TextField scoreTF;
    public TextField startCreateEvTF;
    public Label createEvAlert;
    public TextField endCreateTF;

    public void createEvent(ActionEvent actionEvent) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateStart = event.getStartOfGame().format(formatter);
        AdminMenu.processAddEvent();
    }
}
