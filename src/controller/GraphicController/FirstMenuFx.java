package controller.GraphicController;

import controller.RegisterMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.Account;
import view.Main;

import java.io.IOException;
import java.util.Objects;

public class FirstMenuFx {
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

    public void loadAccount(ActionEvent actionEvent) {
        Parent root = FXMLLoader.load(Objects.requireNonNull(SellerMenuFx.class.getClassLoader().getResource("sellerMenuFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadReg(ActionEvent actionEvent) {
        Parent root = FXMLLoader.load(Objects.requireNonNull(SellerMenuFx.class.getClassLoader().getResource("sellerMenuFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadGames(ActionEvent actionEvent) {
        Parent root = FXMLLoader.load(Objects.requireNonNull(SellerMenuFx.class.getClassLoader().getResource("sellerMenuFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadLogin(ActionEvent actionEvent) {
        Parent root = FXMLLoader.load(Objects.requireNonNull(SellerMenuFx.class.getClassLoader().getResource("sellerMenuFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void loadFriends(ActionEvent actionEvent) {
    }
}
