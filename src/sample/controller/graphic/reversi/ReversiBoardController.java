package sample.controller.graphic.reversi;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import org.junit.Test;
import sample.Main;
import sample.model.reversiModel.Board;
import sample.model.reversiModel.ReversiGame;
import sample.model.reversiModel.ReversiPlayer;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ReversiBoardController implements Initializable {
    public Label MessagePreviewLabel;
    public ReversiGame reversiGame;
    public Board board ;
    public Circle Circle11;public Circle Circle12 ;public Circle Circle13;public Circle Circle14;public Circle Circle15;public Circle Circle16;public Circle Circle17;public Circle Circle18;
    public Circle Circle21;public Circle Circle22 ;public Circle Circle23;public Circle Circle24;public Circle Circle25;public Circle Circle26;public Circle Circle27;public Circle Circle28;
    public Circle Circle31;public Circle Circle32 ;public Circle Circle33;public Circle Circle34;public Circle Circle35;public Circle Circle36;public Circle Circle37;public Circle Circle38;
    public Circle Circle41;public Circle Circle42 ;public Circle Circle43;public Circle Circle44;public Circle Circle45;public Circle Circle46;public Circle Circle47;public Circle Circle48;
    public Circle Circle51;public Circle Circle52 ;public Circle Circle53;public Circle Circle54;public Circle Circle55;public Circle Circle56;public Circle Circle57;public Circle Circle58;
    public Circle Circle61;public Circle Circle62 ;public Circle Circle63;public Circle Circle64;public Circle Circle65;public Circle Circle66;public Circle Circle67;public Circle Circle68;
    public Circle Circle71;public Circle Circle72 ;public Circle Circle73;public Circle Circle74;public Circle Circle75;public Circle Circle76;public Circle Circle77;public Circle Circle78;
    public Circle Circle81;public Circle Circle82 ;public Circle Circle83;public Circle Circle84;public Circle Circle85;public Circle Circle86;public Circle Circle87;public Circle Circle88;
    public ArrayList<Circle> AllCircles = new ArrayList();
    public Circle Circle1;
    public Circle Circle2;
    public Label Player1ScoreLabel;
    public Label Player2ScoreLabel;
    public Button ChangeTurnButton;
    public Label PlayerTurnlabel;
    public Button BackButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        board = StartMenuController.getReversiGame().getBoard();
        this.reversiGame = StartMenuController.getReversiGame();
        AllCircles.add(Circle11);AllCircles.add(Circle12);AllCircles.add(Circle13);AllCircles.add(Circle14);AllCircles.add(Circle15);AllCircles.add(Circle16);AllCircles.add(Circle17);AllCircles.add(Circle18);
        AllCircles.add(Circle21);AllCircles.add(Circle22);AllCircles.add(Circle23);AllCircles.add(Circle24);AllCircles.add(Circle25);AllCircles.add(Circle26);AllCircles.add(Circle27);AllCircles.add(Circle28);
        AllCircles.add(Circle31);AllCircles.add(Circle32);AllCircles.add(Circle33);AllCircles.add(Circle34);AllCircles.add(Circle35);AllCircles.add(Circle36);AllCircles.add(Circle37);AllCircles.add(Circle38);
        AllCircles.add(Circle41);AllCircles.add(Circle42);AllCircles.add(Circle43);AllCircles.add(Circle44);AllCircles.add(Circle45);AllCircles.add(Circle46);AllCircles.add(Circle47);AllCircles.add(Circle48);
        AllCircles.add(Circle51);AllCircles.add(Circle52);AllCircles.add(Circle53);AllCircles.add(Circle54);AllCircles.add(Circle55);AllCircles.add(Circle56);AllCircles.add(Circle57);AllCircles.add(Circle58);
        AllCircles.add(Circle61);AllCircles.add(Circle62);AllCircles.add(Circle63);AllCircles.add(Circle64);AllCircles.add(Circle65);AllCircles.add(Circle66);AllCircles.add(Circle67);AllCircles.add(Circle68);
        AllCircles.add(Circle71);AllCircles.add(Circle72);AllCircles.add(Circle73);AllCircles.add(Circle74);AllCircles.add(Circle75);AllCircles.add(Circle76);AllCircles.add(Circle77);AllCircles.add(Circle78);
        AllCircles.add(Circle81);AllCircles.add(Circle82);AllCircles.add(Circle83);AllCircles.add(Circle84);AllCircles.add(Circle85);AllCircles.add(Circle86);AllCircles.add(Circle87);AllCircles.add(Circle88);
        Circle44.setFill(reversiGame.getPlayer1().getColor());
        Circle55.setFill(reversiGame.getPlayer1().getColor());
        Circle45.setFill(reversiGame.getPlayer2().getColor());
        Circle54.setFill(reversiGame.getPlayer2().getColor());
        Circle1.setFill(reversiGame.getPlayer1().getColor());
        Circle2.setFill(reversiGame.getPlayer2().getColor());
    }
    public void OnBackButtonClicked() throws IOException {
        if (reversiGame.getGameIsOnGoing()){
            Main.menuController.openStartMenu();
            reversiGame.getPlayer1().draw();
            reversiGame.getPlayer2().draw();
        }else{
            Main.menuController.openStartMenu();
        }
    }
    public void OnChangeTurnButton(){
        if (reversiGame.getCurrentPlayer().hasMadeMove) {
            reversiGame.switchCurrentPlayer();
            PlayerTurnlabel.setText("its player " + reversiGame.getCurrentPlayer().getPlayerNum()+"'s turn");
        }else{
            MessagePreviewLabel.setText("You have'nt done your turn , please play your turn");
            MessagePreviewLabel.setTextFill(Color.RED);
        }
    }
    public void NotValidCoordinateError(){
        MessagePreviewLabel.setText("Coordinates must be inside the table");
        MessagePreviewLabel.setTextFill(Color.RED);
    }
    public void NotValidMoveError(){
        MessagePreviewLabel.setText("This move is not valid");
        MessagePreviewLabel.setTextFill(Color.RED);
    }
    public void MoveDonePreview(int x , int y , int playernum){
        MessagePreviewLabel.setText("Place with x:"+x+" and y:"+y+" was filled by player" + playernum);
        MessagePreviewLabel.setTextFill(Color.GREEN);
    }
    public void NotEmptySpotError(){
        MessagePreviewLabel.setText("this spot is'nt empty");
        MessagePreviewLabel.setTextFill(Color.RED);
    }
    public void GameIsFinishedError(){
        MessagePreviewLabel.setText("Game Is finished");
        MessagePreviewLabel.setTextFill(Color.RED);
    }
    public void MoveDoneError(){
        MessagePreviewLabel.setText("You've done your move");
        MessagePreviewLabel.setTextFill(Color.RED);
    }
    public void setDot(int x , int y , ReversiPlayer player) {
        if (CanMakeMove(player.getPlayerNum())) {
            int playerNum = player.getPlayerNum();
            if (isValid(x, y, playerNum) && isEmpty(x, y) && reversiGame.getGameIsOnGoing() && !reversiGame.getCurrentPlayer().hasMadeMove) {
                board.getBoard()[x][y] = playerNum;
                getCircleById(x, y).setFill(reversiGame.getCurrentPlayer().getColor());
                MoveDonePreview(x, y, player.getPlayerNum());
                board.setLastX(x);
                board.setLastY(y);
                reversiGame.getCurrentPlayer().setHasMadeMove(true);
            } else if (!reversiGame.getGameIsOnGoing()) {
                GameIsFinishedError();
                return;
            } else if (!isEmpty(x, y)) {
                NotEmptySpotError();
                return;
            } else if (reversiGame.getCurrentPlayer().hasMadeMove) {
                MoveDoneError();
                return;
            } else {
                NotValidMoveError();
                return;
            }
            if (isValidUp(x, y, playerNum))
                changeUp(x, y, playerNum);
            if (isValidUpright(x, y, playerNum))
                changeUpright(x, y, playerNum);
            if (isValidUpleft(x, y, playerNum))
                changeUpleft(x, y, playerNum);
            if (isValidLeft(x, y, playerNum))
                changeLeft(x, y, playerNum);
            if (isValidRight(x, y, playerNum))
                changeRight(x, y, playerNum);
            if (isValidDownRight(x, y, playerNum))
                changeDownright(x, y, playerNum);
            if (isValidDownleft(x, y, playerNum))
                changeDownleft(x, y, playerNum);
            if (isValidDown(x, y, playerNum))
                changeDown(x, y, playerNum);
            if (isBoardFull()) {
                reversiGame.setGameIsOnGoing(false);
                CalculatePointsAndSetWinner(reversiGame);
            }
            UpdateScores();
        }else{
            reversiGame.setGameIsOnGoing(false);
            CalculatePointsAndSetWinner(reversiGame);

        }
    }
    public boolean CanMakeMove(int playernum ){
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (isValid(i , j , playernum))
                    return true;
            }
        }
        return false;
    }
    public boolean isEmpty(int x , int y){
        if (board.getBoard()[x][y]==0){
            return true;
        }
        return false;
    }
    @Test
    public boolean isBoardFull(){
        int n = 0;
        for (int i = 0; i <=7 ; i++) {
            for (int j = 0; j <=7 ; j++) {
                if (this.board.getBoard()[i][j]!=0)
                    n++;
            }
        }
        if (n == 64){
            return true;
        }
        return false;
    }
    public void changeUp(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x][y+i] != playerNum ){
            this.board.getBoard()[x][y+i]=playerNum;
            getCircleById(x, y+i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeDown(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x][y-i] != playerNum ){
            this.board.getBoard()[x][y-i]=playerNum;
            getCircleById(x, y-i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeRight(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x+i][y] != playerNum ){
            this.board.getBoard()[x+i][y]=playerNum;
            getCircleById(x+i, y).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeLeft(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x-i][y] != playerNum ){
            this.board.getBoard()[x-i][y]=playerNum;
            getCircleById(x-i, y).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeUpright(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x+i][y+i] != playerNum && isValidCordinate(x+i,y+i)){
            this.board.getBoard()[x+i][y+i]=playerNum;
            getCircleById(x+i, y+i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeUpleft(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x-i][y+i] != playerNum && isValidCordinate(x-i,y+i)){
            this.board.getBoard()[x-i][y+i]=playerNum;
            getCircleById(x-i, y+i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeDownleft(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x-i][y-i] != playerNum && isValidCordinate(x-i,y-i)){
            this.board.getBoard()[x-i][y-i]=playerNum;
            getCircleById(x-i, y-i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }

    public void changeDownright(int x , int y , int playerNum){
        int i = 1;
        while (this.board.getBoard()[x+i][y-i] != playerNum && isValidCordinate(x+i,y-i)){
            this.board.getBoard()[x+i][y-i]=playerNum;
            getCircleById(x+i, y-i).setFill(reversiGame.getCurrentPlayer().getColor());
            i++;
        }
    }
    // for being valid its need to be valid in minimum of 1 of the ways and it needs to be empty
    public boolean isValid(int x , int y , int playerNum){
        return ((isValidUp(x,y,playerNum) ||
                isValidDown(x,y,playerNum) ||
                isValidLeft(x,y,playerNum) ||
                isValidRight(x,y,playerNum) ||
                isValidDownleft(x,y,playerNum) ||
                isValidDownRight(x,y,playerNum)||
                isValidUpleft(x,y,playerNum) ||
                isValidUpright(x,y,playerNum)) && isEmpty(x,y)
        );
    }

    public boolean isValidUp(int x , int y , int playerNum) {
        if (y <= 7) {
            int otherPlayerNum = 1;
            if (playerNum == 1) {
                otherPlayerNum = 2;
            }
            int iterator = y + 1;
            while (  iterator <= 8 && (board.getBoard()[x][iterator] == otherPlayerNum)) {
                iterator++;
            }
            if (iterator == 9) {
                return false;
            } else if (this.board.getBoard()[x][iterator] == playerNum && iterator != y + 1) {
                return true;
            } else if (this.board.getBoard()[x][iterator] == 0) {
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isValidDown(int x , int y , int playerNum) {
        if (y > 1) {
            int otherPlayerNum = 1;
            if (playerNum == 1) {
                otherPlayerNum = 2;
            }
            int iterator = y - 1;
            while ( iterator >= 1 && this.board.getBoard()[x][iterator] == otherPlayerNum ) {
                iterator--;
            }
            if (iterator == 0) {
                return false;
            } else if (this.board.getBoard()[x][iterator] == playerNum && iterator != y - 1) {
                return true;
            } else if (this.board.getBoard()[x][iterator] == 0) {
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isValidLeft(int x , int y , int playerNum) {
        if (x > 1) {
            int otherPlayerNum = 1;
            if (playerNum == 1) {
                otherPlayerNum = 2;
            }
            int iterator = x - 1;
            while ( iterator >= 1 && this.board.getBoard()[iterator][y] == otherPlayerNum ) {
                iterator--;
            }
            if (iterator == 0) {
                return false;
            } else if (this.board.getBoard()[iterator][y] == playerNum && iterator != x - 1) {
                return true;
            } else if (this.board.getBoard()[iterator][y] == 0) {
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isValidRight(int x , int y , int playerNum) {
        if (x < 8) {
            int otherPlayerNum = 1;
            if (playerNum == 1) {
                otherPlayerNum = 2;
            }
            int iterator = x + 1;
            while ( iterator <= 8 && this.board.getBoard()[iterator][y] == otherPlayerNum ) {
                iterator++;
            }
            if (iterator == 9) {
                return false;
            } else if (this.board.getBoard()[iterator][y] == playerNum && iterator != x + 1) {
                return true;
            } else if (this.board.getBoard()[iterator][y] == 0) {
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isValidUpright(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while ( isValidCordinate(x+i , y+i) && this.board.getBoard()[x+i][y+i] == otherPlayerNum ){
            i++;
        }
        if (!isValidCordinate(x+i,y+i)){
            return false;
        }else if( this.board.getBoard()[x+i][y+i] == playerNum && i!=1){
            return true;
        }else if ( this.board.getBoard()[x+i][y+i] == 0){
            return false;
        }
        return false;
    }

    public boolean isValidUpleft(int x , int y, int playerNum) {
        int otherPlayerNum = 1;
        if (playerNum == 1) {
            otherPlayerNum = 2;
        }
        int i = 1;
        while ( isValidCordinate(x - i, y + i) && this.board.getBoard()[x - i][y + i] == otherPlayerNum ) {
            i++;
        }
        if (!isValidCordinate(x - i, y + i)) {
            return false;
        } else if (this.board.getBoard()[x - i][y + i] == playerNum && i != 1) {
            return true;
        } else if (this.board.getBoard()[x - i][y + i] == 0) {
            return false;
        }
        return false;
    }

    public boolean isValidDownleft(int x , int y, int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while ( isValidCordinate(x-i , y-i) && this.board.getBoard()[x-i][y-i] == otherPlayerNum  ){
            i++;
        }
        if (!isValidCordinate(x-i,y-i)){
            return false;
        }else if( this.board.getBoard()[x-i][y-i] == playerNum && i!=1){
            return true;
        }else if ( this.board.getBoard()[x-i][y-i] == 0){
            return false;
        }
        return false;
    }

    public boolean isValidDownRight(int x , int y, int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while (isValidCordinate(x+i , y-i) && this.board.getBoard()[x+i][y-i] == otherPlayerNum   ){
            i++;
        }
        if (!isValidCordinate(x+i,y-i)){
            return false;
        }else if( this.board.getBoard()[x+i][y-i] == playerNum && i!=1){
            return true;
        }else if ( this.board.getBoard()[x+i][y-i] == 0){
            return false;
        }
        return false;
    }

    public static boolean isValidCordinate(int x , int y){
        if ( x >= 1 && x <=8 && y >= 1 && y<=8){
            return true;
        }
        return false;
    }  public Circle getCircleById(int x , int y){
        StringBuilder id = new StringBuilder();
        id.append("Circle");
        id.append(x);
        id.append(y);
        Circle wantedCircle = null;
        for (Circle allCircle : AllCircles) {
            if (allCircle.getId().equals(id.toString()))
                wantedCircle = allCircle;
        }
        return wantedCircle;
    }
    @Test
    public void getCircleByIdTest(){
        System.out.println("h");
    }
    public void CalculatePointsAndSetWinner(ReversiGame reversiGame){
        int Player1Score = 0;
        int Player2Score = 0;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (reversiGame.getBoard().getBoard()[i][j]==1){
                    Player1Score ++;
                }else if (reversiGame.getBoard().getBoard()[i][j]==2){
                    Player2Score ++;
                }
            }
        }
        if (Player1Score > Player2Score){
            reversiGame.setWinner(reversiGame.getPlayer1());
            MessagePreviewLabel.setText("Winner is player with username :"+ reversiGame.getPlayer1().getUsername()+ " With points : " + Player1Score + "-" + Player2Score);
            MessagePreviewLabel.setTextFill(Color.GREEN);
            reversiGame.getPlayer1().won();
            reversiGame.getPlayer2().lost();
            return;
        }else if(Player1Score < Player2Score){
            reversiGame.setWinner(reversiGame.getPlayer2());
            MessagePreviewLabel.setText("Winner is player with username :"+ reversiGame.getPlayer2().getUsername()+ " With points : " + Player2Score + "-" + Player1Score);
            MessagePreviewLabel.setTextFill(Color.GREEN);
            reversiGame.getPlayer2().won();
            reversiGame.getPlayer1().lost();
            return;
        }else{ // in case the points are equal
            reversiGame.GameIsEven();
            MessagePreviewLabel.setText("both players reached the score of "+ Player1Score+" and this game is even !!");
            MessagePreviewLabel.setTextFill(Color.GRAY);
            reversiGame.getPlayer1().draw();
            reversiGame.getPlayer2().draw();
            return;
        }
    }
    public void UpdateScores(){
        int Player1Score = 0;
        int Player2Score = 0;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (reversiGame.getBoard().getBoard()[i][j]==1){
                    Player1Score ++;
                }else if (reversiGame.getBoard().getBoard()[i][j]==2){
                    Player2Score ++;
                }
            }
        }
        Player1ScoreLabel.setText(String.valueOf(Player1Score));
        Player2ScoreLabel.setText(String.valueOf(Player2Score));
    }
    public void OnCircle11Click(){
        int x = Integer.parseInt(String.valueOf(Circle11.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle11.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());
        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle12Click(){
        int x = Integer.parseInt(String.valueOf(Circle12.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle12.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle13Click(){
        int x = Integer.parseInt(String.valueOf(Circle13.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle13.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());
        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle14Click(){
        int x = Integer.parseInt(String.valueOf(Circle14.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle14.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle15Click(){
        int x = Integer.parseInt(String.valueOf(Circle15.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle15.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle16Click(){
        int x = Integer.parseInt(String.valueOf(Circle16.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle16.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle17Click(){
        int x = Integer.parseInt(String.valueOf(Circle17.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle17.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle18Click(){
        int x = Integer.parseInt(String.valueOf(Circle18.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle18.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle21Click(){
        int x = Integer.parseInt(String.valueOf(Circle21.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle21.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle22Click(){
        int x = Integer.parseInt(String.valueOf(Circle22.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle22.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle23Click(){
        int x = Integer.parseInt(String.valueOf(Circle23.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle23.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle24Click(){
        int x = Integer.parseInt(String.valueOf(Circle24.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle24.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle25Click(){
        int x = Integer.parseInt(String.valueOf(Circle25.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle25.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle26Click(){
        int x = Integer.parseInt(String.valueOf(Circle26.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle26.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle27Click(){
        int x = Integer.parseInt(String.valueOf(Circle27.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle27.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle28Click(){
        int x = Integer.parseInt(String.valueOf(Circle28.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle28.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle31Click(){
        int x = Integer.parseInt(String.valueOf(Circle31.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle31.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle32Click(){
        int x = Integer.parseInt(String.valueOf(Circle32.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle32.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle33Click(){
        int x = Integer.parseInt(String.valueOf(Circle33.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle33.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle34Click(){
        int x = Integer.parseInt(String.valueOf(Circle34.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle34.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle35Click(){
        int x = Integer.parseInt(String.valueOf(Circle35.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle35.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle36Click(){
        int x = Integer.parseInt(String.valueOf(Circle36.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle36.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle37Click(){
        int x = Integer.parseInt(String.valueOf(Circle37.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle37.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle38Click(){
        int x = Integer.parseInt(String.valueOf(Circle38.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle38.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle41Click(){
        int x = Integer.parseInt(String.valueOf(Circle41.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle41.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle42Click(){
        int x = Integer.parseInt(String.valueOf(Circle42.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle42.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle43Click(){
        int x = Integer.parseInt(String.valueOf(Circle43.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle43.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle44Click(){
        int x = Integer.parseInt(String.valueOf(Circle44.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle44.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle45Click(){
        int x = Integer.parseInt(String.valueOf(Circle45.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle45.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle46Click(){
        int x = Integer.parseInt(String.valueOf(Circle46.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle46.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle47Click(){
        int x = Integer.parseInt(String.valueOf(Circle47.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle47.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle48Click(){
        int x = Integer.parseInt(String.valueOf(Circle48.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle48.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle51Click(){
        int x = Integer.parseInt(String.valueOf(Circle51.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle51.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle52Click(){
        int x = Integer.parseInt(String.valueOf(Circle52.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle52.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle53Click(){
        int x = Integer.parseInt(String.valueOf(Circle53.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle53.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle54Click(){
        int x = Integer.parseInt(String.valueOf(Circle54.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle54.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle55Click(){
        int x = Integer.parseInt(String.valueOf(Circle55.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle55.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle56Click(){
        int x = Integer.parseInt(String.valueOf(Circle56.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle56.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle57Click(){
        int x = Integer.parseInt(String.valueOf(Circle57.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle57.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle58Click(){
        int x = Integer.parseInt(String.valueOf(Circle58.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle58.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle61Click(){
        int x = Integer.parseInt(String.valueOf(Circle61.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle61.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle62Click(){
        int x = Integer.parseInt(String.valueOf(Circle62.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle62.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle63Click(){
        int x = Integer.parseInt(String.valueOf(Circle63.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle63.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle64Click(){
        int x = Integer.parseInt(String.valueOf(Circle64.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle64.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle65Click(){
        int x = Integer.parseInt(String.valueOf(Circle65.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle65.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle66Click(){
        int x = Integer.parseInt(String.valueOf(Circle66.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle66.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle67Click(){
        int x = Integer.parseInt(String.valueOf(Circle67.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle67.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle68Click(){
        int x = Integer.parseInt(String.valueOf(Circle68.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle68.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle71Click(){
        int x = Integer.parseInt(String.valueOf(Circle71.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle71.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle72Click(){
        int x = Integer.parseInt(String.valueOf(Circle72.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle72.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle73Click(){
        int x = Integer.parseInt(String.valueOf(Circle73.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle73.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle74Click(){
        int x = Integer.parseInt(String.valueOf(Circle74.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle74.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle75Click(){
        int x = Integer.parseInt(String.valueOf(Circle75.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle75.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }
    public void OnCircle76Click(){
        int x = Integer.parseInt(String.valueOf(Circle76.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle76.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle77Click(){
        int x = Integer.parseInt(String.valueOf(Circle77.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle77.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle78Click(){
        int x = Integer.parseInt(String.valueOf(Circle78.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle78.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle81Click(){
        int x = Integer.parseInt(String.valueOf(Circle81.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle81.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle82Click(){
        int x = Integer.parseInt(String.valueOf(Circle82.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle82.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle83Click(){
        int x = Integer.parseInt(String.valueOf(Circle83.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle83.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle84Click(){
        int x = Integer.parseInt(String.valueOf(Circle84.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle84.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle85Click(){
        int x = Integer.parseInt(String.valueOf(Circle85.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle85.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle86Click(){
        int x = Integer.parseInt(String.valueOf(Circle86.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle86.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle87Click(){
        int x = Integer.parseInt(String.valueOf(Circle87.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle87.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());

        }else {
            NotValidCoordinateError();
        }
    }public void OnCircle88Click(){
        int x = Integer.parseInt(String.valueOf(Circle88.getId().charAt(6))) ;
        int y = Integer.parseInt(String.valueOf(Circle88.getId().charAt(7))) ;
        if (isValidCordinate(x,y)) {
            setDot(x,y,reversiGame.getCurrentPlayer());
        }else {
            NotValidCoordinateError();
        }
    }


}
