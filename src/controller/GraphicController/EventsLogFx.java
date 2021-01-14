package controller.GraphicController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Player;
import model.UserShow;
import view.Main;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class EventsLogFx {
    public TableColumn<Event, String> idColumn;
    public TableColumn<Event, LocalDateTime> gameColumn;
    public TableColumn<Event, LocalDateTime> startColumn;
    public TableColumn<Event, Integer> endColumn;
    public TableColumn<Event, String> scoreColumn;
    public TableView<UserShow> EventsTable;
    ObservableList<UserShow> names = FXCollections.observableArrayList();
    public static ArrayList<UserShow> users =new ArrayList<>();
    public void loadEvent(ActionEvent actionEvent) throws IOException {
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
        idColumn.setCellValueFactory(new PropertyValueFactory<Event, String>("eventId"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<Event,String>("gameName"));
        gameColumn.setCellValueFactory(new PropertyValueFactory<Event,LocalDateTime>("startOfGame"));
        startColumn.setCellValueFactory(new PropertyValueFactory<Event,LocalDateTime>("endOfGame"));
        endColumn.setCellValueFactory(new PropertyValueFactory<Event,Integer>("eventScore"));
        names.clear();
        users.clear();
        list();
        names.addAll(users);
        EventsTable.setEditable(true);
        EventsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        EventsTable.getSelectionModel().setCellSelectionEnabled(true);
        EventsTable.setItems(names);
    }

    private  static void list(){
        for (Player player : Player.getAllPlayers()) {
            UserShow userShow=new UserShow(player.getUserName(),player.getDBScore()+player.getReversiScore(), (int) Duration.between(LocalDateTime.now(),player.getPlatoAge()).toDays(),player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount());
            userShow.setPlayer(player);
            users.add(userShow);
        }
    }
}
