package controller.GraphicController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Event;
import model.Player;
import model.UserShow;
import view.Main;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class EventsLogFx {
    public TableColumn<model.Event, String> idColumn;
    public TableColumn<model.Event, LocalDateTime> gameColumn;
    public TableColumn<model.Event, LocalDateTime> startColumn;
    public TableColumn<model.Event, Integer> endColumn;
    public TableColumn<model.Event, String> scoreColumn;
    public TableView<model.Event> EventsTable;
    ObservableList<model.Event> eventsObserve = FXCollections.observableArrayList();
    public static ArrayList<model.Event> eventsShow =new ArrayList<>();
    public void loadEvent(ActionEvent actionEvent) throws IOException {
        model.Event event=EventsTable.getSelectionModel().getSelectedItem();
        EventFx.setEvent(event);
        Parent root = FXMLLoader.load(Objects.requireNonNull(EventFx.class.getClassLoader().getResource("eventFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
    @FXML
    public void initialize() throws IOException {
        makeTree();
    }
    public void makeTree() {
        idColumn.setCellValueFactory(new PropertyValueFactory<model.Event, String>("eventId"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<model.Event,String>("gameName"));
        gameColumn.setCellValueFactory(new PropertyValueFactory<model.Event,LocalDateTime>("startOfGame"));
        startColumn.setCellValueFactory(new PropertyValueFactory<model.Event,LocalDateTime>("endOfGame"));
        endColumn.setCellValueFactory(new PropertyValueFactory<model.Event,Integer>("eventScore"));
        eventsObserve.clear();
        eventsShow.clear();
        list();
        eventsObserve.addAll(eventsShow);
        EventsTable.setEditable(true);
        EventsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        EventsTable.getSelectionModel().setCellSelectionEnabled(true);
        EventsTable.setItems(eventsObserve);

    }

    public   static void list(){
        eventsShow.addAll(Event.getAllEvents());

    }
}
