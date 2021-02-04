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
import sample.Client;
import sample.model.platoModel.PBMessage;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlatoBotMessageFx {
  //  public ListView PlatoBotMessageList;
    public TableView<PBMessage> PBMessageTV;
    public TableColumn<PBMessage,String> messageC;
    public TableColumn<PBMessage,LocalDate> timeC;
   // ObservableList<PBMessage> PBObserve = FXCollections.observableArrayList();
     ArrayList<PBMessage> PBShow =new ArrayList<>();
    private static Parent pre;

    public static void setPre(Parent pre) {
        PlatoBotMessageFx.pre = pre;
    }

    @FXML
    public void initialize(){

        messageC.setCellValueFactory(new PropertyValueFactory<PBMessage,String>("message"));
        timeC.setCellValueFactory(new PropertyValueFactory<PBMessage,LocalDate>("date"));
        list();
        ObservableList<PBMessage> PBObserve = FXCollections.observableArrayList(PBShow);
        PBMessageTV.setItems(PBObserve);
        PBMessageTV.setEditable(true);
        PBMessageTV.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        PBMessageTV.getSelectionModel().setCellSelectionEnabled(true);
        PBMessageTV.setItems(PBObserve);

    }

    public    void list(){
        PBShow=FirstMenuFx.getLoggedInPlayer().getPlatoMessages();
        }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Client.allStage.close();
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Client.allStage.setScene(pageTwoScene);
        Client.allStage.show();
    }
}
