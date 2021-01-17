package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.MenuController;

public class Main extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
       /* Parent root = FXMLLoader.load(getClass().getResource("/sample/view/DotsAndBoxes.fxml"));
       primaryStage.setTitle("ReversiStartMenu");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();*/
        menuController.openStartMenu();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
