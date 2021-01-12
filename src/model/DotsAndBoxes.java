package model;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;
import java.util.ArrayList;

public class DbGameMenu {
    public Line vl77;
    public Line vl72;
    public Line vl82;
    public Line vl83;
    public Line vl81;
    public Line vl71;
    public Line vl73;
    public Line hl81;
    public Line hl82;
    public Line hl83;
    public Line hl84;
    public Line hl85;
    public Line hl86;
    public Line hl87;
    public Line vl84;
    public Line vl74;
    public Line vl75;
    public Line vl85;
    public Line vl87;
    public Line vl18;
    public Line vl76;
    public Line vl86;
    public Line vl28;
    public Line vl38;
    public Line vl48;
    public Line vl58;
    public Line vl78;
    public Line vl88;
    public Rectangle r21;
    public Rectangle r22;
    public Rectangle r23;
    public Rectangle r24;
    public Rectangle r25;
    public Rectangle r26;
    public Rectangle r27;
    public Rectangle r12;
    public Rectangle r13;
    public Rectangle r14;
    public Rectangle r15;
    public Rectangle r16;
    public Rectangle r17;
    public Rectangle r31;
    public Rectangle r32;
    public Rectangle r33;
    public Rectangle r34;
    public Rectangle r35;
    public Rectangle r36;
    public Rectangle r37;
    public Rectangle r41;
    public Rectangle r42;
    public Rectangle r43;
    public Rectangle r44;
    public Rectangle r45;
    public Rectangle r46;
    public Rectangle r47;
    public Rectangle r51;
    public Rectangle r52;
    public Rectangle r53;
    public Rectangle r54;
    public Rectangle r55;
    public Rectangle r56;
    public Rectangle r57;
    public Rectangle r61;
    public Rectangle r62;
    public Rectangle r63;
    public Rectangle r64;
    public Rectangle r65;
    public Rectangle r66;
    public Rectangle r67;
    public Rectangle r71;
    public Rectangle r72;
    public Rectangle r73;
    public Rectangle r74;
    public Rectangle r75;
    public Rectangle r76;
    public Circle sc11;
    public Circle sc12;
    public Circle sc13;
    public Circle sc14;
    public Circle sc15;
    public Circle sc16;
    public Circle sc17;
    public Circle sc18;
    public Circle sc21;
    public Circle sc22;
    public Circle sc23;
    public Circle sc24;
    public Circle sc25;
    public Circle sc26;
    public Circle sc27;
    public Circle sc28;
    public Circle sc31;
    public Circle sc32;
    public Circle sc33;
    public Circle sc34;
    public Circle sc35;
    public Circle sc36;
    public Circle sc37;
    public Circle sc38;
    public Circle sc41;
    public Circle sc42;
    public Circle sc43;
    public Circle sc44;
    public Circle sc45;
    public Circle sc46;
    public Circle sc47;
    public Circle sc48;
    public Circle sc51;
    public Circle sc52;
    public Circle sc53;
    public Circle sc54;
    public Circle sc55;
    public Circle sc56;
    public Circle sc57;
    public Circle sc58;
    public Circle sc61;
    public Circle sc62;
    public Circle sc63;
    public Circle sc64;
    public Circle sc65;
    public Circle sc66;
    public Circle sc67;
    public Circle sc68;
    public Circle sc71;
    public Circle sc72;
    public Circle sc73;
    public Circle sc74;
    public Circle sc75;
    public Circle sc76;
    public Circle sc77;
    public Circle sc78;
    public Circle sc81;
    public Circle sc82;
    public Circle sc83;
    public Circle sc84;
    public Circle sc85;
    public Circle sc86;
    public Circle sc87;
    public Circle sc88;
    private boolean hasCountDown;
    public ImageView dbBackground;
    public ImageView p1Img;
    public ImageView p2Img;
    public Text p1Score;
    public Text p2Score;
    public Label alertMessage;
    public Line hl11;
    public Line hl12;
    public Line hl13;
    public Line hl14;
    public Line hl15;
    public Line hl16;
    public Line hl17;
    public Line hl21;
    public Line hl22;
    public Line hl23;
    public Line hl24;
    public Line hl25;
    public Line hl26;
    public Line hl27;
    public Line hl31;
    public Line hl32;
    public Line hl33;
    public Line hl34;
    public Line hl35;
    public Line hl36;
    public Line hl37;
    public Line hl41;
    public Line hl42;
    public Line hl43;
    public Line hl44;
    public Line hl45;
    public Line hl46;
    public Line hl47;
    public Line hl51;
    public Line hl52;
    public Line hl53;
    public Line hl54;
    public Line hl55;
    public Line hl56;
    public Line hl57;
    public Line hl61;
    public Line hl62;
    public Line hl63;
    public Line hl64;
    public Line hl65;
    public Line hl66;
    public Line hl67;
    public Line hl71;
    public Line hl72;
    public Line hl73;
    public Line hl74;
    public Line hl75;
    public Line hl76;
    public Line hl77;
    public Line vl11;
    public Line vl12;
    public Line vl13;
    public Line vl14;
    public Line vl15;
    public Line vl16;
    public Line vl17;
    public Line vl21;
    public Line vl22;
    public Line vl23;
    public Line vl24;
    public Line vl25;
    public Line vl26;
    public Line vl27;
    public Line vl31;
    public Line vl32;
    public Line vl33;
    public Line vl34;
    public Line vl35;
    public Line vl36;
    public Line vl37;
    public Line vl41;
    public Line vl42;
    public Line vl43;
    public Line vl44;
    public Line vl45;
    public Line vl46;
    public Line vl47;
    public Line vl51;
    public Line vl52;
    public Line vl53;
    public Line vl54;
    public Line vl55;
    public Line vl56;
    public Line vl57;
    //moraba haye tamame khuneha
    public Rectangle r11;
    public Rectangle r77;
    private ArrayList<Circle> selectedC=new ArrayList<>();
    private boolean isSecondCircle=false;
    private DBPlayer firstPlayer;
    private DbGameMenu secondPlayer;
    private int firstPlayerScore;
    private int secondPlayerScore;
    private boolean isFirstPlayerTurn;
    private boolean isRectangleDone;
    private ArrayList<Line> selectedL;
    //   private boolean isFirst;
    private Stage stage;

