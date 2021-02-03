package sample.controller.graphic.plato;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import sample.Main;
import sample.model.platoModel.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventFx {
    public Text evGameT;
    public Text evStartT;
    public Text evScoreT;
    public Text evEndT;
     private static Event event;
    private static Parent pre;
    public TextField newEnd;
    public Button joinB;
    public Button editB;
   // public Label endEv;
    //public ImageView eventImg;
    public Label alert;
    public ImageView dbImg;
    public ImageView reversiImg;
    public Label endEvB;

    public static void setPre(Parent pre) {
        EventFx.pre = pre;
    }

    public static void setEvent(Event event) {
        EventFx.event = event;
    }

    //src/sample/sounds/Wiener Philharmoniker, Leonard Bernstein - Symphony No.25 In.mp3
    @FXML
    public void initialize() throws IOException {
        if (event.getGameName().equalsIgnoreCase("reversi")){
            reversiImg.setVisible(true);
            dbImg.setVisible(false);
        }
        else if (event.getGameName().equalsIgnoreCase("dots and boxes")){
            reversiImg.setVisible(false);
            dbImg.setVisible(true);
        }
        //DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateS = event.getStartOfGame().format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
        String formattedDateE = event.getEndOfGame().format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
      //  String formattedDateStart = event.getStartOfGame().format(formatter);
        //String formattedDateEnd = event.getEndOfGame().format(formatter);
        evGameT.setText(event.getGameName());
        evStartT.setText(formattedDateS);
        evEndT.setText(formattedDateE);
        evScoreT.setText(String.valueOf(event.getEventScore()));
        if (FirstMenuFx.getLoggedInAdmin()!=null){
            endEvB.setVisible(true);
            editB.setVisible(true);
            newEnd.setVisible(true);
            joinB.setVisible(false);

        }
        else if(FirstMenuFx.getLoggedInPlayer()!=null){

            endEvB.setVisible(false);
            editB.setVisible(false);
            newEnd.setVisible(false);
            joinB.setVisible(true);
        }

            }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void joinEv(MouseEvent mouseEvent) throws IOException {
        if(event.getGameName().equals("reversi")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/ReversiStartMenu.fxml"));
            //   Parent root = FXMLLoader.load(Objects.requireNonNull(PlatoBotMessageFx.class.getClassLoader().getResource("platoBotsMessage.fxml")));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }
    }

    public void editEnd(MouseEvent mouseEvent) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate end = LocalDate.parse(newEnd.getText(),formatter);
        event.setEndOfGame(end);
    }
}
