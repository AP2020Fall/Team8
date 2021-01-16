package model;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;

public class DotsAndBoxes extends Game {
    public DotsAndBoxes(String gameId, GamePlayer playerOne, GamePlayer playerTwo) {
        super(gameId, playerOne, playerTwo);
    }

    package sample;

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
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            Circle circle=new Circle(x,y,10);
            circle.setVisible(true);
        }

        public void showC(MouseEvent mouseEvent) {
            double x= MouseInfo.getPointerInfo().getLocation().getX();
            double y=MouseInfo.getPointerInfo().getLocation().getY();
            //command for first player
            //player1 color: #bac267 and player2 color: #c17f68
            if (isFirstPlayerTurn) {
                if (!isSecondCircle) {
                    if (x > 11 && x < 47 && y > 4 && y < 40) {
                        sc11.setVisible(true);
                        sc11.setFill(Color.web("#bac267"));
                        selectedC.add(sc11);
                    } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                        sc12.setVisible(true);
                        sc12.setFill(Color.web("#bac267"));
                        selectedC.add(sc12);
                    }

                    else if (x > 112 && x < 148 && y > 5 && y < 41) {
                        sc13.setVisible(true);
                        sc13.setFill(Color.web("#bac267"));
                        selectedC.add(sc13);
                    }
                    else if (x > 161 && x < 197 && y > 5 && y < 41) {
                        sc14.setVisible(true);
                        sc14.setFill(Color.web("#bac267"));
                        selectedC.add(sc14);
                    }

                    else if (x > 212 && x < 248 && y > 5 && y < 41) {
                        sc15.setVisible(true);
                        sc15.setFill(Color.web("#bac267"));
                        selectedC.add(sc15);
                    }

                    else if (x > 262 && x < 298 && y > 5 && y < 41) {
                        sc16.setVisible(true);
                        sc16.setFill(Color.web("#bac267"));
                        selectedC.add(sc16);
                    }
                    else if (x > 312 && x < 348 && y > 5 && y < 41) {
                        sc17.setVisible(true);
                        sc17.setFill(Color.web("#bac267"));
                        selectedC.add(sc17);
                    }
                    else if (x > 360 && x < 396 && y > 5 && y < 41) {
                        sc18.setVisible(true);
                        sc18.setFill(Color.web("#bac267"));
                        selectedC.add(sc18);
                    }
                    else if (x > 11 && x < 47 && y > 55 && y < 91) {
                        sc21.setVisible(true);
                        sc21.setFill(Color.web("#bac267"));
                        selectedC.add(sc21);
                    }
                    else if (x > 98 && x < 62 && y > 55 && y < 91) {
                        sc22.setVisible(true);
                        sc22.setFill(Color.web("#bac267"));
                        selectedC.add(sc22);
                    }
                    else if (x > 148 && x < 112 && y > 55 && y < 91) {
                        sc23.setVisible(true);
                        sc23.setFill(Color.web("#bac267"));
                        selectedC.add(sc23);
                    }
                    else if (x > 197 && x < 161 && y > 55 && y < 91) {
                        sc24.setVisible(true);
                        sc24.setFill(Color.web("#bac267"));
                        selectedC.add(sc24);
                    }
                    else if (x > 248 && x < 212 && y > 55 && y < 91) {
                        sc25.setVisible(true);
                        sc25.setFill(Color.web("#bac267"));
                        selectedC.add(sc25);
                    }
                    else if (x > 298 && x < 262 && y > 55 && y < 91) {
                        sc26.setVisible(true);
                        sc26.setFill(Color.web("#bac267"));
                        selectedC.add(sc26);
                    }
                    else if (x > 348 && x < 312 && y > 55 && y < 91) {
                        sc27.setVisible(true);
                        sc27.setFill(Color.web("#bac267"));
                        selectedC.add(sc27);
                    }
                    else if (x > 360 && x < 396 && y > 55 && y < 91) {
                        sc28.setVisible(true);
                        sc28.setFill(Color.web("#bac267"));
                        selectedC.add(sc28);
                    }
                    else if (x > 11 && x < 47 && y > 105 && y < 141) {
                        sc31.setVisible(true);
                        sc31.setFill(Color.web("#bac267"));
                        selectedC.add(sc31);
                    }
                    else if (x > 98 && x < 62 && y > 105 && y < 141) {
                        sc32.setVisible(true);
                        sc32.setFill(Color.web("#bac267"));
                        selectedC.add(sc32);
                    }
                    else if (x > 112 && x < 148 && y > 106 && y < 142) {
                        sc33.setVisible(true);
                        sc33.setFill(Color.web("#bac267"));
                        selectedC.add(sc33);
                    }
                    else if (x > 161 && x < 197 && y > 106 && y < 142) {
                        sc34.setVisible(true);
                        sc34.setFill(Color.web("#bac267"));
                        selectedC.add(sc34);

                    }
                    else if (x > 212 && x < 248 && y > 106 && y < 142) {
                        sc35.setVisible(true);
                        sc35.setFill(Color.web("#bac267"));
                        selectedC.add(sc35);

                    }
                    else if (x > 262 && x < 298 && y > 106 && y < 142) {
                        sc36.setVisible(true);
                        sc36.setFill(Color.web("#bac267"));
                        selectedC.add(sc36);
                    }
                    else if (x > 312 && x < 348 && y > 106 && y < 142) {
                        sc37.setVisible(true);
                        sc37.setFill(Color.web("#bac267"));
                        selectedC.add(sc37);
                    }
                    else if (x > 360 && x < 396 && y > 106 && y < 142) {
                        sc38.setVisible(true);
                        sc38.setFill(Color.web("#bac267"));
                        selectedC.add(sc38);
                    }

                    else if (x > 11 && x < 47 && y > 155 && y < 191) {
                        sc41.setVisible(true);
                        sc41.setFill(Color.web("#bac267"));
                        selectedC.add(sc41);
                    }
                    else if (x > 62 && x < 98 && y > 155 && y < 191) {
                        sc42.setVisible(true);
                        sc42.setFill(Color.web("#bac267"));
                        selectedC.add(sc42);
                    }

                    else if (x > 112 && x < 148 && y > 156 && y < 192) {
                        sc43.setVisible(true);
                        sc43.setFill(Color.web("#bac267"));
                        selectedC.add(sc43);
                    }
                    else if (x > 161 && x < 197 && y > 156 && y < 192) {
                        sc44.setVisible(true);
                        sc44.setFill(Color.web("#bac267"));
                        selectedC.add(sc44);
                    }
                    else if (x > 212 && x < 248 && y > 156 && y < 192) {
                        sc45.setVisible(true);
                        sc45.setFill(Color.web("#bac267"));
                        selectedC.add(sc45);
                    }
                    else if (x > 262 && x < 298 && y > 156 && y < 192) {
                        sc46.setVisible(true);
                        sc46.setFill(Color.web("#bac267"));
                        selectedC.add(sc46);
                    }
                    else if (x > 312 && x < 348 && y > 156 && y < 192) {
                        sc47.setVisible(true);
                        sc47.setFill(Color.web("#bac267"));
                        selectedC.add(sc47);
                    }
                    else if (x > 360 && x < 396 && y > 156 && y < 192) {
                        sc48.setVisible(true);
                        sc48.setFill(Color.web("#bac267"));
                        selectedC.add(sc48);
                    }
                    else if (x > 11 && x < 47 && y > 206 && y < 242) {
                        sc51.setVisible(true);
                        sc51.setFill(Color.web("#bac267"));
                        selectedC.add(sc51);
                    }
                    else if (x > 62 && x < 98 && y > 205 && y < 241) {
                        sc52.setVisible(true);
                        sc52.setFill(Color.web("#bac267"));
                        selectedC.add(sc52);
                    }
                    else if (x > 112 && x < 148 && y > 206 && y < 242) {
                        sc53.setVisible(true);
                        sc53.setFill(Color.web("#bac267"));
                        selectedC.add(sc53);
                    }

                    else if (x > 161 && x < 197 && y > 205 && y < 241) {
                        sc54.setVisible(true);
                        sc54.setFill(Color.web("#bac267"));
                        selectedC.add(sc54);
                    }
                    else if (x > 212 && x < 248 && y > 205 && y < 241) {
                        sc55.setVisible(true);
                        sc55.setFill(Color.web("#bac267"));
                        selectedC.add(sc55);
                    }
                    else if (x > 262 && x < 298 && y > 205 && y < 241) {
                        sc56.setVisible(true);
                        sc56.setFill(Color.web("#bac267"));
                        selectedC.add(sc56);
                    }
                    else if (x > 312 && x < 348 && y > 205 && y < 241) {
                        sc57.setVisible(true);
                        sc57.setFill(Color.web("#bac267"));
                        selectedC.add(sc57);
                    }
                    else if (x > 360 && x < 396 && y > 205 && y < 241) {
                        sc58.setVisible(true);
                        sc58.setFill(Color.web("#bac267"));
                        selectedC.add(sc58);
                    }

                    else if (x > 11 && x < 47 && y > 255 && y < 291) {
                        sc61.setVisible(true);
                        sc61.setFill(Color.web("#bac267"));
                        selectedC.add(sc61);
                    }
                    else if (x > 62 && x < 98 && y > 255 && y < 291) {
                        sc62.setVisible(true);
                        sc62.setFill(Color.web("#bac267"));
                        selectedC.add(sc62);
                    }
                    else if (x > 112 && x < 148 && y > 256 && y < 292) {
                        sc63.setVisible(true);
                        sc63.setFill(Color.web("#bac267"));
                        selectedC.add(sc63);
                    }
                    else if (x > 161 && x < 197 && y > 256 && y < 292) {
                        sc64.setVisible(true);
                        sc64.setFill(Color.web("#bac267"));
                        selectedC.add(sc64);
                    }
                    else if (x > 212 && x < 248 && y > 256 && y < 292) {
                        sc65.setVisible(true);
                        sc65.setFill(Color.web("#bac267"));
                        selectedC.add(sc65);
                    }
                    else if (x > 262 && x < 298 && y > 256 && y < 292) {
                        sc66.setVisible(true);
                        sc66.setFill(Color.web("#bac267"));
                        selectedC.add(sc66);
                    }
                    else if (x > 312 && x < 348 && y > 256 && y < 292) {
                        sc67.setVisible(true);
                        sc67.setFill(Color.web("#bac267"));
                        selectedC.add(sc67);
                    }
                    else if (x > 360 && x < 396 && y > 256 && y < 292) {
                        sc68.setVisible(true);
                        sc68.setFill(Color.web("#bac267"));
                        selectedC.add(sc68);
                    }
                    else if (x > 10 && x < 46 && y > 306 && y < 342) {
                        sc71.setVisible(true);
                        sc71.setFill(Color.web("#bac267"));
                        selectedC.add(sc71);
                    }
                    else if (x > 61 && x < 97 && y > 305 && y < 341) {
                        sc72.setVisible(true);
                        sc72.setFill(Color.web("#bac267"));
                        selectedC.add(sc72);
                    }
                    else if (x > 111 && x < 147 && y > 306 && y < 342) {
                        sc73.setVisible(true);
                        sc73.setFill(Color.web("#bac267"));
                        selectedC.add(sc73);
                    }
                    else if (x > 160 && x < 196 && y > 306 && y < 342) {
                        sc74.setVisible(true);
                        sc74.setFill(Color.web("#bac267"));
                        selectedC.add(sc74);
                    }

                    else if (x > 211 && x < 247 && y > 306 && y < 342) {
                        sc75.setVisible(true);
                        sc75.setFill(Color.web("#bac267"));
                        selectedC.add(sc75);
                    }
                    else if (x > 261 && x < 297 && y > 306 && y < 342) {
                        sc76.setVisible(true);
                        sc76.setFill(Color.web("#bac267"));
                        selectedC.add(sc76);
                    }
                    else if (x > 311 && x < 347 && y > 306 && y < 342) {
                        sc77.setVisible(true);
                        sc77.setFill(Color.web("#bac267"));
                        selectedC.add(sc77);
                    }
                    else if (x > 359 && x < 395 && y > 306 && y < 342) {
                        sc78.setVisible(true);
                        sc78.setFill(Color.web("#bac267"));
                        selectedC.add(sc78);
                    }
                    else if (x > 11 && x < 47 && y > 355 && y < 391) {
                        sc81.setVisible(true);
                        sc81.setFill(Color.web("#bac267"));
                        selectedC.add(sc81);
                    }

                    else if (x > 61 && x < 97 && y > 356 && y < 392) {
                        sc82.setVisible(true);
                        sc82.setFill(Color.web("#bac267"));
                        selectedC.add(sc82);
                    }

                    else if (x > 111 && x < 147 && y > 356 && y < 392) {
                        sc83.setVisible(true);
                        sc83.setFill(Color.web("#bac267"));
                        selectedC.add(sc83);
                    }
                    else if (x > 159 && x < 195 && y > 356 && y < 392) {
                        sc84.setVisible(true);
                        sc84.setFill(Color.web("#bac267"));
                        selectedC.add(sc84);
                    }
                    else if (x > 211 && x < 247 && y > 356 && y < 392) {
                        sc85.setVisible(true);
                        sc85.setFill(Color.web("#bac267"));
                        selectedC.add(sc85);
                    }
                    else if (x > 261 && x < 297 && y > 356 && y < 392) {
                        sc86.setVisible(true);
                        sc86.setFill(Color.web("#bac267"));
                        selectedC.add(sc86);
                    }
                    else if (x > 312 && x < 348 && y > 356 && y < 392) {
                        sc87.setVisible(true);
                        sc87.setFill(Color.web("#bac267"));
                        selectedC.add(sc87);
                    }
                    else if (x > 360 && x < 396 && y > 356 && y < 392) {
                        sc88.setVisible(true);
                        sc88.setFill(Color.web("#bac267"));
                        selectedC.add(sc88);
                    }
                    isSecondCircle = true;
                }
                //else dovmi commands for second circles and lines
                else {
                    double x1 = selectedC.get(0).getCenterX();
                    double y1 = selectedC.get(0).getCenterY();

                    if (x > 11 && x < 47 && y > 4 && y < 40) {
                        if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                            if (hl11.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                           else {
                                sc12.setVisible(true);
                                hl11.setVisible(true);
                                sc12.setFill(Color.web("#bac267"));
                                hl11.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                            if (vl11.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc21.setVisible(true);
                                vl11.setVisible(true);
                                sc21.setFill(Color.web("#bac267"));
                                vl11.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                        else if (x > 62 && x < 98 && y > 4 && y < 40) {
                        if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                            if (hl11.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc11.setVisible(true);
                                hl11.setVisible(true);
                                sc11.setFill(Color.web("#bac267"));
                                hl11.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                            if (hl12.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc13.setVisible(true);
                                hl12.setVisible(true);
                                sc13.setFill(Color.web("#bac267"));
                                hl12.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                            if (vl12.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc22.setVisible(true);
                                vl12.setVisible(true);
                                sc22.setFill(Color.web("#bac267"));
                                vl12.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 112 && x < 148 && y > 5 && y < 41) {
                        if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                            if (hl12.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc12.setVisible(true);
                                hl12.setVisible(true);
                                sc12.setFill(Color.web("#bac267"));
                                hl12.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                            if (hl13.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc14.setVisible(true);
                                hl13.setVisible(true);
                                sc14.setFill(Color.web("#bac267"));
                                hl13.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()){
                            if (vl13.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc23.setVisible(true);
                                vl13.setVisible(true);
                                sc23.setFill(Color.web("#bac267"));
                                vl13.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 161 && x < 197 && y > 5 && y < 41) {
                        if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                            if (hl13.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                            sc13.setVisible(true);
                                hl13.setVisible(true);
                                sc13.setFill(Color.web("#bac267"));
                                hl13.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                            if (hl14.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc15.setVisible(true);
                                hl14.setVisible(true);
                                sc15.setFill(Color.web("#bac267"));
                                hl14.setFill(Color.web("98c4c0"));
                            }
                        }
                       else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                            if (vl14.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc24.setVisible(true);
                                vl14.setVisible(true);
                                sc24.setFill(Color.web("#bac267"));
                                vl14.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 212 && x < 248 && y > 5 && y < 41) {
                        if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()){
                            if (hl14.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                                else {
                                    sc14.setVisible(true);
                                    hl14.setVisible(true);
                                    sc14.setFill(Color.web("#bac267"));
                                    hl14.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()){
                            if (hl15.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc16.setVisible(true);
                                hl15.setVisible(true);
                                sc16.setFill(Color.web("#bac267"));
                                hl15.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                            if (vl15.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc25.setVisible(true);
                                vl15.setVisible(true);
                                sc25.setFill(Color.web("#bac267"));
                                vl15.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 262 && x < 298 && y > 5 && y < 41) {
                        if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()){
                            if (hl15.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc15.setVisible(true);
                                hl15.setVisible(true);
                                sc15.setFill(Color.web("#bac267"));
                                hl15.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                            if (hl16.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc17.setVisible(true);
                                hl16.setVisible(true);
                                sc17.setFill(Color.web("#bac267"));
                                hl16.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc26.getCenterX()  && y1 == sc26.getCenterY()) {
                            if (vl16.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc26.setVisible(true);
                                vl16.setVisible(true);
                                sc26.setFill(Color.web("#bac267"));
                                vl16.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 312 && x < 348 && y > 5 && y < 41) {
                        if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                            if (hl16.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc16.setVisible(true);
                                hl16.setVisible(true);
                                sc16.setFill(Color.web("#bac267"));
                                hl16.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                            if (hl17.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc18.setVisible(true);
                                hl17.setVisible(true);
                                sc18.setFill(Color.web("#bac267"));
                                hl17.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                            if (vl17.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc27.setVisible(true);
                                vl17.setVisible(true);
                                sc27.setFill(Color.web("#bac267"));
                                vl17.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 5 && y < 41) {
                        if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                            if (hl17.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc17.setVisible(true);
                                hl17.setVisible(true);
                                sc17.setFill(Color.web("#bac267"));
                                hl17.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                            if (vl18.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc28.setVisible(true);
                                vl18.setVisible(true);
                                sc28.setFill(Color.web("#bac267"));
                                vl18.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 11 && x < 47 && y > 55 && y < 91) {
                        if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                            if (hl21.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc22.setVisible(true);
                                hl21.setVisible(true);
                                sc22.setFill(Color.web("#bac267"));
                                hl21.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                            if (vl11.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc11.setVisible(true);
                                vl11.setVisible(true);
                                sc11.setFill(Color.web("#bac267"));
                                vl11.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                            if (vl21.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc31.setVisible(true);
                                vl21.setVisible(true);
                                sc31.setFill(Color.web("#bac267"));
                                vl21.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 98 && x < 62 && y > 55 && y < 91) {
                        if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                            if (vl12.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc12.setVisible(true);
                                vl12.setVisible(true);
                                sc12.setFill(Color.web("#bac267"));
                                vl12.setFill(Color.web("98c4c0"));
                            }
                        } else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                            if (hl21.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc21.setVisible(true);
                                hl21.setVisible(true);
                                sc21.setFill(Color.web("#bac267"));
                                hl21.setFill(Color.web("98c4c0"));
                            }
                        } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                            if (hl22.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc23.setVisible(true);
                                hl22.setVisible(true);
                                sc23.setFill(Color.web("#bac267"));
                                hl22.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                            if (vl22.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc32.setVisible(true);
                                vl22.setVisible(true);
                                sc32.setFill(Color.web("#bac267"));
                                vl22.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 148 && x < 112 && y > 55 && y < 91) {
                        if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                            if (vl13.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc13.setVisible(true);
                                vl13.setVisible(true);
                                sc13.setFill(Color.web("#bac267"));
                                vl13.setFill(Color.web("98c4c0"));
                            }
                        } else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                            if (hl22.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc22.setVisible(true);
                                hl22.setVisible(true);
                                sc22.setFill(Color.web("#bac267"));
                                hl22.setFill(Color.web("98c4c0"));
                            }
                        } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                            if (hl23.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc24.setVisible(true);
                                hl23.setVisible(true);
                                sc24.setFill(Color.web("#bac267"));
                                hl23.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                            if (vl23.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc33.setVisible(true);
                                vl23.setVisible(true);
                                sc33.setFill(Color.web("#bac267"));
                                vl23.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 197 && x < 161 && y > 55 && y < 91) {
                        if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                            if (vl14.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc14.setVisible(true);
                                vl14.setVisible(true);
                                sc14.setFill(Color.web("#bac267"));
                                vl14.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                            if (hl23.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc23.setVisible(true);
                                hl23.setVisible(true);
                                sc23.setFill(Color.web("#bac267"));
                                hl23.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                            if (hl24.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc25.setVisible(true);
                                hl24.setVisible(true);
                                sc25.setFill(Color.web("#bac267"));
                                hl24.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                            if (vl24.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc34.setVisible(true);
                                vl24.setVisible(true);
                                sc34.setFill(Color.web("#bac267"));
                                vl24.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 248 && x < 212 && y > 55 && y < 91) {
                        if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                            if (vl15.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc15.setVisible(true);
                                vl15.setVisible(true);
                                sc15.setFill(Color.web("#bac267"));
                                vl15.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                            if (hl24.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc24.setVisible(true);
                                hl24.setVisible(true);
                                sc24.setFill(Color.web("#bac267"));
                                hl24.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                            if (hl25.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc26.setVisible(true);
                                hl25.setVisible(true);
                                sc26.setFill(Color.web("#bac267"));
                                hl25.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                            if (vl25.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc35.setVisible(true);
                                vl25.setVisible(true);
                                sc35.setFill(Color.web("#bac267"));
                                vl25.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 298 && x < 262 && y > 55 && y < 91) {
                        if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                            if (vl16.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc16.setVisible(true);
                                vl16.setVisible(true);
                                sc16.setFill(Color.web("#bac267"));
                                vl16.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                            if (hl25.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc25.setVisible(true);
                                hl25.setVisible(true);
                                sc25.setFill(Color.web("#bac267"));
                                hl25.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                            if (hl26.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc27.setVisible(true);
                                hl26.setVisible(true);
                                sc27.setFill(Color.web("#bac267"));
                                hl26.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                            if (vl26.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc36.setVisible(true);
                                vl26.setVisible(true);
                                sc36.setFill(Color.web("#bac267"));
                                vl26.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 348 && x < 312 && y > 55 && y < 91) {
                        if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                            if (vl17.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc17.setVisible(true);
                                vl17.setVisible(true);
                                sc17.setFill(Color.web("#bac267"));
                                vl17.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                            if (hl26.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc26.setVisible(true);
                                hl26.setVisible(true);
                                sc26.setFill(Color.web("#bac267"));
                                hl26.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                            if (hl26.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc28.setVisible(true);
                                hl27.setVisible(true);
                                sc28.setFill(Color.web("#bac267"));
                                hl27.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                            if (vl27.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc37.setVisible(true);
                                vl27.setVisible(true);
                                sc37.setFill(Color.web("#bac267"));
                                vl27.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 55 && y < 91) {
                       if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                           if (vl18.isVisible())
                               alertMessage.setText("Oops! This line has already been chosen!");
                           else {
                               sc38.setVisible(true);
                               vl18.setVisible(true);
                               sc38.setFill(Color.web("#bac267"));
                               vl18.setFill(Color.web("98c4c0"));
                           }
                       }
                       else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                           if (hl27.isVisible())
                               alertMessage.setText("Oops! This line has already been chosen!");
                           else {
                               sc27.setVisible(true);
                               hl27.setVisible(true);
                               sc27.setFill(Color.web("#bac267"));
                               hl27.setFill(Color.web("98c4c0"));
                           }
                       }
                       else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                           if (vl27.isVisible())
                               alertMessage.setText("Oops! This line has already been chosen!");
                           else {
                               sc38.setVisible(true);
                               vl27.setVisible(true);
                               sc38.setFill(Color.web("#bac267"));
                               vl27.setFill(Color.web("98c4c0"));
                           }
                       }
                    }
                    else if (x > 11 && x < 47 && y > 105 && y < 141) {
                        if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                            if (vl21.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc21.setVisible(true);
                                vl21.setVisible(true);
                                sc21.setFill(Color.web("#bac267"));
                                vl21.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                            if (hl31.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc32.setVisible(true);
                                hl31.setVisible(true);
                                sc32.setFill(Color.web("#bac267"));
                                hl31.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                            if (vl31.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc41.setVisible(true);
                                vl31.setVisible(true);
                                sc41.setFill(Color.web("#bac267"));
                                vl31.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 98 && x < 62 && y > 105 && y < 141) {
                        if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                            if (vl22.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc22.setVisible(true);
                                vl22.setVisible(true);
                                sc22.setFill(Color.web("#bac267"));
                                vl22.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                            if (hl31.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc31.setVisible(true);
                                hl31.setVisible(true);
                                sc31.setFill(Color.web("#bac267"));
                                hl31.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                            if (hl32.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc33.setVisible(true);
                                hl32.setVisible(true);
                                sc33.setFill(Color.web("#bac267"));
                                hl32.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                            if (vl32.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc42.setVisible(true);
                                vl32.setVisible(true);
                                sc42.setFill(Color.web("#bac267"));
                                vl32.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 112 && x < 148 && y > 106 && y < 142) {
                        if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                            if (vl23.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc23.setVisible(true);
                                vl23.setVisible(true);
                                sc23.setFill(Color.web("#bac267"));
                                vl23.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                            if (hl32.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc32.setVisible(true);
                                hl32.setVisible(true);
                                sc32.setFill(Color.web("#bac267"));
                                hl32.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                            if (hl33.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc34.setVisible(true);
                                hl33.setVisible(true);
                                sc34.setFill(Color.web("#bac267"));
                                hl33.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                            if (vl33.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc43.setVisible(true);
                                vl33.setVisible(true);
                                sc43.setFill(Color.web("#bac267"));
                                vl33.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 161 && x < 197 && y > 106 && y < 142) {
                        if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                            if (vl24.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc24.setVisible(true);
                                vl24.setVisible(true);
                                sc24.setFill(Color.web("#bac267"));
                                vl24.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                            if (hl33.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc33.setVisible(true);
                                hl33.setVisible(true);
                                sc33.setFill(Color.web("#bac267"));
                                hl33.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                            if (hl34.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc35.setVisible(true);
                                hl34.setVisible(true);
                                sc35.setFill(Color.web("#bac267"));
                                hl34.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                            if (vl34.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc44.setVisible(true);
                                vl34.setVisible(true);
                                sc44.setFill(Color.web("#bac267"));
                                vl34.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 212 && x < 248 && y > 106 && y < 142) {
                        if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                            if (vl25.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc25.setVisible(true);
                                vl25.setVisible(true);
                                sc25.setFill(Color.web("#bac267"));
                                vl25.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                            if (hl34.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc34.setVisible(true);
                                hl34.setVisible(true);
                                sc34.setFill(Color.web("#bac267"));
                                hl34.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                            if (hl35.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc36.setVisible(true);
                                hl35.setVisible(true);
                                sc36.setFill(Color.web("#bac267"));
                                hl35.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                            if (vl35.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc45.setVisible(true);
                                vl35.setVisible(true);
                                sc45.setFill(Color.web("#bac267"));
                                vl35.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 262 && x < 298 && y > 106 && y < 142) {
                        if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                            if (vl26.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc26.setVisible(true);
                                vl26.setVisible(true);
                                sc26.setFill(Color.web("#bac267"));
                                vl26.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                            if (hl35.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc35.setVisible(true);
                                hl35.setVisible(true);
                                sc35.setFill(Color.web("#bac267"));
                                hl35.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                            if (hl36.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc37.setVisible(true);
                                hl36.setVisible(true);
                                sc37.setFill(Color.web("#bac267"));
                                hl36.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                            if (vl36.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc46.setVisible(true);
                                vl36.setVisible(true);
                                sc46.setFill(Color.web("#bac267"));
                                vl36.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 312 && x < 348 && y > 106 && y < 142) {
                        if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                            if (vl27.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc27.setVisible(true);
                                vl27.setVisible(true);
                                sc27.setFill(Color.web("#bac267"));
                                vl27.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                            if (hl36.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc36.setVisible(true);
                                hl36.setVisible(true);
                                sc36.setFill(Color.web("#bac267"));
                                hl36.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                            if (hl37.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc38.setVisible(true);
                                hl37.setVisible(true);
                                sc38.setFill(Color.web("#bac267"));
                                hl37.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                            if (vl37.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc47.setVisible(true);
                                vl37.setVisible(true);
                                sc47.setFill(Color.web("#bac267"));
                                vl37.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 106 && y < 142) {
                        if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                            if (vl28.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc28.setVisible(true);
                                vl28.setVisible(true);
                                sc28.setFill(Color.web("#bac267"));
                                vl28.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                            if (hl37.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc37.setVisible(true);
                                hl37.setVisible(true);
                                sc37.setFill(Color.web("#bac267"));
                                hl37.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()){
                            if (vl38.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc48.setVisible(true);
                                vl38.setVisible(true);
                                sc48.setFill(Color.web("#bac267"));
                                vl38.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 11 && x < 47 && y > 155 && y < 191) {
                        if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                            if (vl31.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc31.setVisible(true);
                                vl31.setVisible(true);
                                sc31.setFill(Color.web("#bac267"));
                                vl31.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                            if (hl41.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc42.setVisible(true);
                                hl41.setVisible(true);
                                sc42.setFill(Color.web("#bac267"));
                                hl41.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()){
                            if (vl41.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc51.setVisible(true);
                                vl41.setVisible(true);
                                sc51.setFill(Color.web("#bac267"));
                                vl41.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 62 && x < 98 && y > 155 && y < 191) {
                        if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                            if (vl32.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc32.setVisible(true);
                                vl32.setVisible(true);
                                sc32.setFill(Color.web("#bac267"));
                                vl32.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                            if (hl41.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc41.setVisible(true);
                                hl41.setVisible(true);
                                sc41.setFill(Color.web("#bac267"));
                                hl41.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                            if (hl42.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc43.setVisible(true);
                                hl42.setVisible(true);
                                sc43.setFill(Color.web("#bac267"));
                                hl42.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                            if (vl42.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc52.setVisible(true);
                                vl42.setVisible(true);
                                sc52.setFill(Color.web("#bac267"));
                                vl42.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 112 && x < 148 && y > 156 && y < 192) {
                        if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                            if (vl33.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc33.setVisible(true);
                                vl33.setVisible(true);
                                sc33.setFill(Color.web("#bac267"));
                                vl33.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                            if (hl42.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc42.setVisible(true);
                                hl42.setVisible(true);
                                sc42.setFill(Color.web("#bac267"));
                                hl42.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                            if (hl43.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc44.setVisible(true);
                                hl43.setVisible(true);
                                sc44.setFill(Color.web("#bac267"));
                                hl43.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                            if (vl43.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc53.setVisible(true);
                                vl43.setVisible(true);
                                sc53.setFill(Color.web("#bac267"));
                                vl43.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 161 && x < 197 && y > 156 && y < 192) {
                        if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                            if (vl34.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc34.setVisible(true);
                                vl34.setVisible(true);
                                sc34.setFill(Color.web("#bac267"));
                                vl34.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                            if (hl43.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc43.setVisible(true);
                                hl43.setVisible(true);
                                sc43.setFill(Color.web("#bac267"));
                                hl43.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                            if (hl44.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc45.setVisible(true);
                                hl44.setVisible(true);
                                sc45.setFill(Color.web("#bac267"));
                                hl44.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                            if (vl44.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc54.setVisible(true);
                                vl44.setVisible(true);
                                sc54.setFill(Color.web("#bac267"));
                                vl44.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 212 && x < 248 && y > 156 && y < 192) {
                        if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                            if (vl35.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc35.setVisible(true);
                                vl35.setVisible(true);
                                sc35.setFill(Color.web("#bac267"));
                                vl35.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                            if (hl44.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc44.setVisible(true);
                                hl44.setVisible(true);
                                sc44.setFill(Color.web("#bac267"));
                                hl44.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                            if (hl45.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc46.setVisible(true);
                                hl45.setVisible(true);
                                sc46.setFill(Color.web("#bac267"));
                                hl45.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                            if (vl45.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc55.setVisible(true);
                                vl45.setVisible(true);
                                sc55.setFill(Color.web("#bac267"));
                                vl45.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 262 && x < 298 && y > 156 && y < 192) {
                        if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                            if (vl36.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc36.setVisible(true);
                                vl36.setVisible(true);
                                sc36.setFill(Color.web("#bac267"));
                                vl36.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                            if (hl45.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc45.setVisible(true);
                                hl45.setVisible(true);
                                sc45.setFill(Color.web("#bac267"));
                                hl45.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                            if (hl46.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc47.setVisible(true);
                                hl46.setVisible(true);
                                sc47.setFill(Color.web("#bac267"));
                                hl46.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                            if (vl46.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc56.setVisible(true);
                                vl46.setVisible(true);
                                sc56.setFill(Color.web("#bac267"));
                                vl46.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 312 && x < 348 && y > 156 && y < 192) {
                        if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                            if (vl37.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc37.setVisible(true);
                                vl37.setVisible(true);
                                sc37.setFill(Color.web("#bac267"));
                                vl37.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                            if (hl46.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc46.setVisible(true);
                                hl46.setVisible(true);
                                sc46.setFill(Color.web("#bac267"));
                                hl46.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                            if (hl47.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc48.setVisible(true);
                                hl47.setVisible(true);
                                sc48.setFill(Color.web("#bac267"));
                                hl47.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                            if (vl47.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc57.setVisible(true);
                                vl47.setVisible(true);
                                sc57.setFill(Color.web("#bac267"));
                                vl47.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 156 && y < 192) {
                        if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                            if (vl38.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc38.setVisible(true);
                                vl38.setVisible(true);
                                sc38.setFill(Color.web("#bac267"));
                                vl38.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                            if (hl47.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc47.setVisible(true);
                                hl47.setVisible(true);
                                sc47.setFill(Color.web("#bac267"));
                                hl47.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                            if (vl48.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc58.setVisible(true);
                                vl48.setVisible(true);
                                sc58.setFill(Color.web("#bac267"));
                                vl48.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    //---------------------------------------------------------------------------------
                    // rec part2
                    //---------------------------------------------------------------------------------
                    else if (x > 11 && x < 47 && y > 206 && y < 242) {
                        if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                            if (vl41.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc41.setVisible(true);
                                vl41.setVisible(true);
                                sc41.setFill(Color.web("#bac267"));
                                vl41.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                            if (vl51.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc61.setVisible(true);
                                vl51.setVisible(true);
                                sc61.setFill(Color.web("#bac267"));
                                vl51.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                            if (hl51.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc52.setVisible(true);
                                hl51.setVisible(true);
                                sc52.setFill(Color.web("#bac267"));
                                hl51.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 62 && x < 98 && y > 205 && y < 241) {
                        if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                            if (vl42.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc42.setVisible(true);
                                vl42.setVisible(true);
                                sc42.setFill(Color.web("#bac267"));
                                vl42.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                            if (hl51.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc51.setVisible(true);
                                hl51.setVisible(true);
                                sc51.setFill(Color.web("#bac267"));
                                hl51.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                            if (hl52.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc53.setVisible(true);
                                hl52.setVisible(true);
                                sc53.setFill(Color.web("#bac267"));
                                hl52.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                            if (vl52.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc62.setVisible(true);
                                vl52.setVisible(true);
                                sc62.setFill(Color.web("#bac267"));
                                vl52.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 112 && x < 148 && y > 206 && y < 242) {
                        if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                            if (vl43.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc43.setVisible(true);
                                vl43.setVisible(true);
                                sc43.setFill(Color.web("#bac267"));
                                vl43.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                            if (hl52.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc52.setVisible(true);
                                hl52.setVisible(true);
                                sc52.setFill(Color.web("#bac267"));
                                hl52.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                            if (hl52.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc54.setVisible(true);
                                hl53.setVisible(true);
                                sc54.setFill(Color.web("#bac267"));
                                hl53.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                            if (vl53.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc63.setVisible(true);
                                vl53.setVisible(true);
                                sc63.setFill(Color.web("#bac267"));
                                vl53.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 161 && x < 197 && y > 205 && y < 241) {
                        if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                            if (vl44.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc44.setVisible(true);
                                vl44.setVisible(true);
                                sc44.setFill(Color.web("#bac267"));
                                vl44.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                            if (hl53.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc53.setVisible(true);
                                hl53.setVisible(true);
                                sc53.setFill(Color.web("#bac267"));
                                hl53.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                            if (hl54.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc55.setVisible(true);
                                hl54.setVisible(true);
                                sc55.setFill(Color.web("#bac267"));
                                hl54.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                            if (vl54.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc64.setVisible(true);
                                vl54.setVisible(true);
                                sc64.setFill(Color.web("#bac267"));
                                vl54.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 212 && x < 248 && y > 205 && y < 241) {
                        if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                            if (vl45.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc45.setVisible(true);
                                vl45.setVisible(true);
                                sc45.setFill(Color.web("#bac267"));
                                vl45.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                            if (hl54.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc54.setVisible(true);
                                hl54.setVisible(true);
                                sc54.setFill(Color.web("#bac267"));
                                hl54.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                            if (hl55.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc56.setVisible(true);
                                hl55.setVisible(true);
                                sc56.setFill(Color.web("#bac267"));
                                hl55.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                            if (vl55.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc65.setVisible(true);
                                vl55.setVisible(true);
                                sc65.setFill(Color.web("#bac267"));
                                vl55.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 262 && x < 298 && y > 205 && y < 241) {
                        if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                            if (vl46.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc46.setVisible(true);
                                vl46.setVisible(true);
                                sc46.setFill(Color.web("#bac267"));
                                vl46.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                            if (hl55.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc55.setVisible(true);
                                hl55.setVisible(true);
                                sc55.setFill(Color.web("#bac267"));
                                hl55.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                            if (hl56.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc57.setVisible(true);
                                hl56.setVisible(true);
                                sc57.setFill(Color.web("#bac267"));
                                hl56.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                            if (vl56.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc66.setVisible(true);
                                vl56.setVisible(true);
                                sc66.setFill(Color.web("#bac267"));
                                vl56.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 312 && x < 348 && y > 205 && y < 241) {
                        if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                            if (vl47.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc47.setVisible(true);
                                vl47.setVisible(true);
                                sc47.setFill(Color.web("#bac267"));
                                vl47.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                            if (hl56.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc56.setVisible(true);
                                hl56.setVisible(true);
                                sc56.setFill(Color.web("#bac267"));
                                hl56.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                            if (hl57.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc58.setVisible(true);
                                hl57.setVisible(true);
                                sc58.setFill(Color.web("#bac267"));
                                hl57.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                            if (vl57.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc67.setVisible(true);
                                vl57.setVisible(true);
                                sc67.setFill(Color.web("#bac267"));
                                vl57.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 205 && y < 241) {
                        if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                            if (vl48.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc48.setVisible(true);
                                vl48.setVisible(true);
                                sc48.setFill(Color.web("#bac267"));
                                vl48.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                            if (hl57.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc57.setVisible(true);
                                hl57.setVisible(true);
                                sc57.setFill(Color.web("#bac267"));
                                hl57.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                            if (vl58.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc67.setVisible(true);
                                vl58.setVisible(true);
                                sc67.setFill(Color.web("#bac267"));
                                vl58.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 11 && x < 47 && y > 255 && y < 291) {
                        if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                            if (vl51.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc51.setVisible(true);
                                vl51.setVisible(true);
                                sc51.setFill(Color.web("#bac267"));
                                vl51.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                            if (hl61.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc62.setVisible(true);
                                hl61.setVisible(true);
                                sc62.setFill(Color.web("#bac267"));
                                hl61.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                            if (vl71.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc71.setVisible(true);
                                vl71.setVisible(true);
                                sc71.setFill(Color.web("#bac267"));
                                vl71.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 62 && x < 98 && y > 255 && y < 291) {
                        if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (vl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc52.setVisible(true);
                            vl52.setVisible(true);
                            sc52.setFill(Color.web("#bac267"));
                            vl52.setFill(Color.web("98c4c0"));
                        }
                    }

                    else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (hl61.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc61.setVisible(true);
                            hl61.setVisible(true);
                            sc61.setFill(Color.web("#bac267"));
                            hl61.setFill(Color.web("98c4c0"));
                        }
                    }
                    else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (hl62.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc63.setVisible(true);
                            hl62.setVisible(true);
                            sc63.setFill(Color.web("#bac267"));
                            hl62.setFill(Color.web("98c4c0"));
                        }
                    }
                        else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                            if (vl72.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc72.setVisible(true);
                                vl72.setVisible(true);
                                sc72.setFill(Color.web("#bac267"));
                                vl72.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 112 && x < 148 && y > 256 && y < 292) {
                        if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                            if (vl53.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc53.setVisible(true);
                                vl53.setVisible(true);
                                sc53.setFill(Color.web("#bac267"));
                                vl53.setFill(Color.web("98c4c0"));
                            }
                        }

                        else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                            if (hl62.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc62.setVisible(true);
                                hl62.setVisible(true);
                                sc62.setFill(Color.web("#bac267"));
                                hl62.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                            if (hl63.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc64.setVisible(true);
                                hl63.setVisible(true);
                                sc64.setFill(Color.web("#bac267"));
                                hl63.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                            if (vl73.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc73.setVisible(true);
                                vl73.setVisible(true);
                                sc73.setFill(Color.web("#bac267"));
                                vl73.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 161 && x < 197 && y > 256 && y < 292) {
                        if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                            if (vl54.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc54.setVisible(true);
                                vl54.setVisible(true);
                                sc54.setFill(Color.web("#bac267"));
                                vl54.setFill(Color.web("98c4c0"));
                            }
                        }

                        else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                            if (hl62.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc62.setVisible(true);
                                hl62.setVisible(true);
                                sc62.setFill(Color.web("#bac267"));
                                hl62.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                            if (hl64.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc65.setVisible(true);
                                hl64.setVisible(true);
                                sc65.setFill(Color.web("#bac267"));
                                hl64.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                            if (vl74.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc74.setVisible(true);
                                vl74.setVisible(true);
                                sc74.setFill(Color.web("#bac267"));
                                vl74.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 212 && x < 248 && y > 256 && y < 292) {
                        if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                            if (vl55.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc55.setVisible(true);
                                vl55.setVisible(true);
                                sc55.setFill(Color.web("#bac267"));
                                vl55.setFill(Color.web("98c4c0"));
                            }
                        }

                        else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                            if (hl63.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc64.setVisible(true);
                                hl63.setVisible(true);
                                sc64.setFill(Color.web("#bac267"));
                                hl63.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                            if (hl65.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc66.setVisible(true);
                                hl65.setVisible(true);
                                sc66.setFill(Color.web("#bac267"));
                                hl65.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                            if (vl75.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc75.setVisible(true);
                                vl75.setVisible(true);
                                sc75.setFill(Color.web("#bac267"));
                                vl75.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 262 && x < 298 && y > 256 && y < 292) {
                        if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                            if (vl56.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc56.setVisible(true);
                                vl56.setVisible(true);
                                sc56.setFill(Color.web("#bac267"));
                                vl56.setFill(Color.web("98c4c0"));
                            }
                        }

                        else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                            if (hl64.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc65.setVisible(true);
                                hl64.setVisible(true);
                                sc65.setFill(Color.web("#bac267"));
                                hl64.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                            if (hl66.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc67.setVisible(true);
                                hl66.setVisible(true);
                                sc67.setFill(Color.web("#bac267"));
                                hl66.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                            if (vl76.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc76.setVisible(true);
                                vl76.setVisible(true);
                                sc76.setFill(Color.web("#bac267"));
                                vl76.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 312 && x < 348 && y > 256 && y < 292) {
                        if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                            if (vl57.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc57.setVisible(true);
                                vl57.setVisible(true);
                                sc57.setFill(Color.web("#bac267"));
                                vl57.setFill(Color.web("98c4c0"));
                            }
                        }

                        else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                            if (hl65.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc66.setVisible(true);
                                hl65.setVisible(true);
                                sc66.setFill(Color.web("#bac267"));
                                hl65.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                            if (hl67.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc68.setVisible(true);
                                hl67.setVisible(true);
                                sc68.setFill(Color.web("#bac267"));
                                hl67.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                            if (vl77.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc77.setVisible(true);
                                vl77.setVisible(true);
                                sc77.setFill(Color.web("#bac267"));
                                vl77.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 360 && x < 396 && y > 256 && y < 292) {
                        if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                            if (vl58.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc58.setVisible(true);
                                vl58.setVisible(true);
                                sc58.setFill(Color.web("#bac267"));
                                vl58.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                            if (hl67.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc67.setVisible(true);
                                hl67.setVisible(true);
                                sc67.setFill(Color.web("#bac267"));
                                hl67.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                            if (vl78.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc78.setVisible(true);
                                vl78.setVisible(true);
                                sc78.setFill(Color.web("#bac267"));
                                vl78.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 10 && x < 46 && y > 306 && y < 342) {
                        if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                            if (vl71.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc61.setVisible(true);
                                vl71.setVisible(true);
                                sc61.setFill(Color.web("#bac267"));
                                vl71.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc81.getCenterX() && y1 == sc81.getCenterY()) {
                            if (vl81.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc81.setVisible(true);
                                vl81.setVisible(true);
                                sc81.setFill(Color.web("#bac267"));
                                vl81.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                            if (vl71.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc72.setVisible(true);
                                vl71.setVisible(true);
                                sc72.setFill(Color.web("#bac267"));
                                vl71.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 61 && x < 97 && y > 305 && y < 341) {
                        if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                            if (vl72.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc62.setVisible(true);
                                vl72.setVisible(true);
                                sc62.setFill(Color.web("#bac267"));
                                vl72.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                            if (hl71.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc71.setVisible(true);
                                hl71.setVisible(true);
                                sc71.setFill(Color.web("#bac267"));
                                hl71.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                            if (hl72.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc73.setVisible(true);
                                hl72.setVisible(true);
                                sc73.setFill(Color.web("#bac267"));
                                hl72.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc82.getCenterX() && y1 == sc82.getCenterY()) {
                            if (vl82.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc82.setVisible(true);
                                vl82.setVisible(true);
                                sc82.setFill(Color.web("#bac267"));
                                vl82.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 111 && x < 147 && y > 306 && y < 342) {
                        if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                            if (vl73.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc63.setVisible(true);
                                vl73.setVisible(true);
                                sc63.setFill(Color.web("#bac267"));
                                vl73.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                            if (hl72.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc72.setVisible(true);
                                hl72.setVisible(true);
                                sc72.setFill(Color.web("#bac267"));
                                hl72.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                            if (hl73.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc74.setVisible(true);
                                hl73.setVisible(true);
                                sc74.setFill(Color.web("#bac267"));
                                hl73.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc83.getCenterX() && y1 == sc83.getCenterY()) {
                            if (vl83.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc83.setVisible(true);
                                vl83.setVisible(true);
                                sc83.setFill(Color.web("#bac267"));
                                vl83.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 160 && x < 196 && y > 306 && y < 342) {
                        if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                            if (vl74.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc64.setVisible(true);
                                vl74.setVisible(true);
                                sc64.setFill(Color.web("#bac267"));
                                vl74.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                            if (hl73.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc73.setVisible(true);
                                hl73.setVisible(true);
                                sc73.setFill(Color.web("#bac267"));
                                hl73.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                            if (hl74.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc75.setVisible(true);
                                hl74.setVisible(true);
                                sc75.setFill(Color.web("#bac267"));
                                hl74.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc84.getCenterX() && y1 == sc84.getCenterY()) {
                            if (vl84.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc84.setVisible(true);
                                vl84.setVisible(true);
                                sc84.setFill(Color.web("#bac267"));
                                vl84.setFill(Color.web("98c4c0"));
                            }
                        }
                    }

                    else if (x > 211 && x < 247 && y > 306 && y < 342) {
                        if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                            if (vl75.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc65.setVisible(true);
                                vl75.setVisible(true);
                                sc65.setFill(Color.web("#bac267"));
                                vl75.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                            if (hl74.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc74.setVisible(true);
                                hl74.setVisible(true);
                                sc74.setFill(Color.web("#bac267"));
                                hl74.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                            if (hl75.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc76.setVisible(true);
                                hl75.setVisible(true);
                                sc76.setFill(Color.web("#bac267"));
                                hl75.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc85.getCenterX() && y1 == sc85.getCenterY()) {
                            if (vl85.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc85.setVisible(true);
                                vl85.setVisible(true);
                                sc85.setFill(Color.web("#bac267"));
                                vl85.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 261 && x < 297 && y > 306 && y < 342) {
                        if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                            if (vl76.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc66.setVisible(true);
                                vl76.setVisible(true);
                                sc66.setFill(Color.web("#bac267"));
                                vl76.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                            if (hl75.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc75.setVisible(true);
                                hl75.setVisible(true);
                                sc75.setFill(Color.web("#bac267"));
                                hl75.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                            if (hl76.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc77.setVisible(true);
                                hl76.setVisible(true);
                                sc77.setFill(Color.web("#bac267"));
                                hl76.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc86.getCenterX() && y1 == sc86.getCenterY()) {
                            if (vl86.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc86.setVisible(true);
                                vl86.setVisible(true);
                                sc86.setFill(Color.web("#bac267"));
                                vl86.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 311 && x < 347 && y > 306 && y < 342) {
                        if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                            if (vl77.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc67.setVisible(true);
                                vl77.setVisible(true);
                                sc67.setFill(Color.web("#bac267"));
                                vl77.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                            if (hl76.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc76.setVisible(true);
                                hl76.setVisible(true);
                                sc76.setFill(Color.web("#bac267"));
                                hl76.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                            if (hl77.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc78.setVisible(true);
                                hl77.setVisible(true);
                                sc78.setFill(Color.web("#bac267"));
                                hl77.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc87.getCenterX() && y1 == sc87.getCenterY()) {
                            if (vl87.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc87.setVisible(true);
                                vl87.setVisible(true);
                                sc87.setFill(Color.web("#bac267"));
                                vl87.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 359 && x < 395 && y > 306 && y < 342) {
                        if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                            if (vl78.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc68.setVisible(true);
                                vl78.setVisible(true);
                                sc68.setFill(Color.web("#bac267"));
                                vl78.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                            if (hl77.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc77.setVisible(true);
                                hl77.setVisible(true);
                                sc77.setFill(Color.web("#bac267"));
                                hl77.setFill(Color.web("98c4c0"));
                            }
                        }
                        else if (x1 == sc88.getCenterX() && y1 == sc88.getCenterY()) {
                            if (vl88.isVisible())
                                alertMessage.setText("Oops! This line has already been chosen!");
                            else {
                                sc88.setVisible(true);
                                vl88.setVisible(true);
                                sc88.setFill(Color.web("#bac267"));
                                vl88.setFill(Color.web("98c4c0"));
                            }
                        }
                    }
                    else if (x > 11 && x < 47 && y > 355 && y < 391) {
                        sc81.setVisible(true);
                        sc81.setFill(Color.web("#bac267"));
                        isSecondCircle = true;
                    }

                    else if (x > 61 && x < 97 && y > 356 && y < 392) {
                        sc82.setVisible(true);
                        sc82.setFill(Color.web("#bac267"));
                    }

                    else if (x > 111 && x < 147 && y > 356 && y < 392) {
                        sc83.setVisible(true);
                        sc83.setFill(Color.web("#bac267"));
                    }

                    else if (x > 159 && x < 195 && y > 356 && y < 392) {
                        sc84.setVisible(true);
                        sc84.setFill(Color.web("#bac267"));
                    }


                    else if (x > 211 && x < 247 && y > 356 && y < 392) {
                        sc85.setVisible(true);
                        sc85.setFill(Color.web("#bac267"));
                    }
                    else if (x > 261 && x < 297 && y > 356 && y < 392) {
                        sc86.setVisible(true);
                        sc86.setFill(Color.web("#bac267"));
                    }
                    else if (x > 312 && x < 348 && y > 356 && y < 392) {
                        sc87.setVisible(true);
                        sc87.setFill(Color.web("#bac267"));
                    }
                    else if (x > 360 && x < 396 && y > 356 && y < 392) {
                        sc88.setVisible(true);
                        sc88.setFill(Color.web("#bac267"));
                    }
                    isSecondCircle = false;
                }

            //commands for second player
            else {

            }

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

    public   boolean isValid(int x1,int x2,int y1,int y2){return true;}

      public   void showValidPosition(){}

       public void showGrid(){}

     public    void drawLine(){}

       public void setLineColor(){}

      public   void showLines(){}

       public void showPossibleDots(){}

      public   void showResult(){}

       public void showScore(){}







public class Board{
    private int[][] Board = new int[8][8];
    private int lastX , lastY;
    public int[][] getBoard() {
        return Board;
    }

    public void setLastX(int lastX) {
        this.lastX = lastX;
    }

    public void setLastY(int lastY) {
        this.lastY = lastY;
    }

    public int getLastX() {
        return lastX;
    }

    public int getLastY() {
        return lastY;
    }
}}
