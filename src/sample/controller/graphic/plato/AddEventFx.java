package sample.controller.graphic.plato;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.*;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import sample.view.Client;

import java.io.IOException;
import java.time.LocalDate;
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

    private static Parent pre;

    public static void setPre(Parent pre) {
        AddEventFx.pre = pre;
    }

    public void addEvent(ActionEvent actionEvent) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDateAddEventTF.getText(),formatter);
        LocalDate end = LocalDate.parse(endDateAddEventTF.getText(),formatter);
        try {
            Client.dos.writeUTF("addEvent"+startDateAddEventTF.getText()+","+endDateAddEventTF.getText()+","+eventScoreTF);
            // myWriter.close();
            System.out.println(" register Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if (gameName == null){
            alertCreateEvent.setText("you must choose your game first!");
        }
        else {
        alertCreateEvent.setText(AdminMenu.validationEvent(start,end,eventScoreTF.getText(),gameName));
            AdminMenu.processAddEvent(start,end,Integer.parseInt(eventScoreTF.getText()),gameName);
        }
      //  AdminMenu.processAddEvent(start,end,Integer.parseInt(eventScoreTF.getText()),gameMenuB.getI);

    }


    public void addReversi(ActionEvent actionEvent) {
        gameName="reversi";
    }

    public void addDB(ActionEvent actionEvent) {
        gameName="Dots and Boxes";
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
