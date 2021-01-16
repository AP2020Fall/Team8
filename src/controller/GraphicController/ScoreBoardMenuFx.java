package controller.GraphicController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DBSBPlayer;
import model.Player;
import model.ReversiSBPlayer;

public class ScoreBoardMenuFx {
    public ListView ScoreBoardMenuList;
    public TableColumn<DBSBPlayer, String> playerSBColumn1;
    public TableColumn<DBSBPlayer, Number> scoreSBColumn1;
    public TableView<DBSBPlayer> SBTableView1;
    public Label gameSBName;
    private static String gameName;
    public static ObservableList<DBSBPlayer> data1 = FXCollections.observableArrayList();
    public static ObservableList<ReversiSBPlayer> data2 = FXCollections.observableArrayList();
    public TableColumn<ReversiSBPlayer, String> playerSBColumn2;
    public TableColumn<ReversiSBPlayer, Number> scoreSBColumn2;
    public TableView<ReversiSBPlayer> SBTableView2;

    public static void setGameName(String gameName) {
        ScoreBoardMenuFx.gameName = gameName;
    }

    @FXML
    public void initialize(){
        if (gameName.equals("Dots and Boxes")){
            playerSBColumn1.setCellValueFactory(new PropertyValueFactory<DBSBPlayer, String>("player"));
            scoreSBColumn1.setCellValueFactory(new PropertyValueFactory<DBSBPlayer, Number>("totalScore"));
            listPlayers();
            data1.clear();
            data1.addAll(DBSBPlayer.getAllDbPlayers());
            SBTableView1.setEditable(true);
            SBTableView1.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            SBTableView1.getSelectionModel().setCellSelectionEnabled(true);
            SBTableView1.setItems(data1);
        }
        else {
            playerSBColumn2.setCellValueFactory(new PropertyValueFactory<ReversiSBPlayer, String>("player"));
            scoreSBColumn2.setCellValueFactory(new PropertyValueFactory<ReversiSBPlayer, Number>("totalScore"));
            listPlayers();
            data2.clear();
            data2.addAll(ReversiSBPlayer.getAllRSBPlayers());
            SBTableView2.setEditable(true);
            SBTableView2.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            SBTableView2.getSelectionModel().setCellSelectionEnabled(true);
            SBTableView2.setItems(data2);
        }

    }
    public void listPlayers(){
        if (gameName.equals("Dots and Boxes")){
            for (Player player : Player.getAllPlayers()) {
                DBSBPlayer dbsbPlayer=new DBSBPlayer(player,player.getDBScore());
            }

        }
        else{
            for (Player player : Player.getAllPlayers()) {
                ReversiSBPlayer rsbPlayer=new ReversiSBPlayer(player,player.getReversiScore());
            }

        }

    }
}
