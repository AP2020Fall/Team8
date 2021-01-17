package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.controller.MenuController;

public class Main extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("View/ReversiStartMenu.fxml"));
     //   primaryStage.setTitle("ReversiStartMenu");
       // primaryStage.setScene(new Scene(root, 600, 400));
       // primaryStage.show();
        menuController.openStartMenu();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
