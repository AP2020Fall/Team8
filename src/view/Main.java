package view;

import controller.GraphicController.FirstMenuFx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Scanner;

public class Main extends Application {
    public static Stage allStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(FirstMenuFx.class.getClassLoader().getResource("../../Graphics/Plato/firstMenu.fxml")));
        //   primaryStage.setTitle("ReversiStartMenu");

        primaryStage.setScene(new Scene(root, 600, 400));
         primaryStage.show();
      //  menuController.openStartMenu();
    }

    public static void main(String[] args) {
launch(args);
    }
}
