package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import sample.Main;

import java.io.IOException;
import java.util.Objects;

public class AdminMenuFx {
    public Button addEventB;
    public Button viewEventB;
    public Button addSugB;
    public Button viewUserAdminB;
    private static Parent pre;

    public static void setPre(Parent pre) {
        AdminMenuFx.pre = pre;
    }

    public void loadAddEvent(ActionEvent actionEvent) throws IOException {
        AddEventFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/addEventFx.fxml"));
     //   Parent root = FXMLLoader.load(Objects.requireNonNull(RegisterMenu.class.getClassLoader().getResource("register.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();


    }

    public void loadUsers(ActionEvent actionEvent) throws IOException {
        UsersMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/usersMenu.fxml"));
       // Parent root = FXMLLoader.load(Objects.requireNonNull(UsersMenuFx.class.getClassLoader().getResource("usersMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }
    public void loadViewEvent(ActionEvent actionEvent) throws IOException {
        EventsLogFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/eventsLog.fxml"));

      //  Parent root = FXMLLoader.load(Objects.requireNonNull(EventsLogFx.class.getClassLoader().getResource("eventsLog.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }

    public void loadAddSug(ActionEvent actionEvent) throws IOException {
        SuggestionsMenuFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/adminMenuFx.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/suggestionsMenu.fxml"));

      //  Parent root = FXMLLoader.load(Objects.requireNonNull(SuggestionsMenuFx.class.getClassLoader().getResource("suggestionsMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();}

    public void exit(MouseEvent mouseEvent) {  System.exit(0);

    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
