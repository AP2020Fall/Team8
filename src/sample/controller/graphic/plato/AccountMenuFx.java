package sample.controller.graphic.plato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.controller.plato.AccountsMenu;

import java.io.IOException;

public class AccountMenuFx {
    public Label usernameLablel;
    public Label reversiStatistics;
    public Label DBStatics;
    public Label alertAccount;
    private static Parent pre;
    public static void setPre(Parent pre) {
        AccountMenuFx.pre = pre;
    }
    public void logout(ActionEvent actionEvent) {
        AccountsMenu.logout();
        alertAccount.setText("logout successfully");
        Main.allStage.close();

    }



    public void loadGamesHistory(ActionEvent actionEvent) throws IOException {
        GameHistoryFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/accountMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/gameHistory.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
   @FXML
    public void initialize(){
       System.out.println("tof me");
        reversiStatistics.setText("wins:"+String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiAndWinsCounts())+" played:"+FirstMenuFx.getLoggedInPlayer().getReversiPlayedCounts());
        DBStatics.setText("wins:"+String.valueOf(FirstMenuFx.getLoggedInPlayer().getReversiAndWinsCounts())+" played:"+FirstMenuFx.getLoggedInPlayer().getReversiPlayedCounts());
    }

    public void loadProfile(ActionEvent actionEvent) throws IOException {
      UserPro.setPre(FXMLLoader.load(getClass().getResource("/sample/view/accountMenu.fxml")));
        if (FirstMenuFx.getLoggedInPlayer()!=null){
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/userProfile.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();}
        else if (FirstMenuFx.getLoggedInAdmin()!=null){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/userProfile.fxml"));
            Scene pageTwoScene = new Scene(root);
            Main.allStage.setScene(pageTwoScene);
            Main.allStage.show();
        }

    }

    public void loadPlatoStatistics(ActionEvent actionEvent) throws IOException {
        PlatoStatics.setPre(FXMLLoader.load(getClass().getResource("/sample/view/accountMenu.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/platoStatistics.fxml"));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
