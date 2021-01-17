package sample.controller.graphic.plato;

//import controller.RegisterMenu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;
import sample.model.platoModel.Account;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import java.io.IOException;

//import model.Admin;
//import model.Player;
//import view.Main;

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
    public void openScoreBoardMenu() throws IOException {
     /* Parent root = FXMLLoader.load(getClass().getResource("../view/ScoreBoardMenu.fxml"));
        stage.setTitle("Score Board Menu");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();*/
    }
    public void loadMain() throws IOException {/*
        Parent root = FXMLLoader.load(getClass().getResource("../view/ScoreBoardMenu.fxml"));
        Main.allStage.setTitle("Score Board Menu");
        Main.allStage.setScene(new Scene(root));
        Main.allStage.show();
        /* Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("register.fxml")));
        Main.allStage.setScene(new Scene(root));
        Main.allStage.show();*/

    }

    public void loadAccount() throws IOException {/*
        Parent root = FXMLLoader.load(Objects.requireNonNull(Account.class.getClassLoader().getResource("accountMenu.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();*/
    }

    public void loadReg() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/registerMenu.fxml"));

        Main.allStage.setScene(new Scene(root));
        Main.allStage.show();}

    public void loadGames() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/games.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadLogin() throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/loginMenuFx.fxml"));

            Main.allStage.setScene(new Scene(root));
            Main.allStage.show();
    }
//helia akhtarkavian pare shod.
    public void loadFriendMenu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/friendsMenu.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
