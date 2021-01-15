package controller.GraphicController;

import controller.AdminMenu;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateEventFx {
    public TextField gameCreateEvTF;
    public TextField scoreTF;
    public TextField startCreateEvTF;
    public Label createEvAlert;
    public TextField endCreateTF;

    public void createEvent(ActionEvent actionEvent) {
        AdminMenu.validation(LocalDateTime.parse(startCreateEvTF.getText()),LocalDateTime.parse());
    }
}