    public void setHasCountDown(boolean hasCountDown) {
        this.hasCountDown = hasCountDown;
    }
    @FXML
   /* public void initialize(){
        dbBackground.setOnMouseClicked(e->{
            double x=e.getX();
            double y=e.getY();
            Circle circle=new Circle(x,y,10);
            Group root = new Group(circle);
         //   primaryStage.setTitle("Hello World");
            stage.setScene(new Scene(root, 300, 275));
            stage.show();
        });
    }*/

   /* public void drawCircle(int centerX,int centerY){
//Drawing a Circle
        Circle circle = new Circle(centerX, centerY, 10);

        //Creating a Group object
        Group root = new Group(circle);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/
    public void setTimer(){
        // Timer timer=new Timer(120000,this);
    }

    public void drawCircle(MouseEvent mouseEvent) {
        double x=  mouseEvent.getX();
        double y=mouseEvent.getY();
        Circle circle=new Circle(x,y,10);
        circle.setVisible(true);
    }

    public void showC(MouseEvent mouseEvent) {
        double x= MouseInfo.getPointerInfo().getLocation().getX();
        double y=MouseInfo.getPointerInfo().getLocation().getY();
        //command for first player
        if (isFirstPlayerTurn) {
            if (!isSecondCircle) {
                if (x >11 || x<47 && y>4 ||y<40) {
                    sc11.setVisible(true);
                    selectedC.add(sc11);
                } else if () {
                }


                isSecondCircle = false;

            } else {
                if (x >11 || x<47 && y>4 ||y<40) {
                    Circle firstCircle =selectedC.get(0);
                    if (firstCircle.getCenterX()==80 && firstCircle.getCenterY()==22){
                        sc11.setVisible(true);
                        hl11.setVisible(true);
                        //baraye rang
                        hl11;

                    }
                    else if (firstCircle.getCenterX()==29&&firstCircle.getCenterY()==73){
                        sc21.setVisible(true);
                        vl21.setVisible(true);
                    }
                    else{
                        alertMessage.setText("invalid move");
                    }
                    //baraye khali kardane arraylist bara hamash lazeme
                    selectedC.clear();


                }

                isSecondCircle = true;
            }
            isFirstPlayerTurn=false;
        }
        //commands for second player
        else {


            isFirstPlayerTurn=true;
        }
    }


    /*public void showL(MouseEvent mouseEvent) {
        double x= MouseInfo.getPointerInfo().getLocation().getX();
        double y=MouseInfo.getPointerInfo().getLocation().getY();
        Circle circle1= selectedC.get(0);
        Circle circle2=selectedC.get(1);
        if (circle1.getCenterX()==29&& circle2.getCenterY()==22){

        }


    }*/

  /*  public void drawLine(MouseEvent mouseEvent){
        if (isFirstPoint){
            drawCircle();
        }
        else{
            drawCircle();

        }
    }*/

}
