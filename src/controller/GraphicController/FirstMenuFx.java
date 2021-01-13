package controller.GraphicController;

import controller.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import model.Account;
import model.Admin;
import model.Player;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class FirstMenuFx {
    public Button firstMainMenuB;
    public Button firstAccountB;
    public Button firstRegB;
    public Button firstGamesB;
    public Button firstLoginB;
    public Button firstFriendB;
    private static Player loggedInPlayer;

    public static Player getLoggedInPlayer() {
        return loggedInPlayer;
    }

    public static Admin getLoggedInAdmin() {
        return loggedInAdmin;
    }

    public static void setLoggedInPlayer(Player loggedInPlayer) {
        FirstMenuFx.loggedInPlayer = loggedInPlayer;
    }

    public static void setLoggedInAdmin(Admin loggedInAdmin) {
        FirstMenuFx.loggedInAdmin = loggedInAdmin;
    }

    private static Admin loggedInAdmin;

    public static Account getLoginAccount() {
        return loginAccount;
    }

    public static Account loginAccount;
    public void loadMain(ActionEvent actionEvent) throws IOException {
         Parent root = FXMLLoader.load(Objects.requireNonNull(RegisterMenu.class.getClassLoader().getResource("register.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();

    }

    public void loadAccount(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Account.class.getClassLoader().getResource("accountMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadReg(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(RegisterMenuFx.class.getClassLoader().getResource("registerMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadGames(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GamesFx.class.getClassLoader().getResource("games.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadLogin(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(LoginMenuFx.class.getClassLoader().getResource("loginMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
//helia akhtarkavian pare shod.
    public void loadFriends(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(FriendsMenuFx.class.getClassLoader().getResource("friendsMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
