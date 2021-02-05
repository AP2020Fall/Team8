package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import sample.Main;
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
    private static Parent pre;

    public static void setPre(Parent pre) {
        GameHistoryFx.pre = pre;
    }

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
    public void list()
    {
        LocalDateTime now=LocalDateTime.now();
        ArrayList<GameHistoryInfo> histories=new ArrayList<>();
        histories.add(new GameHistoryInfo("dots and boxes",new Player("bardia","bardiajoon"),now,GameResult.WIN));
        gameHistoryShow.addAll(histories);
       // gameHistoryShow.addAll(FirstMenuFx.getLoggedInPlayer().getGameHistories());
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
