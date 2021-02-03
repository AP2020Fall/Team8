package sample.controller.graphic.plato;

import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sample.controller.plato.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import sample.Main;
import sample.model.platoModel.Admin;
import sample.view.OutputHandler;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class RegisterMenuFx {
    public TextField userTFReg;
    public PasswordField passPFReg;
    public TextField nameTFReg;
    public TextField lastnameTFReg;
    public TextField emailTFReg;
    public TextField phoneTFReg;
    public Button registerB;
    public Label alertReg;
    public ImageView exitReg;
    public ImageView backReg;
    private static boolean isFirstReg=true;
    private static boolean pageTurn=false;

    private static Parent pre;
//branch avaz shod?
    public static void setPre(Parent pre) {
        RegisterMenuFx.pre = pre;
    }

    public static void setFirstReg(boolean firstReg) {
        RegisterMenuFx.isFirstReg=firstReg;
    }

    public static void setPageTurn(boolean pageTurn) {
        RegisterMenuFx.pageTurn = pageTurn;
    }

    public void register(ActionEvent actionEvent) throws IOException {
        //isFirstReg=false;
        pageTurn=false;
        if (!userTFReg.getText().isEmpty()&&!passPFReg.getText().isEmpty()&&!lastnameTFReg.getText().isEmpty()&&!emailTFReg.getText().isEmpty()&&!phoneTFReg.getText().isEmpty()){
        RegisterMenu.registerAccount(userTFReg.getText(),passPFReg.getText(),nameTFReg.getText(),lastnameTFReg.getText(),emailTFReg.getText(),phoneTFReg.getText());
            System.out.println(userTFReg.getText()+passPFReg.getText()+nameTFReg.getText()+lastnameTFReg.getText()+emailTFReg.getText()+phoneTFReg.getText());
        alertReg.setText(OutputHandler.showRegisterMenuOutput(RegisterMenu.getNum()));
      //  System.out.println(Admin.getAdmin());
        if(RegisterMenu.getNum()==9) {
            if (isFirstReg) {
                PlayerMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/registerMenu.fxml")));
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                playMusicAd();
                Main.allStage.show();
                isFirstReg=false;
                pageTurn=true;
            }
            else if (!pageTurn){
                PlayerMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/registerMenu.fxml")));
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/playerMenuFx.fxml"));
                Scene pageTwoScene = new Scene(root);
                Main.allStage.setScene(pageTwoScene);
                playMusicPla();
                Main.allStage.show();
                pageTurn=true;

            }
            }
        }
        else {alertReg.setText("you must fill all of the text fields");
        }
       // Parent pri= FXMLLoader.load(Objects.requireNonNull(RegisterMenuFx.class.getClassLoader().getResource("registerMenuFx.fxml")));

    }
    public void playMusicAd(){
        File file = new File("src/sample/sounds/Популярная_классика_–_Mozart_Piano_Co.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
    public void playMusicPla(){
        File file = new File("src/sample/sounds/Yatao - Listen to the Mountains.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void processBack(ContextMenuEvent contextMenuEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
        Main.allStage.close();
    }


}
