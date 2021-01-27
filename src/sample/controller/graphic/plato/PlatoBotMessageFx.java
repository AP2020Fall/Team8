package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.platoModel.Event;
import sample.model.platoModel.PBMessage;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlatoBotMessageFx {
  //  public ListView PlatoBotMessageList;
    public TableView<PBMessage> PBMessageTV;
    public TableColumn<PBMessage,String> messageC;
    public TableColumn<PBMessage,String> timeC;
   // ObservableList<PBMessage> PBObserve = FXCollections.observableArrayList();
     ArrayList<PBMessage> PBShow =new ArrayList<>();
    @FXML
    public void initialize(){

        messageC.setCellValueFactory(new PropertyValueFactory<PBMessage,String>("message"));
        timeC.setCellValueFactory(new PropertyValueFactory<PBMessage,String>("time"));

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
}
