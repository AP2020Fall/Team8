package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.platoModel.GameHistoryInfo;
import sample.model.platoModel.GameResult;
import sample.model.platoModel.Player;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GameHistoryFx {
    public TableView<GameHistoryInfo> GameHistoryTable;
    public TableColumn<GameHistoryInfo, String> gameNameC;
    public TableColumn<GameHistoryInfo, Player> opponentC;
    public TableColumn<GameHistoryInfo, LocalDateTime> dateC;
    public TableColumn<GameHistoryInfo, GameResult> resultC;
    ArrayList<GameHistoryInfo> gameHistoryShow=new ArrayList<>();
    ObservableList<GameHistoryInfo> gameHistoryInfoOL = FXCollections.observableArrayList();
   // public static ArrayList<sample.model.platoModel.Event> eventsShow =new ArrayList<>();
    @FXML
    public void initialize(){
        gameNameC.setCellValueFactory(new PropertyValueFactory<GameHistoryInfo, String>("gameName"));
        opponentC.setCellValueFactory(new PropertyValueFactory<GameHistoryInfo, Player>("competitor"));
        dateC.setCellValueFactory(new PropertyValueFactory<GameHistoryInfo, LocalDateTime>("dateTime"));
        resultC.setCellValueFactory(new PropertyValueFactory<GameHistoryInfo, GameResult>("gameResult"));
        gameHistoryInfoOL.clear();
        gameHistoryShow.clear();
        list();
        gameHistoryInfoOL.addAll(gameHistoryShow);
        GameHistoryTable.setEditable(true);
        GameHistoryTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        GameHistoryTable.getSelectionModel().setCellSelectionEnabled(true);
        GameHistoryTable.setItems(gameHistoryInfoOL);
    }
    public void list(){
        gameHistoryShow.addAll(FirstMenuFx.getLoggedInPlayer().getGameHistories());
    }
}
