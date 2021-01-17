package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;

import java.io.IOException;
import java.util.Objects;

public class AdminMenuFx {
    public Button addEventB;
    public Button viewEventB;
    public Button addSugB;
    public Button viewUserAdminB;

    public void loadAddEvent(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/register.fxml"));

     //   Parent root = FXMLLoader.load(Objects.requireNonNull(RegisterMenu.class.getClassLoader().getResource("register.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();


    }

    public void loadUsers(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/userMenu.fxml"));
       // Parent root = FXMLLoader.load(Objects.requireNonNull(UsersMenuFx.class.getClassLoader().getResource("usersMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }
    public void loadViewEvent(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/eventsLog.fxml"));

      //  Parent root = FXMLLoader.load(Objects.requireNonNull(EventsLogFx.class.getClassLoader().getResource("eventsLog.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }

    public void loadAddSug(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/suggestionsMenu.fxml"));

      //  Parent root = FXMLLoader.load(Objects.requireNonNull(SuggestionsMenuFx.class.getClassLoader().getResource("suggestionsMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();}

}
