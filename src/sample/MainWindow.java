package sample;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


import java.io.*;

public class MainWindow extends Application {
    private static MainWindow instance = new MainWindow();
//    private static Stage stage;

    public static MainWindow getInstance() {
        return instance;
    }

    private Stage stage;

    private MainWindow() {

    }

    @Override
    public  void start(Stage primaryStage) throws IOException {
        //stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml"));
        primaryStage.setTitle("ReversiStartMenu");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }


    public Stage getStage() {
        return stage;
    }
}

