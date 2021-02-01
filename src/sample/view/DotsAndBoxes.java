package sample.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.media.Media;
import sample.Main;
import sample.model.platoModel.DBPlayer;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
public class DotsAndBoxes {
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
    public Rectangle r11;
    public Rectangle r12;
    public Rectangle r13;
    public Rectangle r14;
    public Rectangle r15;
    public Rectangle r16;
    public Rectangle r17;
    public Rectangle r21;
    public Rectangle r22;
    public Rectangle r23;
    public Rectangle r24;
    public Rectangle r25;
    public Rectangle r26;
    public Rectangle r27;
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
    public Rectangle r77;
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
    private ArrayList<Line> ra111 = new ArrayList<Line>();
    private ArrayList<Line> ra121 = new ArrayList<Line>();
    private ArrayList<Line> ra131 = new ArrayList<Line>();
        private ArrayList<Line> ra141 = new ArrayList<Line>();
    private ArrayList<Line> ra151 = new ArrayList<Line>();
    private ArrayList<Line> ra161 = new ArrayList<Line>();
    private ArrayList<Line> ra171 = new ArrayList<Line>();
    private ArrayList<Line> ra211 = new ArrayList<Line>();
    private ArrayList<Line> ra221 = new ArrayList<Line>();
    private ArrayList<Line> ra231 = new ArrayList<Line>();
    private ArrayList<Line> ra241 = new ArrayList<Line>();
    private ArrayList<Line> ra251 = new ArrayList<Line>();
    private ArrayList<Line> ra261 = new ArrayList<Line>();
    private ArrayList<Line> ra271 = new ArrayList<Line>();
    private ArrayList<Line> ra311 = new ArrayList<Line>();
    private ArrayList<Line> ra321 = new ArrayList<Line>();
    private ArrayList<Line> ra331 = new ArrayList<Line>();
    private ArrayList<Line> ra341 = new ArrayList<Line>();
    private ArrayList<Line> ra351 = new ArrayList<Line>();
    private ArrayList<Line> ra361 = new ArrayList<Line>();
    private ArrayList<Line> ra371 = new ArrayList<Line>();
    private ArrayList<Line> ra411 = new ArrayList<Line>();
    private ArrayList<Line> ra421 = new ArrayList<Line>();
    private ArrayList<Line> ra431 = new ArrayList<Line>();
    private ArrayList<Line> ra441 = new ArrayList<Line>();
    private ArrayList<Line> ra451 = new ArrayList<Line>();
    private ArrayList<Line> ra461 = new ArrayList<Line>();
    private ArrayList<Line> ra471 = new ArrayList<Line>();
    private ArrayList<Line> ra511 = new ArrayList<Line>();
    private ArrayList<Line> ra521 = new ArrayList<Line>();
    private ArrayList<Line> ra531 = new ArrayList<Line>();
    private ArrayList<Line> ra541 = new ArrayList<Line>();
    private ArrayList<Line> ra551 = new ArrayList<Line>();
    private ArrayList<Line> ra561 = new ArrayList<Line>();
    private ArrayList<Line> ra571 = new ArrayList<Line>();
    private ArrayList<Line> ra611 = new ArrayList<Line>();
    private ArrayList<Line> ra621 = new ArrayList<Line>();
    private ArrayList<Line> ra631 = new ArrayList<Line>();
    private ArrayList<Line> ra641 = new ArrayList<Line>();
    private ArrayList<Line> ra651 = new ArrayList<Line>();
    private ArrayList<Line> ra661 = new ArrayList<Line>();
    private ArrayList<Line> ra671 = new ArrayList<Line>();
    private ArrayList<Line> ra711 = new ArrayList<Line>();
    private ArrayList<Line> ra721 = new ArrayList<Line>();
    private ArrayList<Line> ra731 = new ArrayList<Line>();
    private ArrayList<Line> ra741 = new ArrayList<Line>();
    private ArrayList<Line> ra751 = new ArrayList<Line>();
    private ArrayList<Line> ra761 = new ArrayList<Line>();
    private ArrayList<Line> ra771 = new ArrayList<Line>();
    private ArrayList<Rectangle> allRectangles = new ArrayList<Rectangle>();

    private ArrayList<Circle> selectedC = new ArrayList<>();
    private boolean isSecondCircle = false;
    private boolean hasAward = false;
    private DBPlayer firstPlayer;
    private DBPlayer secondPlayer;
    private int firstPlayerScore = 0;
    private int secondPlayerScore = 0;
    private boolean isFirstPlayerTurn=true;
    private boolean isRectangleDone;
    private ArrayList<Line> selectedL;
    private Stage stage;
    private static Parent pre;
    double xStart,yStart,xEnd,yEnd;

    public void playMusic() {
        File file = new File("src\\Sounds\\Click.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }


    public void setHasCountDown(boolean hasCountDown) {
        this.hasCountDown = hasCountDown;
    }

    public void setTimer() {
    }

    public void drawCircle(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        Circle circle = new Circle(x, y, 10);
        circle.setVisible(true);
    }

    public void showC(MouseEvent mouseEvent) {
        double x = MouseInfo.getPointerInfo().getLocation().getX() - 340;
        double y = MouseInfo.getPointerInfo().getLocation().getY() - 110;
        System.out.println("x1:"+x+" y1:"+y);
        //command for first player
        if (isFirstPlayerTurn) {
            System.out.println("isFirstplayer");
            if (!isSecondCircle) {
                System.out.println("secondc not");
                if (x > 11 && x < 47 && y > 4 && y < 40) {
                  /*  sc11.setVisible(true);
                    sc11.setFill(Color.web("#bac267"));*/
                  xStart=sc11.getCenterX();xEnd=sc11.getCenterY();
                  selectedC.add(sc11);
                } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                   // sc12.setVisible(true);
                    //sc12.setFill(Color.web("#bac267"));
                    xStart=sc12.getCenterX();xEnd=sc12.getCenterY();
                    selectedC.add(sc12);
                } else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    //sc13.setVisible(true);
                    // sc13.setFill(Color.web("#bac267"));
                    xStart=sc13.getCenterX();xEnd=sc13.getCenterY();
                    selectedC.add(sc13);
                } else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    // sc14.setVisible(true);
                    //  sc14.setFill(Color.web("#bac267"));
                    xStart=sc14.getCenterX();xEnd=sc14.getCenterY();
                    selectedC.add(sc14);
                } else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    //  sc15.setVisible(true);
                    //sc15.setFill(Color.web("#bac267"));
                    xStart=sc15.getCenterX();xEnd=sc15.getCenterY();
                    selectedC.add(sc15);
                } else if (x > 262 && x < 298 && y > 5 && y < 41) {
                  //  sc16.setVisible(true);
                   // sc16.setFill(Color.web("#bac267"));
                    xStart=sc16.getCenterX();xEnd=sc16.getCenterY();
                    selectedC.add(sc16);
                } else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    //sc17.setVisible(true);
                    // sc17.setFill(Color.web("#bac267"));
                    xStart=sc17.getCenterX();xEnd=sc17.getCenterY();
                    selectedC.add(sc17);
                } else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    //  sc18.setVisible(true);
                    // sc18.setFill(Color.web("#bac267"));
                    xStart=sc18.getCenterX();xEnd=sc18.getCenterY();
                    selectedC.add(sc18);
                } else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    // sc21.setVisible(true);
                    //sc21.setFill(Color.web("#bac267"));
                    xStart=sc21.getCenterX();xEnd=sc21.getCenterY();
                    selectedC.add(sc21);
                } else if (x > 62 && x < 98 && y > 55 && y < 91) {
                    // sc22.setVisible(true);
                    //   sc22.setFill(Color.web("#bac267"));
                    xStart=sc22.getCenterX();xEnd=sc22.getCenterY();
                    selectedC.add(sc22);
                } else if (x > 112 && x < 148 && y > 55 && y < 91) {
                    //  sc23.setVisible(true);
                    //  sc23.setFill(Color.web("#bac267"));
                    selectedC.add(sc23);
                    xStart=sc23.getCenterX();xEnd=sc23.getCenterY();
                } else if (x > 161 && x < 197 && y > 55 && y < 91) {
                    //  sc24.setVisible(true);
                    // sc24.setFill(Color.web("#bac267"));
                    xStart=sc24.getCenterX();xEnd=sc24.getCenterY();
                    selectedC.add(sc24);
                } else if (x > 212 && x < 248 && y > 55 && y < 91) {
                    //sc25.setVisible(true);
                    // sc25.setFill(Color.web("#bac267"));
                    selectedC.add(sc25);
                    xStart=sc25.getCenterX();xEnd=sc25.getCenterY();
                } else if (x > 262 && x < 298 && y > 55 && y < 91) {
                    //  sc26.setVisible(true);
                    // sc26.setFill(Color.web("#bac267"));
                    xStart=sc26.getCenterX();xEnd=sc26.getCenterY();
                    selectedC.add(sc26);
                } else if (x > 312 && x < 348 && y > 55 && y < 91) {
                    //  sc27.setVisible(true);
                    // sc27.setFill(Color.web("#bac267"));
                    selectedC.add(sc27);
                    xStart=sc27.getCenterX();xEnd=sc27.getCenterY();
                } else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    // sc28.setVisible(true);
                    // sc28.setFill(Color.web("#bac267"));
                    selectedC.add(sc28);
                } else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    //sc31.setVisible(true);
                    //  sc31.setFill(Color.web("#bac267"));
                    selectedC.add(sc31);
                } else if (x > 62 && x < 98 && y > 105 && y < 141) {
                    // sc32.setVisible(true);
                    //  sc32.setFill(Color.web("#bac267"));
                    selectedC.add(sc32);
                } else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    // sc33.setVisible(true);
                    //  sc33.setFill(Color.web("#bac267"));
                    selectedC.add(sc33);
                } else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    // sc34.setVisible(true);
                    //  sc34.setFill(Color.web("#bac267"));
                    selectedC.add(sc34);

                } else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    //sc35.setVisible(true);
                    // sc35.setFill(Color.web("#bac267"));
                    selectedC.add(sc35);

                } else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    // sc36.setVisible(true);
                    // sc36.setFill(Color.web("#bac267"));
                    selectedC.add(sc36);
                } else if (x > 312 && x < 348 && y > 106 && y < 142) {
                    //  sc37.setVisible(true);
                    //  sc37.setFill(Color.web("#bac267"));
                    selectedC.add(sc37);
                } else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    // sc38.setVisible(true);
                    // sc38.setFill(Color.web("#bac267"));
                    selectedC.add(sc38);
                } else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    //  sc41.setVisible(true);
                    // sc41.setFill(Color.web("#bac267"));
                    selectedC.add(sc41);
                } else if (x > 62 && x < 98 && y > 155 && y < 191) {
                    // sc42.setVisible(true);
                    sc42.setFill(Color.web("#bac267"));
                    selectedC.add(sc42);
                } else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    //  sc43.setVisible(true);
                    // sc43.setFill(Color.web("#bac267"));
                    selectedC.add(sc43);
                } else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    //sc44.setVisible(true);
                    //  sc44.setFill(Color.web("#bac267"));
                    selectedC.add(sc44);
                } else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    // sc45.setVisible(true);
                    // sc45.setFill(Color.web("#bac267"));
                    selectedC.add(sc45);
                } else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    // sc46.setVisible(true);
                    // sc46.setFill(Color.web("#bac267"));
                    selectedC.add(sc46);
                } else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    //  sc47.setVisible(true);
                    //  sc47.setFill(Color.web("#bac267"));
                    selectedC.add(sc47);
                } else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    //sc48.setVisible(true);
                    //sc48.setFill(Color.web("#bac267"));
                    selectedC.add(sc48);
                } else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    // sc51.setVisible(true);
                    // sc51.setFill(Color.web("#bac267"));
                    selectedC.add(sc51);
                } else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    //sc52.setVisible(true);
                    //  sc52.setFill(Color.web("#bac267"));
                    selectedC.add(sc52);
                } else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    //   sc53.setVisible(true);
                    //  sc53.setFill(Color.web("#bac267"));
                    selectedC.add(sc53);
                } else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    //sc54.setVisible(true);
                    //sc54.setFill(Color.web("#bac267"));
                    selectedC.add(sc54);
                } else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    //   sc55.setVisible(true);
                    // sc55.setFill(Color.web("#bac267"));
                    selectedC.add(sc55);
                } else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    //sc56.setVisible(true);
                    // sc56.setFill(Color.web("#bac267"));
                    selectedC.add(sc56);
                } else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    //sc57.setVisible(true);
                    //sc57.setFill(Color.web("#bac267"));
                    selectedC.add(sc57);
                } else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    // sc58.setVisible(true);
                    //sc58.setFill(Color.web("#bac267"));
                    selectedC.add(sc58);
                } else if (x > 11 && x < 47 && y > 255 && y < 291) {
                    // sc61.setVisible(true);
                    //sc61.setFill(Color.web("#bac267"));
                    selectedC.add(sc61);
                } else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    //sc62.setVisible(true);
                    //sc62.setFill(Color.web("#bac267"));
                    selectedC.add(sc62);
                } else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    // sc63.setVisible(true);
                    // sc63.setFill(Color.web("#bac267"));
                    selectedC.add(sc63);
                } else if (x > 161 && x < 197 && y > 256 && y < 292) {
                   // sc64.setVisible(true);
                    //sc64.setFill(Color.web("#bac267"));
                    selectedC.add(sc64);
                } else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    //  sc65.setVisible(true);
                    //  sc65.setFill(Color.web("#bac267"));
                    selectedC.add(sc65);
                } else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    //  sc66.setVisible(true);
                    //  sc66.setFill(Color.web("#bac267"));
                    selectedC.add(sc66);
                } else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    //  sc67.setVisible(true);
                    // sc67.setFill(Color.web("#bac267"));
                    selectedC.add(sc67);
                } else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    //  sc68.setVisible(true);
                    // sc68.setFill(Color.web("#bac267"));
                    selectedC.add(sc68);
                } else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    // sc71.setVisible(true);
                    // sc71.setFill(Color.web("#bac267"));
                    selectedC.add(sc71);
                } else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    //  sc72.setVisible(true);
                    //sc72.setFill(Color.web("#bac267"));
                    selectedC.add(sc72);
                } else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    //  sc73.setVisible(true);
                    // sc73.setFill(Color.web("#bac267"));
                    selectedC.add(sc73);
                } else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    // sc74.setVisible(true);
                    //sc74.setFill(Color.web("#bac267"));
                    selectedC.add(sc74);
                } else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    // sc75.setVisible(true);
                    // sc75.setFill(Color.web("#bac267"));
                    selectedC.add(sc75);
                } else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    //  sc76.setVisible(true);
                    //  sc76.setFill(Color.web("#bac267"));
                    selectedC.add(sc76);
                } else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    // sc77.setVisible(true);
                    //sc77.setFill(Color.web("#bac267"));
                    selectedC.add(sc77);
                } else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    //sc78.setVisible(true);
                    // sc78.setFill(Color.web("#bac267"));
                    selectedC.add(sc78);
                } else if (x > 11 && x < 47 && y > 355 && y < 391) {
                    // sc81.setVisible(true);
                    //sc81.setFill(Color.web("#bac267"));
                    selectedC.add(sc81);
                } else if (x > 61 && x < 97 && y > 356 && y < 392) {
                    //sc82.setVisible(true);
                    //sc82.setFill(Color.web("#bac267"));
                    selectedC.add(sc82);
                } else if (x > 111 && x < 147 && y > 356 && y < 392) {
                    //  sc83.setVisible(true);
                    //  sc83.setFill(Color.web("#bac267"));
                    selectedC.add(sc83);
                } else if (x > 159 && x < 195 && y > 356 && y < 392) {
                    //  sc84.setVisible(true);
                    //  sc84.setFill(Color.web("#bac267"));
                    selectedC.add(sc84);
                } else if (x > 211 && x < 247 && y > 356 && y < 392) {
                    //  sc85.setVisible(true);
                    //  sc85.setFill(Color.web("#bac267"));
                    selectedC.add(sc85);
                } else if (x > 261 && x < 297 && y > 356 && y < 392) {
                    //  sc86.setVisible(true);
                    //  sc86.setFill(Color.web("#bac267"));
                    selectedC.add(sc86);
                } else if (x > 312 && x < 348 && y > 356 && y < 392) {
                    //  sc87.setVisible(true);
                    // sc87.setFill(Color.web("#bac267"));
                    selectedC.add(sc87);
                } else if (x > 360 && x < 396 && y > 356 && y < 392) {
                    // sc88.setVisible(true);
                    // sc88.setFill(Color.web("#bac267"));
                    selectedC.add(sc88);
                }
                isSecondCircle = true;
            }
            //else dovmi commands for second circles and lines
            else {
                double x1 = selectedC.get(0).getCenterX();
                double y1 = selectedC.get(0).getCenterY();
                System.out.println("x2"+x+"y2:"+y);
                if (x > 11 && x < 47 && y > 4 && y < 40) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (hl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                          //  sc12.setVisible(true);
                            hl11.setVisible(true);
                           // sc12.setFill(Color.web("#bac267"));
                            hl11.setFill(Color.web("#98c4c0"));
                            ra111.add(hl11);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (vl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc21.setVisible(true);
                            vl11.setVisible(true);
                            //  sc21.setFill(Color.web("#bac267"));
                            vl11.setFill(Color.web("#98c4c0"));
                            ra111.add(vl11);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 62 && x < 98 && y > 4 && y < 40) {
                    if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                        if (hl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                          //  sc11.setVisible(true);
                            hl11.setVisible(true);
                         //   sc11.setFill(Color.web("#bac267"));
                            hl11.setFill(Color.web("#98c4c0"));
                            ra111.add(hl11);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (hl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                           // sc13.setVisible(true);
                            hl12.setVisible(true);
                            //sc13.setFill(Color.web("#bac267"));
                            hl12.setFill(Color.web("#98c4c0"));
                            ra121.add(hl12);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (vl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc22.setVisible(true);
                            vl12.setVisible(true);
                            //  sc22.setFill(Color.web("#bac267"));
                            vl12.setFill(Color.web("#98c4c0"));
                            ra111.add(vl12);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra121.add(vl12);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (hl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc12.setVisible(true);
                            hl12.setVisible(true);
                            //  sc12.setFill(Color.web("#bac267"));
                            hl12.setFill(Color.web("#98c4c0"));
                            ra121.add(hl12);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (hl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc14.setVisible(true);
                            hl13.setVisible(true);
                            // sc14.setFill(Color.web("#bac267"));
                            hl13.setFill(Color.web("#98c4c0"));
                            ra131.add(hl13);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (vl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc23.setVisible(true);
                            vl13.setVisible(true);
                            // sc23.setFill(Color.web("#bac267"));
                            vl13.setFill(Color.web("#98c4c0"));
                            ra121.add(vl13);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra131.add(vl13);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (hl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc13.setVisible(true);
                            hl13.setVisible(true);
                            //  sc13.setFill(Color.web("#bac267"));
                            hl13.setFill(Color.web("#98c4c0"));
                            ra131.add(hl13);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                    else if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (hl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc15.setVisible(true);
                            hl14.setVisible(true);
                            //  sc15.setFill(Color.web("#bac267"));
                            hl14.setFill(Color.web("#98c4c0"));
                            ra141.add(hl14);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (vl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc24.setVisible(true);
                            vl14.setVisible(true);
                            //  sc24.setFill(Color.web("#bac267"));
                            vl14.setFill(Color.web("#98c4c0"));
                            ra131.add(vl14);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra141.add(vl14);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (hl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc14.setVisible(true);
                            hl14.setVisible(true);
                            // sc14.setFill(Color.web("#bac267"));
                            hl14.setFill(Color.web("#98c4c0"));
                            ra141.add(hl14);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (hl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc16.setVisible(true);
                            hl15.setVisible(true);
                            //    sc16.setFill(Color.web("#bac267"));
                            hl15.setFill(Color.web("#98c4c0"));
                            ra151.add(hl15);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (vl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc25.setVisible(true);
                            vl15.setVisible(true);
                            //  sc25.setFill(Color.web("#bac267"));
                            vl15.setFill(Color.web("#98c4c0"));
                            ra141.add(vl15);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra151.add(vl15);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 262 && x < 298 && y > 5 && y < 41) {
                    if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (hl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc15.setVisible(true);
                            hl15.setVisible(true);
                            //  sc15.setFill(Color.web("#bac267"));
                            hl15.setFill(Color.web("#98c4c0"));
                            ra151.add(hl15);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (hl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc17.setVisible(true);
                            hl16.setVisible(true);
                            //  sc17.setFill(Color.web("#bac267"));
                            hl16.setFill(Color.web("#98c4c0"));
                            ra161.add(hl16);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (vl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc26.setVisible(true);
                            vl16.setVisible(true);
                            //   sc26.setFill(Color.web("#bac267"));
                            vl16.setFill(Color.web("#98c4c0"));
                            ra151.add(vl16);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra161.add(vl16);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (hl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc16.setVisible(true);
                            hl16.setVisible(true);
                            // sc16.setFill(Color.web("#bac267"));
                            hl16.setFill(Color.web("#98c4c0"));
                            ra161.add(hl16);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                        if (hl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc18.setVisible(true);
                            hl17.setVisible(true);
                            //   sc18.setFill(Color.web("#bac267"));
                            hl17.setFill(Color.web("#98c4c0"));
                            ra171.add(hl17);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (vl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc27.setVisible(true);
                            vl17.setVisible(true);
                            //   sc27.setFill(Color.web("#bac267"));
                            vl17.setFill(Color.web("#98c4c0"));
                            ra161.add(vl17);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra171.add(vl17);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (hl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc17.setVisible(true);
                            hl17.setVisible(true);
                            //  sc17.setFill(Color.web("#bac267"));
                            hl17.setFill(Color.web("#98c4c0"));
                            ra171.add(hl17);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (vl18.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc28.setVisible(true);
                            vl18.setVisible(true);
                            //  sc28.setFill(Color.web("#bac267"));
                            vl18.setFill(Color.web("#98c4c0"));
                            ra171.add(vl18);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (hl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc22.setVisible(true);
                            hl21.setVisible(true);
                            //   sc22.setFill(Color.web("#bac267"));
                            hl21.setFill(Color.web("#98c4c0"));
                            ra111.add(hl21);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra211.add(hl21);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                        if (vl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc11.setVisible(true);
                            vl11.setVisible(true);
                            // sc11.setFill(Color.web("#bac267"));
                            vl11.setFill(Color.web("#98c4c0"));
                            ra111.add(vl11);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (vl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc31.setVisible(true);
                            vl21.setVisible(true);
                            //  sc31.setFill(Color.web("#bac267"));
                            vl21.setFill(Color.web("#98c4c0"));
                            ra211.add(vl21);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 62 && x < 98 && y > 55 && y < 91) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (vl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc12.setVisible(true);
                            vl12.setVisible(true);
                            // sc12.setFill(Color.web("#bac267"));
                            vl12.setFill(Color.web("#98c4c0"));
                            ra111.add(vl12);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra121.add(vl12);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                    else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (hl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc21.setVisible(true);
                            hl21.setVisible(true);
                            //sc21.setFill(Color.web("#bac267"));
                            hl21.setFill(Color.web("#98c4c0"));
                            ra111.add(hl21);
                            hasAward = false;
                            if (ra111.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r11);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra211.add(hl21);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (hl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc23.setVisible(true);
                            hl22.setVisible(true);
                            //  sc23.setFill(Color.web("#bac267"));
                              hl22.setFill(Color.web("#98c4c0"));
                            ra121.add(hl22);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra221.add(hl22);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (vl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc32.setVisible(true);
                            vl22.setVisible(true);
                            //   sc32.setFill(Color.web("#bac267"));
                            vl22.setFill(Color.web("#98c4c0"));
                            ra221.add(vl22);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra231.add(vl22);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 55 && y < 91) {
                    if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (vl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc13.setVisible(true);
                            vl13.setVisible(true);
                            // sc13.setFill(Color.web("#bac267"));
                            vl13.setFill(Color.web("#98c4c0"));
                            ra121.add(vl13);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra131.add(vl13);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (hl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc22.setVisible(true);
                            hl22.setVisible(true);
                            //sc22.setFill(Color.web("#bac267"));
                            hl22.setFill(Color.web("#98c4c0"));
                            ra121.add(hl22);
                            hasAward = false;
                            if (ra121.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r12);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra221.add(hl22);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (hl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc24.setVisible(true);
                            hl23.setVisible(true);
                            //     sc24.setFill(Color.web("#bac267"));
                            hl23.setFill(Color.web("#98c4c0"));
                            ra131.add(hl23);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra231.add(hl23);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (vl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc33.setVisible(true);
                            vl23.setVisible(true);
                            //  sc33.setFill(Color.web("#bac267"));
                            vl23.setFill(Color.web("#98c4c0"));
                            ra221.add(vl23);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra231.add(vl23);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 55 && y < 91) {
                    if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (vl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc14.setVisible(true);
                            vl14.setVisible(true);
                            //   sc14.setFill(Color.web("#bac267"));
                            vl14.setFill(Color.web("#98c4c0"));
                            ra131.add(vl14);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra141.add(vl14);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (hl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc23.setVisible(true);
                            hl23.setVisible(true);
                            //   sc23.setFill(Color.web("#bac267"));
                            hl23.setFill(Color.web("#98c4c0"));
                            ra131.add(hl23);
                            hasAward = false;
                            if (ra131.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r13);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra231.add(hl23);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (hl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc25.setVisible(true);
                            hl24.setVisible(true);
                            //  sc25.setFill(Color.web("#bac267"));
                            hl24.setFill(Color.web("#98c4c0"));
                            ra141.add(hl24);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra241.add(hl24);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (vl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc34.setVisible(true);
                            vl24.setVisible(true);
                            //  sc34.setFill(Color.web("#bac267"));
                            vl24.setFill(Color.web("#98c4c0"));
                            ra231.add(vl24);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra241.add(vl24);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 55 && y < 91) {
                    if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (vl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc15.setVisible(true);
                            vl15.setVisible(true);
                            // sc15.setFill(Color.web("#bac267"));
                            vl15.setFill(Color.web("#98c4c0"));
                            ra141.add(vl15);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra151.add(vl15);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (hl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc24.setVisible(true);
                            hl24.setVisible(true);
                            //sc24.setFill(Color.web("#bac267"));
                            hl24.setFill(Color.web("#98c4c0"));
                            ra141.add(hl24);
                            hasAward = false;
                            if (ra141.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r14);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra241.add(hl24);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }

                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (hl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc26.setVisible(true);
                            hl25.setVisible(true);
                            // sc26.setFill(Color.web("#bac267"));
                            hl25.setFill(Color.web("#98c4c0"));
                            ra151.add(hl25);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra251.add(hl25);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (vl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc35.setVisible(true);
                            vl25.setVisible(true);
                            //  sc35.setFill(Color.web("#bac267"));
                            vl25.setFill(Color.web("#98c4c0"));
                            ra241.add(vl25);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra251.add(vl25);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 55 && y < 91) {
                    if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (vl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc16.setVisible(true);
                            vl16.setVisible(true);
                            //  sc16.setFill(Color.web("#bac267"));
                            vl16.setFill(Color.web("#98c4c0"));
                            ra151.add(vl16);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra161.add(vl16);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (hl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc25.setVisible(true);
                            hl25.setVisible(true);
                            //  sc25.setFill(Color.web("#bac267"));
                            hl25.setFill(Color.web("#98c4c0"));
                            ra151.add(hl25);
                            hasAward = false;
                            if (ra151.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r15);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra251.add(hl25);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (hl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc27.setVisible(true);
                            hl26.setVisible(true);
                            //   sc27.setFill(Color.web("#bac267"));
                            hl26.setFill(Color.web("#98c4c0"));
                            ra161.add(hl26);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra261.add(hl26);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (vl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc36.setVisible(true);
                            vl26.setVisible(true);
                            //   sc36.setFill(Color.web("#bac267"));
                            vl26.setFill(Color.web("#98c4c0"));
                            ra251.add(vl26);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra261.add(vl26);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 55 && y < 91) {
                    if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (vl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc17.setVisible(true);
                            vl17.setVisible(true);
                            //   sc17.setFill(Color.web("#bac267"));
                            vl17.setFill(Color.web("#98c4c0"));
                            ra161.add(vl17);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra171.add(vl17);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (hl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc26.setVisible(true);
                            hl26.setVisible(true);
                            // sc26.setFill(Color.web("#bac267"));
                            hl26.setFill(Color.web("#98c4c0"));
                            ra161.add(hl26);
                            hasAward = false;
                            if (ra161.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r16);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra261.add(hl26);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (hl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc28.setVisible(true);
                            hl27.setVisible(true);
                            // sc28.setFill(Color.web("#bac267"));
                            hl27.setFill(Color.web("#98c4c0"));
                            ra171.add(hl27);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra271.add(hl27);
                            hasAward = false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (vl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc37.setVisible(true);
                            vl27.setVisible(true);
                            // sc37.setFill(Color.web("#bac267"));
                            vl27.setFill(Color.web("#98c4c0"));
                            ra261.add(vl27);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra271.add(vl27);
                            hasAward = false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                        if (vl18.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc38.setVisible(true);
                            vl18.setVisible(true);
                            //  sc38.setFill(Color.web("#bac267"));
                            vl18.setFill(Color.web("#98c4c0"));
                            ra171.add(vl18);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (hl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc27.setVisible(true);
                            hl27.setVisible(true);
                            //sc27.setFill(Color.web("#bac267"));
                            hl27.setFill(Color.web("#98c4c0"));
                            ra171.add(hl27);
                            hasAward = false;
                            if (ra171.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r17);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra271.add(hl27);
                            hasAward = false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (vl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc38.setVisible(true);
                            vl27.setVisible(true);
                            //   sc38.setFill(Color.web("#bac267"));
                            vl27.setFill(Color.web("#98c4c0"));
                            ra271.add(vl27);
                            hasAward = false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (vl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc21.setVisible(true);
                            vl21.setVisible(true);
                            // sc21.setFill(Color.web("#bac267"));
                            vl21.setFill(Color.web("#98c4c0"));
                            ra211.add(vl21);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (hl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc32.setVisible(true);
                            hl31.setVisible(true);
                            //  sc32.setFill(Color.web("#bac267"));
                            hl31.setFill(Color.web("#98c4c0"));
                            ra211.add(hl31);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra311.add(hl31);
                            hasAward = false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (vl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc41.setVisible(true);
                            vl31.setVisible(true);
                            //  sc41.setFill(Color.web("#bac267"));
                            vl31.setFill(Color.web("#98c4c0"));
                            ra311.add(vl31);
                            hasAward = false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 105 && y < 141) {
                    if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (vl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc22.setVisible(true);
                            vl22.setVisible(true);
                            // sc22.setFill(Color.web("#bac267"));
                            vl22.setFill(Color.web("#98c4c0"));
                            ra211.add(vl22);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra221.add(vl22);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (hl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc31.setVisible(true);
                            hl31.setVisible(true);
                            //  sc31.setFill(Color.web("#bac267"));
                            hl31.setFill(Color.web("#98c4c0"));
                            ra211.add(hl31);
                            hasAward = false;
                            if (ra211.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r21);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra311.add(hl31);
                            hasAward = false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (hl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc33.setVisible(true);
                            hl32.setVisible(true);
                            //   sc33.setFill(Color.web("#bac267"));
                            hl32.setFill(Color.web("#98c4c0"));
                            ra221.add(hl32);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra321.add(hl32);
                            hasAward = false;
                            if (ra321.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (vl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc42.setVisible(true);
                            vl32.setVisible(true);
                            //  sc42.setFill(Color.web("#bac267"));
                            vl32.setFill(Color.web("#98c4c0"));
                            ra311.add(vl32);
                            hasAward = false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra321.add(vl32);
                            hasAward = false;
                            if (ra321.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (vl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc23.setVisible(true);
                            vl23.setVisible(true);
                            //  sc23.setFill(Color.web("#bac267"));
                            vl23.setFill(Color.web("#98c4c0"));
                            ra221.add(vl23);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra231.add(vl23);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (hl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc32.setVisible(true);
                            hl32.setVisible(true);
                            //sc32.setFill(Color.web("#bac267"));
                            hl32.setFill(Color.web("#98c4c0"));
                            ra221.add(hl32);
                            hasAward = false;
                            if (ra221.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r22);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra321.add(hl32);
                            hasAward = false;
                            if (ra321.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (hl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc34.setVisible(true);
                            hl33.setVisible(true);
                            //  sc34.setFill(Color.web("#bac267"));
                            hl33.setFill(Color.web("#98c4c0"));
                            ra231.add(hl33);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra331.add(hl33);
                            hasAward = false;
                            if (ra331.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (vl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //    sc43.setVisible(true);
                            vl33.setVisible(true);
                            // sc43.setFill(Color.web("#bac267"));
                            vl33.setFill(Color.web("#98c4c0"));
                            ra321.add(vl33);
                            hasAward = false;
                            if (ra321.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra331.add(vl33);
                            hasAward = false;
                            if (ra331.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (vl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc24.setVisible(true);
                            vl24.setVisible(true);
                            // sc24.setFill(Color.web("#bac267"));
                            vl24.setFill(Color.web("#98c4c0"));
                            ra231.add(vl24);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra241.add(vl24);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (hl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc33.setVisible(true);
                            hl33.setVisible(true);
                            //   sc33.setFill(Color.web("#bac267"));
                            hl33.setFill(Color.web("#98c4c0"));
                            ra231.add(hl33);
                            hasAward = false;
                            if (ra231.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r23);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra331.add(hl33);
                            hasAward = false;
                            if (ra331.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (hl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc35.setVisible(true);
                            hl34.setVisible(true);
                            //  sc35.setFill(Color.web("#bac267"));
                            hl34.setFill(Color.web("#98c4c0"));
                            ra241.add(hl34);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra341.add(hl34);
                            hasAward = false;
                            if (ra341.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (vl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc44.setVisible(true);
                            vl34.setVisible(true);
                            //  sc44.setFill(Color.web("#bac267"));
                            vl34.setFill(Color.web("#98c4c0"));
                            ra331.add(vl34);
                            hasAward = false;
                            if (ra331.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra341.add(vl34);
                            hasAward = false;
                            if (ra341.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (vl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc25.setVisible(true);
                            vl25.setVisible(true);
                            //   sc25.setFill(Color.web("#bac267"));
                            vl25.setFill(Color.web("#98c4c0"));
                            ra241.add(vl25);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra251.add(vl25);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (hl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc34.setVisible(true);
                            hl34.setVisible(true);
                            //  sc34.setFill(Color.web("#bac267"));
                            hl34.setFill(Color.web("#98c4c0"));
                            ra241.add(hl34);
                            hasAward = false;
                            if (ra241.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r24);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra341.add(hl34);
                            hasAward = false;
                            if (ra341.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (hl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc36.setVisible(true);
                                hl35.setVisible(true);
                            // sc36.setFill(Color.web("#bac267"));
                            hl35.setFill(Color.web("#98c4c0"));
                            ra251.add(hl35);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra351.add(hl35);
                            hasAward = false;
                            if (ra351.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (vl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc45.setVisible(true);
                            vl35.setVisible(true);
                            // sc45.setFill(Color.web("#bac267"));
                            vl35.setFill(Color.web("#98c4c0"));
                            ra341.add(vl35);
                            hasAward = false;
                            if (ra341.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra351.add(vl35);
                            hasAward = false;
                            if (ra351.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (vl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc26.setVisible(true);
                            vl26.setVisible(true);
                            //  sc26.setFill(Color.web("#bac267"));
                            vl26.setFill(Color.web("#98c4c0"));
                            ra251.add(vl26);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra261.add(vl26);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }

                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (hl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc35.setVisible(true);
                            hl35.setVisible(true);
                            // sc35.setFill(Color.web("#bac267"));
                            hl35.setFill(Color.web("#98c4c0"));
                            ra351.add(hl35);
                            hasAward = false;
                            if (ra351.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra251.add(hl35);
                            hasAward = false;
                            if (ra251.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r25);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (hl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                           // sc37.setVisible(true);
                            hl36.setVisible(true);
                           // sc37.setFill(Color.web("#bac267"));
                            hl36.setFill(Color.web("#98c4c0"));
                            ra261.add(hl36);
                            hasAward = false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra361.add(hl36);
                            hasAward = false;
                            if (ra361.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (vl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc46.setVisible(true);
                            vl36.setVisible(true);
                            //  sc46.setFill(Color.web("#bac267"));
                            vl36.setFill(Color.web("#98c4c0"));
                            ra351.add(vl36);
                            hasAward = false;
                            if (ra351.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra361.add(vl36);
                            hasAward = false;
                            if (ra361.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                }
                else if (x > 312 && x < 348 && y > 106 && y < 142) {
                    if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (vl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc27.setVisible(true);
                            vl27.setVisible(true);
                            // sc27.setFill(Color.web("#bac267"));
                            vl27.setFill(Color.web("#98c4c0"));
                            ra261.add(vl27);
                            hasAward=false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra271.add(vl27);
                            hasAward=false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (hl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc36.setVisible(true);
                            hl36.setVisible(true);
                            // sc36.setFill(Color.web("#bac267"));
                            hl36.setFill(Color.web("#98c4c0"));
                            ra261.add(hl36);
                            hasAward=false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra361.add(hl36);
                            hasAward=false;
                            if (ra361.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (hl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc38.setVisible(true);
                            hl37.setVisible(true);
                            //sc38.setFill(Color.web("#bac267"));
                            hl37.setFill(Color.web("#98c4c0"));
                            ra271.add(hl37);
                            hasAward=false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra371.add(hl37);
                            hasAward=false;
                            if (ra371.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (vl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc47.setVisible(true);
                            vl37.setVisible(true);
                            // sc47.setFill(Color.web("#bac267"));
                            vl37.setFill(Color.web("#98c4c0"));
                            ra261.add(vl37);
                            hasAward=false;
                            if (ra261.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r26);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra361.add(vl37);
                            hasAward=false;
                            if (ra361.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (vl28.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc28.setVisible(true);
                            vl28.setVisible(true);
                            //sc28.setFill(Color.web("#bac267"));
                            vl28.setFill(Color.web("#98c4c0"));
                            ra271.add(vl28);
                            hasAward=false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (hl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc37.setVisible(true);
                            hl37.setVisible(true);
                            // sc37.setFill(Color.web("#bac267"));
                            hl37.setFill(Color.web("#98c4c0"));
                            ra271.add(hl37);
                            hasAward=false;
                            if (ra271.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r27);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra371.add(hl37);
                            hasAward=false;
                            if (ra371.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (vl38.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc48.setVisible(true);
                            vl38.setVisible(true);
                            // sc48.setFill(Color.web("#bac267"));
                            vl38.setFill(Color.web("#98c4c0"));
                            ra371.add(vl38);
                            hasAward=false;
                            if (ra371.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (vl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc31.setVisible(true);
                            vl31.setVisible(true);
                            // sc31.setFill(Color.web("#bac267"));
                            vl31.setFill(Color.web("#98c4c0"));
                            ra311.add(vl31);
                            hasAward=false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (hl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc42.setVisible(true);
                            hl41.setVisible(true);
                            //   sc42.setFill(Color.web("#bac267"));
                            hl41.setFill(Color.web("#98c4c0"));
                            ra311.add(hl41);
                            hasAward=false;
                            if (ra311.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra411.add(hl41);
                            hasAward=false;
                            if (ra411.size() == 4) {
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                        if (vl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc51.setVisible(true);
                            vl41.setVisible(true);
                            // sc51.setFill(Color.web("#bac267"));
                            vl41.setFill(Color.web("#98c4c0"));
                            ra411.add(vl41);
                            hasAward=false;
                            if (ra411.size() == 4) {
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                }
                else if (x > 62 && x < 98 && y > 155 && y < 191) {
                    if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (vl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc32.setVisible(true);
                            vl32.setVisible(true);
                            //   sc32.setFill(Color.web("#bac267"));
                            vl32.setFill(Color.web("#98c4c0"));
                            ra311.add(vl32);
                            hasAward=false;
                            if (ra311.size()==4){
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra321.add(vl32);
                            hasAward=false;
                            if (ra321.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (hl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc41.setVisible(true);
                            hl41.setVisible(true);
                            //  sc41.setFill(Color.web("#bac267"));
                            hl41.setFill(Color.web("#98c4c0"));
                            ra311.add(hl41);
                            hasAward=false;
                            if (ra311.size()==4){
                                r31.setVisible(true);
                                r31.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r31);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra411.add(hl41);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (hl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc43.setVisible(true);
                            hl42.setVisible(true);
                            // sc43.setFill(Color.web("#bac267"));
                            hl42.setFill(Color.web("#98c4c0"));
                            ra321.add(hl42);
                            hasAward=false;
                            if (ra321.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra421.add(hl42);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (vl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc52.setVisible(true);
                            vl42.setVisible(true);
                            //  sc52.setFill(Color.web("#bac267"));
                            vl42.setFill(Color.web("#98c4c0"));
                            ra411.add(vl42);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra421.add(vl42);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (vl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc33.setVisible(true);
                            vl33.setVisible(true);
                            // sc33.setFill(Color.web("#bac267"));
                            vl33.setFill(Color.web("#98c4c0"));
                            ra321.add(vl33);
                            hasAward=false;
                            if (ra321.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra331.add(vl33);
                            hasAward=false;
                            if (ra331.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (hl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc42.setVisible(true);
                            hl42.setVisible(true);
                            //sc42.setFill(Color.web("#bac267"));
                            hl42.setFill(Color.web("#98c4c0"));
                            ra421.add(hl42);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra321.add(hl42);
                            hasAward=false;
                            if (ra321.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r32);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (hl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc44.setVisible(true);
                            hl43.setVisible(true);
                            //  sc44.setFill(Color.web("#bac267"));
                            hl43.setFill(Color.web("#98c4c0"));
                            ra431.add(hl43);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra331.add(hl43);
                            hasAward=false;
                            if (ra331.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (vl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc53.setVisible(true);
                            vl43.setVisible(true);
                            //sc53.setFill(Color.web("#bac267"));
                            vl43.setFill(Color.web("#98c4c0"));
                            ra421.add(vl43);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra431.add(vl43);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (vl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc34.setVisible(true);
                            vl34.setVisible(true);
                            // sc34.setFill(Color.web("#bac267"));
                            vl34.setFill(Color.web("#98c4c0"));
                            ra331.add(vl34);
                            hasAward=false;
                            if (ra331.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra341.add(vl34);
                            hasAward=false;
                            if (ra341.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (hl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc43.setVisible(true);
                            hl43.setVisible(true);
                            //  sc43.setFill(Color.web("#bac267"));
                              hl43.setFill(Color.web("#98c4c0"));
                            ra331.add(hl43);
                            hasAward=false;
                            if (ra331.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r33);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra431.add(hl43);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (hl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc45.setVisible(true);
                            hl44.setVisible(true);
                            //sc45.setFill(Color.web("#bac267"));
                            hl44.setFill(Color.web("#98c4c0"));
                            ra441.add(hl44);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra341.add(hl44);
                            hasAward=false;
                            if (ra341.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (vl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc54.setVisible(true);
                            vl44.setVisible(true);
                            //  sc54.setFill(Color.web("#bac267"));
                            vl44.setFill(Color.web("#98c4c0"));
                            ra431.add(vl44);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra441.add(vl44);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (vl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc35.setVisible(true);
                            vl35.setVisible(true);
                            //  sc35.setFill(Color.web("#bac267"));
                            vl35.setFill(Color.web("#98c4c0"));
                            ra341.add(vl35);
                            hasAward=false;
                            if (ra341.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra351.add(vl35);
                            hasAward=false;
                            if (ra351.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (hl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc44.setVisible(true);
                            hl44.setVisible(true);
                            //  sc44.setFill(Color.web("#bac267"));
                            hl44.setFill(Color.web("#98c4c0"));
                            ra441.add(hl44);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra341.add(hl44);
                            hasAward=false;
                            if (ra341.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r34);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (hl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc46.setVisible(true);
                            hl45.setVisible(true);
                            // sc46.setFill(Color.web("#bac267"));
                            hl45.setFill(Color.web("#98c4c0"));
                            ra411.add(hl45);
                            hasAward=false;
                            if (ra351.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra451.add(hl45);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (vl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc55.setVisible(true);
                            vl45.setVisible(true);
                            // sc55.setFill(Color.web("#bac267"));
                            vl45.setFill(Color.web("#98c4c0"));
                            ra441.add(vl45);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra451.add(vl45);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (vl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc36.setVisible(true);
                            vl36.setVisible(true);
                            //sc36.setFill(Color.web("#bac267"));
                            vl36.setFill(Color.web("#98c4c0"));
                            ra351.add(vl36);
                            hasAward=false;
                            if (ra351.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra361.add(vl36);
                            hasAward=false;
                            if (ra361.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (hl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc45.setVisible(true);
                            hl45.setVisible(true);
                            // sc45.setFill(Color.web("#bac267"));
                            hl45.setFill(Color.web("#98c4c0"));
                            ra351.add(hl45);
                            hasAward=false;
                            if (ra351.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r35);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra451.add(hl45);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (hl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc47.setVisible(true);
                            hl46.setVisible(true);
                            //  sc47.setFill(Color.web("#bac267"));
                            hl46.setFill(Color.web("#98c4c0"));
                            ra361.add(hl46);
                            hasAward=false;
                            if (ra361.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra461.add(hl46);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (vl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc56.setVisible(true);
                            vl46.setVisible(true);
                            // sc56.setFill(Color.web("#bac267"));
                            vl46.setFill(Color.web("#98c4c0"));
                            ra451.add(vl46);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra461.add(vl46);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (vl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc37.setVisible(true);
                            vl37.setVisible(true);
                            // sc37.setFill(Color.web("#bac267"));
                            vl37.setFill(Color.web("#98c4c0"));
                            ra361.add(vl37);
                            hasAward=false;
                            if (ra361.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra371.add(vl37);
                            hasAward=false;
                            if (ra371.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (hl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc46.setVisible(true);
                            hl46.setVisible(true);
                            //  sc46.setFill(Color.web("#bac267"));
                            hl46.setFill(Color.web("#98c4c0"));
                            ra361.add(hl46);
                            hasAward=false;
                            if (ra361.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r36);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra461.add(hl46);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (hl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc48.setVisible(true);
                            hl47.setVisible(true);
                            //sc48.setFill(Color.web("#bac267"));
                            hl47.setFill(Color.web("#98c4c0"));
                            ra371.add(hl47);
                            hasAward=false;
                            if (ra371.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra471.add(hl47);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (vl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc57.setVisible(true);
                            vl47.setVisible(true);
                            // sc57.setFill(Color.web("#bac267"));
                            vl47.setFill(Color.web("#98c4c0"));
                            ra461.add(vl47);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra471.add(vl47);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (vl38.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc38.setVisible(true);
                            vl38.setVisible(true);
                            // sc38.setFill(Color.web("#bac267"));
                            vl38.setFill(Color.web("#98c4c0"));
                            ra371.add(vl38);
                            hasAward=false;
                            if (ra371.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (hl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc47.setVisible(true);
                            hl47.setVisible(true);
                            //  sc47.setFill(Color.web("#bac267"));
                            hl47.setFill(Color.web("#98c4c0"));
                            ra371.add(hl47);
                            hasAward=false;
                            if (ra371.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r37);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra471.add(hl47);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (vl48.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc58.setVisible(true);
                            vl48.setVisible(true);
                            // sc58.setFill(Color.web("#bac267"));
                            vl48.setFill(Color.web("#98c4c0"));
                            ra471.add(vl48);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (vl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc41.setVisible(true);
                            vl41.setVisible(true);
                            // sc41.setFill(Color.web("#bac267"));
                            vl41.setFill(Color.web("#98c4c0"));
                            ra411.add(vl41);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (vl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc61.setVisible(true);
                            vl51.setVisible(true);
                            //  sc61.setFill(Color.web("#bac267"));
                            vl51.setFill(Color.web("#98c4c0"));
                            ra511.add(vl51);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (hl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc52.setVisible(true);
                            hl51.setVisible(true);
                            // sc52.setFill(Color.web("#bac267"));
                            hl51.setFill(Color.web("#98c4c0"));
                            ra411.add(hl51);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra511.add(hl51);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (vl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc42.setVisible(true);
                            vl42.setVisible(true);
                            //  sc42.setFill(Color.web("#bac267"));
                            vl42.setFill(Color.web("#98c4c0"));
                            ra411.add(vl42);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra421.add(vl42);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                        if (hl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc51.setVisible(true);
                            hl51.setVisible(true);
                            // sc51.setFill(Color.web("#bac267"));
                            hl51.setFill(Color.web("#98c4c0"));
                            ra511.add(hl51);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra411.add(hl51);
                            hasAward=false;
                            if (ra411.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r41);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (hl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc53.setVisible(true);
                            hl52.setVisible(true);
                            //  sc53.setFill(Color.web("#bac267"));
                            hl52.setFill(Color.web("#98c4c0"));
                            ra521.add(hl52);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra421.add(hl52);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (vl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc62.setVisible(true);
                            vl52.setVisible(true);
                            // sc62.setFill(Color.web("#bac267"));
                            vl52.setFill(Color.web("#98c4c0"));
                            ra511.add(vl52);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra521.add(vl52);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (vl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc43.setVisible(true);
                            vl43.setVisible(true);
                            // sc43.setFill(Color.web("#bac267"));
                            vl43.setFill(Color.web("#98c4c0"));
                            ra421.add(vl43);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra431.add(vl43);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (hl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc52.setVisible(true);
                            hl52.setVisible(true);
                            //sc52.setFill(Color.web("#bac267"));
                            hl52.setFill(Color.web("#98c4c0"));
                            ra521.add(hl52);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra421.add(hl52);
                            hasAward=false;
                            if (ra421.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r42);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (hl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc54.setVisible(true);
                            hl53.setVisible(true);
                            //   sc54.setFill(Color.web("#bac267"));
                            hl53.setFill(Color.web("#98c4c0"));
                            ra431.add(hl53);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra531.add(hl53);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (vl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc63.setVisible(true);
                            vl53.setVisible(true);
                            // sc63.setFill(Color.web("#bac267"));
                            vl53.setFill(Color.web("#98c4c0"));
                            ra521.add(vl53);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra531.add(vl53);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (vl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc44.setVisible(true);
                            vl44.setVisible(true);
                            // sc44.setFill(Color.web("#bac267"));
                            vl44.setFill(Color.web("#98c4c0"));
                            ra431.add(vl44);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra441.add(vl44);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (hl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc53.setVisible(true);
                            hl53.setVisible(true);
                            // sc53.setFill(Color.web("#bac267"));
                            hl53.setFill(Color.web("#98c4c0"));
                            ra431.add(hl53);
                            hasAward=false;
                            if (ra431.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r43);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra531.add(hl53);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (hl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc55.setVisible(true);
                            hl54.setVisible(true);
                            // sc55.setFill(Color.web("#bac267"));
                            hl54.setFill(Color.web("#98c4c0"));
                            ra441.add(hl54);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra541.add(hl54);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (vl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc64.setVisible(true);
                            vl54.setVisible(true);
                            //sc64.setFill(Color.web("#bac267"));
                            vl54.setFill(Color.web("#98c4c0"));
                            ra531.add(vl54);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra541.add(vl54);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (vl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc45.setVisible(true);
                            vl45.setVisible(true);
                            // sc45.setFill(Color.web("#bac267"));
                            vl45.setFill(Color.web("#98c4c0"));
                            ra441.add(vl45);
                            hasAward=false;
                            if (ra441.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra451.add(vl45);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (hl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc54.setVisible(true);
                            hl54.setVisible(true);
                            //sc54.setFill(Color.web("#bac267"));
                            hl54.setFill(Color.web("#98c4c0"));
                            ra441.add(hl54);
                            hasAward=false;
                            if (ra441.size()==4){
                                r54.setVisible(true);
                                r44.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r44);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra541.add(hl54);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (hl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc56.setVisible(true);
                            hl55.setVisible(true);
                            // sc56.setFill(Color.web("#bac267"));
                            hl55.setFill(Color.web("#98c4c0"));
                            ra451.add(hl55);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra551.add(hl55);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (vl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc65.setVisible(true);
                            vl55.setVisible(true);
                            //  sc65.setFill(Color.web("#bac267"));
                            vl55.setFill(Color.web("#98c4c0"));
                            ra541.add(vl55);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra551.add(vl55);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    }
                } else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (vl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc46.setVisible(true);
                            vl46.setVisible(true);
                            //  sc46.setFill(Color.web("#bac267"));
                            vl46.setFill(Color.web("#98c4c0"));
                            ra451.add(vl46);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra461.add(vl46);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (hl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc55.setVisible(true);
                            hl55.setVisible(true);
                            // sc55.setFill(Color.web("#bac267"));
                            hl55.setFill(Color.web("#98c4c0"));
                            ra451.add(hl55);
                            hasAward=false;
                            if (ra451.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r45);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra551.add(hl55);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (hl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc57.setVisible(true);
                            hl56.setVisible(true);
                            //  sc57.setFill(Color.web("#bac267"));
                            hl56.setFill(Color.web("#98c4c0"));
                            ra461.add(hl56);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra561.add(hl56);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (vl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc66.setVisible(true);
                            vl56.setVisible(true);
                            // sc66.setFill(Color.web("#bac267"));
                            vl56.setFill(Color.web("#98c4c0"));
                            ra551.add(vl56);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra561.add(vl56);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (vl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc47.setVisible(true);
                            vl47.setVisible(true);
                            // sc47.setFill(Color.web("#bac267"));
                            vl47.setFill(Color.web("#98c4c0"));
                            ra461.add(vl47);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra471.add(vl47);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (hl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc56.setVisible(true);
                            hl56.setVisible(true);
                            //    sc56.setFill(Color.web("#bac267"));
                            hl56.setFill(Color.web("#98c4c0"));
                            ra461.add(hl56);
                            hasAward=false;
                            if (ra461.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r46);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra561.add(hl56);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (hl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc58.setVisible(true);
                            hl57.setVisible(true);
                            // sc58.setFill(Color.web("#bac267"));
                            hl57.setFill(Color.web("#98c4c0"));
                            ra471.add(hl57);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra571.add(hl57);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (vl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc67.setVisible(true);
                            vl57.setVisible(true);
                            // sc67.setFill(Color.web("#bac267"));
                            vl57.setFill(Color.web("#98c4c0"));
                            ra561.add(vl57);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra571.add(vl57);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (vl48.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc48.setVisible(true);
                            vl48.setVisible(true);
                            //  sc48.setFill(Color.web("#bac267"));
                            vl48.setFill(Color.web("#98c4c0"));
                            ra471.add(vl48);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (hl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc57.setVisible(true);
                            hl57.setVisible(true);
                            //   sc57.setFill(Color.web("#bac267"));
                            hl57.setFill(Color.web("#98c4c0"));
                            ra471.add(hl57);
                            hasAward=false;
                            if (ra471.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r47);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra571.add(hl57);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (vl58.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc68.setVisible(true);
                            vl58.setVisible(true);
                            //   sc68.setFill(Color.web("#bac267"));
                            vl58.setFill(Color.web("#98c4c0"));
                            ra571.add(vl58);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                }
                else if (x > 11 && x < 47 && y > 255 && y < 291) {
                    if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                        if (vl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc51.setVisible(true);
                            vl51.setVisible(true);
                            //    sc51.setFill(Color.web("#bac267"));
                            vl51.setFill(Color.web("#98c4c0"));
                            ra511.add(vl51);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (hl61.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc62.setVisible(true);
                            hl61.setVisible(true);
                            //    sc62.setFill(Color.web("#bac267"));
                            hl61.setFill(Color.web("#98c4c0"));
                            ra511.add(hl61);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra611.add(hl61);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                        if (vl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc71.setVisible(true);
                            vl71.setVisible(true);
                            //  sc71.setFill(Color.web("#bac267"));
                            vl71.setFill(Color.web("#98c4c0"));
                            ra611.add(vl71);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (vl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc52.setVisible(true);
                            vl52.setVisible(true);
                            // sc52.setFill(Color.web("#bac267"));
                            vl52.setFill(Color.web("#98c4c0"));
                            ra511.add(vl52);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra521.add(vl52);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (hl61.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc61.setVisible(true);
                            hl61.setVisible(true);
                            //  sc61.setFill(Color.web("#bac267"));
                            hl61.setFill(Color.web("#98c4c0"));
                            ra511.add(hl61);
                            hasAward=false;
                            if (ra511.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r51);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra611.add(hl61);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (hl62.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc63.setVisible(true);
                            hl62.setVisible(true);
                            //  sc63.setFill(Color.web("#bac267"));
                            hl62.setFill(Color.web("#98c4c0"));
                            ra521.add(hl62);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra621.add(hl62);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (vl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc72.setVisible(true);
                            vl72.setVisible(true);
                            // sc72.setFill(Color.web("#bac267"));
                            vl72.setFill(Color.web("#98c4c0"));
                            ra611.add(vl72);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra621.add(vl72);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (vl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc53.setVisible(true);
                            vl53.setVisible(true);
                            // sc53.setFill(Color.web("#bac267"));
                            vl53.setFill(Color.web("#98c4c0"));
                            ra521.add(vl53);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra531.add(vl53);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (hl62.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc62.setVisible(true);
                            hl62.setVisible(true);
                            //    sc62.setFill(Color.web("#bac267"));
                            hl62.setFill(Color.web("#98c4c0"));
                            ra521.add(hl62);
                            hasAward=false;
                            if (ra521.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r52);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra621.add(hl62);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (hl63.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc64.setVisible(true);
                            hl63.setVisible(true);
                            // sc64.setFill(Color.web("#bac267"));
                            hl63.setFill(Color.web("#98c4c0"));
                            ra531.add(hl63);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra531.add(hl63);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (vl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //   sc73.setVisible(true);
                            vl73.setVisible(true);
                            //  sc73.setFill(Color.web("#bac267"));
                            vl73.setFill(Color.web("#98c4c0"));
                            ra621.add(vl73);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra631.add(vl73);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 256 && y < 292) {
                    if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (vl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc54.setVisible(true);
                            vl54.setVisible(true);
                            //  sc54.setFill(Color.web("#bac267"));
                            vl54.setFill(Color.web("#98c4c0"));
                            ra531.add(vl54);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra541.add(vl54);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (hl63.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc63.setVisible(true);
                            hl63.setVisible(true);
                            //  sc63.setFill(Color.web("#bac267"));
                            hl63.setFill(Color.web("#98c4c0"));
                            ra531.add(hl63);
                            hasAward=false;
                            if (ra531.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r53);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra631.add(hl63);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (hl64.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc65.setVisible(true);
                            hl64.setVisible(true);
                            //  sc65.setFill(Color.web("#bac267"));
                            hl64.setFill(Color.web("#98c4c0"));
                            ra541.add(hl64);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra641.add(hl64);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (vl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc74.setVisible(true);
                            vl74.setVisible(true);
                            // sc74.setFill(Color.web("#bac267"));
                            vl74.setFill(Color.web("#98c4c0"));
                            ra631.add(vl74);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra641.add(vl74);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (vl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc55.setVisible(true);
                            vl55.setVisible(true);
                            // sc55.setFill(Color.web("#bac267"));
                            vl55.setFill(Color.web("#98c4c0"));
                            ra541.add(vl55);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra551.add(vl55);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (hl64.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc64.setVisible(true);
                            hl64.setVisible(true);
                            //  sc64.setFill(Color.web("#bac267"));
                            hl64.setFill(Color.web("#98c4c0"));
                            ra541.add(hl64);
                            hasAward=false;
                            if (ra541.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r54);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra641.add(hl64);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (hl65.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc66.setVisible(true);
                            hl65.setVisible(true);
                            // sc66.setFill(Color.web("#bac267"));
                            hl65.setFill(Color.web("#98c4c0"));
                            ra551.add(hl65);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra651.add(hl65);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (vl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc75.setVisible(true);
                            vl75.setVisible(true);
                            //  sc75.setFill(Color.web("#bac267"));
                            vl75.setFill(Color.web("#98c4c0"));
                            ra641.add(vl75);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra651.add(vl75);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (vl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc56.setVisible(true);
                            vl56.setVisible(true);
                            // sc56.setFill(Color.web("#bac267"));
                            vl56.setFill(Color.web("#98c4c0"));
                            ra551.add(vl56);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra561.add(vl56);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (hl65.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc65.setVisible(true);
                            hl65.setVisible(true);
                            // sc65.setFill(Color.web("#bac267"));
                            hl65.setFill(Color.web("#98c4c0"));
                            ra551.add(hl65);
                            hasAward=false;
                            if (ra551.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r55);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra651.add(hl65);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (hl66.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc67.setVisible(true);
                            hl66.setVisible(true);
                            //sc67.setFill(Color.web("#bac267"));
                            hl66.setFill(Color.web("#98c4c0"));
                            ra561.add(hl66);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra661.add(hl66);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (vl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc76.setVisible(true);
                            vl76.setVisible(true);
                            // sc76.setFill(Color.web("#bac267"));
                            vl76.setFill(Color.web("#98c4c0"));
                            ra651.add(vl76);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra661.add(vl76);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (vl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc57.setVisible(true);
                            vl57.setVisible(true);
                            //sc57.setFill(Color.web("#bac267"));
                            vl57.setFill(Color.web("#98c4c0"));
                            ra561.add(vl57);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra571.add(vl57);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (hl66.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc66.setVisible(true);
                            hl66.setVisible(true);
                            // sc66.setFill(Color.web("#bac267"));
                            hl66.setFill(Color.web("#98c4c0"));
                            ra561.add(hl66);
                            hasAward=false;
                            if (ra561.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r56);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra661.add(hl66);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (hl67.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc68.setVisible(true);
                            hl67.setVisible(true);
                            //sc68.setFill(Color.web("#bac267"));
                            hl67.setFill(Color.web("#98c4c0"));
                            ra571.add(hl67);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra671.add(hl67);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (vl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc77.setVisible(true);
                            vl77.setVisible(true);
                            // sc77.setFill(Color.web("#bac267"));
                            vl77.setFill(Color.web("#98c4c0"));
                            ra661.add(vl77);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra671.add(vl77);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (vl58.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc58.setVisible(true);
                            vl58.setVisible(true);
                            //  sc58.setFill(Color.web("#bac267"));
                            vl58.setFill(Color.web("#98c4c0"));
                            ra571.add(vl58);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (hl67.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc67.setVisible(true);
                            hl67.setVisible(true);
                            // sc67.setFill(Color.web("#bac267"));
                            hl67.setFill(Color.web("#98c4c0"));
                            ra571.add(hl67);
                            hasAward=false;
                            if (ra571.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r57);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra671.add(hl67);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                        if (vl78.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc78.setVisible(true);
                            vl78.setVisible(true);
                            //  sc78.setFill(Color.web("#bac267"));
                            vl78.setFill(Color.web("#98c4c0"));
                            ra671.add(vl78);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (vl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc61.setVisible(true);
                            vl71.setVisible(true);
                            //sc61.setFill(Color.web("#bac267"));
                            vl71.setFill(Color.web("#98c4c0"));
                            ra611.add(vl71);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc81.getCenterX() && y1 == sc81.getCenterY()) {
                        if (vl81.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc81.setVisible(true);
                            vl81.setVisible(true);
                            // sc81.setFill(Color.web("#bac267"));
                            vl81.setFill(Color.web("#98c4c0"));
                            ra711.add(vl81);
                            hasAward=false;
                            if (ra711.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r71);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (hl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc72.setVisible(true);
                            hl71.setVisible(true);
                            //  sc72.setFill(Color.web("#bac267"));
                            hl71.setFill(Color.web("#98c4c0"));
                            ra611.add(hl71);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra711.add(hl71);
                            hasAward=false;
                            if (ra711.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r71);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (vl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc62.setVisible(true);
                            vl72.setVisible(true);
                            // sc62.setFill(Color.web("#bac267"));
                            vl72.setFill(Color.web("#98c4c0"));
                            ra611.add(vl72);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra621.add(vl72);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                        if (hl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc71.setVisible(true);
                            hl71.setVisible(true);
                            //  sc71.setFill(Color.web("#bac267"));
                            hl71.setFill(Color.web("#98c4c0"));
                            ra611.add(hl71);
                            hasAward=false;
                            if (ra611.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r61);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra711.add(hl71);
                            hasAward=false;
                            if (ra711.size()==4) {
                                r71.setVisible(true);
                                r71.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r71);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (hl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc73.setVisible(true);
                            hl72.setVisible(true);
                            //  sc73.setFill(Color.web("#bac267"));
                            hl72.setFill(Color.web("#98c4c0"));
                            ra621.add(hl72);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra721.add(hl72);
                            hasAward=false;
                            if (ra721.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r72);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc82.getCenterX() && y1 == sc82.getCenterY()) {
                        if (vl82.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc82.setVisible(true);
                            vl82.setVisible(true);
                            // sc82.setFill(Color.web("#bac267"));
                            vl82.setFill(Color.web("#98c4c0"));
                            ra711.add(vl82);
                            hasAward=false;
                            if (ra711.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r71);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra721.add(vl82);
                            hasAward=false;
                            if (ra721.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r72);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (vl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc63.setVisible(true);
                            vl73.setVisible(true);
                            //sc63.setFill(Color.web("#bac267"));
                            vl73.setFill(Color.web("#98c4c0"));
                            ra621.add(vl73);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra631.add(vl73);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (hl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc72.setVisible(true);
                            hl72.setVisible(true);
                            //sc72.setFill(Color.web("#bac267"));
                            hl72.setFill(Color.web("#98c4c0"));
                            ra721.add(hl72);
                            hasAward=false;
                            if (ra721.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r72);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra621.add(hl72);
                            hasAward=false;
                            if (ra621.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r62);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (hl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc74.setVisible(true);
                            hl73.setVisible(true);
                            // sc74.setFill(Color.web("#bac267"));
                            hl73.setFill(Color.web("#98c4c0"));
                            ra731.add(hl73);
                            hasAward=false;
                            if (ra731.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r73);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra631.add(hl73);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc83.getCenterX() && y1 == sc83.getCenterY()) {
                        if (vl83.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc83.setVisible(true);
                            vl83.setVisible(true);
                            //sc83.setFill(Color.web("#bac267"));
                            vl83.setFill(Color.web("#98c4c0"));
                            ra721.add(vl83);
                            hasAward=false;
                            if (ra721.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r72);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra731.add(vl83);
                            hasAward=false;
                            if (ra731.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r73);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (vl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc64.setVisible(true);
                            vl74.setVisible(true);
                            //sc64.setFill(Color.web("#bac267"));
                            vl74.setFill(Color.web("#98c4c0"));
                            ra631.add(vl74);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra641.add(vl74);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (hl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc73.setVisible(true);
                            hl73.setVisible(true);
                            //sc73.setFill(Color.web("#bac267"));
                            hl73.setFill(Color.web("#98c4c0"));
                            ra631.add(hl73);
                            hasAward=false;
                            if (ra631.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r63);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra731.add(hl73);
                            hasAward=false;
                            if (ra731.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r73);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (hl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc75.setVisible(true);
                             hl74.setVisible(true);
                            //sc75.setFill(Color.web("#bac267"));
                            hl74.setFill(Color.web("#98c4c0"));
                            ra641.add(hl74);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra741.add(hl74);
                            hasAward=false;
                            if (ra741.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r74);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc84.getCenterX() && y1 == sc84.getCenterY()) {
                        if (vl84.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc84.setVisible(true);
                            vl84.setVisible(true);
                            // sc84.setFill(Color.web("#bac267"));
                            vl84.setFill(Color.web("#98c4c0"));
                            ra731.add(vl84);
                            hasAward=false;
                            if (ra731.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r73);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra741.add(vl84);
                            hasAward=false;
                            if (ra741.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r74);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (vl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //    sc65.setVisible(true);
                            vl75.setVisible(true);
                            //  sc65.setFill(Color.web("#bac267"));
                            vl75.setFill(Color.web("#98c4c0"));
                            ra641.add(vl75);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra651.add(vl75);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (hl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc74.setVisible(true);
                            hl74.setVisible(true);
                            // sc74.setFill(Color.web("#bac267"));
                            hl74.setFill(Color.web("#98c4c0"));
                            ra641.add(hl74);
                            hasAward=false;
                            if (ra641.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r64);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra741.add(hl74);
                            hasAward=false;
                            if (ra741.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r74);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (hl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc76.setVisible(true);
                            hl75.setVisible(true);
                            //    sc76.setFill(Color.web("#bac267"));
                            hl75.setFill(Color.web("#98c4c0"));
                            ra651.add(hl75);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra751.add(hl75);
                            hasAward=false;
                            if (ra751.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r75);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc85.getCenterX() && y1 == sc85.getCenterY()) {
                        if (vl85.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc85.setVisible(true);
                            vl85.setVisible(true);
                            //  sc85.setFill(Color.web("#bac267"));
                            vl85.setFill(Color.web("#98c4c0"));
                            ra741.add(vl85);
                            hasAward=false;
                            if (ra741.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r74);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra751.add(vl85);
                            hasAward=false;
                            if (ra751.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r75);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (vl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc66.setVisible(true);
                            vl76.setVisible(true);
                            //  sc66.setFill(Color.web("#bac267"));
                            vl76.setFill(Color.web("#98c4c0"));
                            ra651.add(vl76);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra661.add(vl76);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (hl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc75.setVisible(true);
                            hl75.setVisible(true);
                            //  sc75.setFill(Color.web("#bac267"));
                            hl75.setFill(Color.web("#98c4c0"));
                            ra651.add(hl75);
                            hasAward=false;
                            if (ra651.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r65);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra751.add(hl75);
                            hasAward=false;
                            if (ra751.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r75);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (hl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc77.setVisible(true);
                            hl76.setVisible(true);
                            //  sc77.setFill(Color.web("#bac267"));
                            hl76.setFill(Color.web("#98c4c0"));
                            ra661.add(hl76);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra761.add(hl76);
                            hasAward=false;
                            if (ra761.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r76);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc86.getCenterX() && y1 == sc86.getCenterY()) {
                        if (vl86.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc86.setVisible(true);
                            vl86.setVisible(true);
                            // sc86.setFill(Color.web("#bac267"));
                            vl86.setFill(Color.web("#98c4c0"));
                            ra751.add(vl86);
                            hasAward=false;
                            if (ra751.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r75);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra761.add(vl86);
                            hasAward=false;
                            if (ra761.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r76);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (vl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc67.setVisible(true);
                            vl77.setVisible(true);
                            // sc67.setFill(Color.web("#bac267"));
                            vl77.setFill(Color.web("#98c4c0"));
                            ra661.add(vl77);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra671.add(vl77);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (hl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //sc76.setVisible(true);
                            hl76.setVisible(true);
                            //sc76.setFill(Color.web("#bac267"));
                            hl76.setFill(Color.web("#98c4c0"));
                            ra661.add(hl76);
                            hasAward=false;
                            if (ra661.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r66);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra761.add(hl76);
                            hasAward=false;
                            if (ra761.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r76);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                        if (hl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc78.setVisible(true);
                            hl77.setVisible(true);
                            //sc78.setFill(Color.web("#bac267"));
                            hl77.setFill(Color.web("#98c4c0"));
                            ra671.add(hl77);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra771.add(hl77);
                            hasAward=false;
                            if (ra771.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r77);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc87.getCenterX() && y1 == sc87.getCenterY()) {
                        if (vl87.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc87.setVisible(true);
                            vl87.setVisible(true);
                            //sc87.setFill(Color.web("#bac267"));
                            vl87.setFill(Color.web("#98c4c0"));
                            ra761.add(vl87);
                            hasAward=false;
                            if (ra761.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r76);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra771.add(vl87);
                            hasAward=false;
                            if (ra771.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r77);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (vl78.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            //  sc68.setVisible(true);
                            vl78.setVisible(true);
                            // sc68.setFill(Color.web("#bac267"));
                            vl78.setFill(Color.web("#98c4c0"));
                            ra671.add(vl78);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (hl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc77.setVisible(true);
                            hl77.setVisible(true);
                            // sc77.setFill(Color.web("#bac267"));
                            hl77.setFill(Color.web("#98c4c0"));
                            ra671.add(hl77);
                            hasAward=false;
                            if (ra671.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r67);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra771.add(hl77);
                            hasAward=false;
                            if (ra771.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r77);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc88.getCenterX() && y1 == sc88.getCenterY()) {
                        if (vl88.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            // sc88.setVisible(true);
                            vl88.setVisible(true);
                            // sc88.setFill(Color.web("#bac267"));
                            vl88.setFill(Color.web("#98c4c0"));
                            ra771.add(vl88);
                            hasAward=false;
                            if (ra771.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#dcff3e"));
                                allRectangles.add(r77);
                                firstPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                }
                isSecondCircle = false;
                if(hasAward){
                    isFirstPlayerTurn=true;
                }
                else {
                }

            }
            //commands for second player
        } /*else {
            if (!isSecondCircle) {
                if (x > 11 && x < 47 && y > 4 && y < 40) {
                    sc11.setVisible(true);
                    sc11.setFill(Color.web("#307986"));
                    selectedC.add(sc11);
                } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                    sc12.setVisible(true);
                    sc12.setFill(Color.web("#307986"));
                    selectedC.add(sc12);
                } else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    sc13.setVisible(true);
                    sc13.setFill(Color.web("#307986"));
                    selectedC.add(sc13);
                } else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    sc14.setVisible(true);
                    sc14.setFill(Color.web("#307986"));
                    selectedC.add(sc14);
                } else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    sc15.setVisible(true);
                    sc15.setFill(Color.web("#307986"));
                    selectedC.add(sc15);
                } else if (x > 262 && x < 298 && y > 5 && y < 41) {
                    sc16.setVisible(true);
                    sc16.setFill(Color.web("#307986"));
                    selectedC.add(sc16);
                } else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    sc17.setVisible(true);
                    sc17.setFill(Color.web("#307986"));
                    selectedC.add(sc17);
                } else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    sc18.setVisible(true);
                    sc18.setFill(Color.web("#307986"));
                    selectedC.add(sc18);
                } else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    sc21.setVisible(true);
                    sc21.setFill(Color.web("#307986"));
                    selectedC.add(sc21);
                } else if (x > 62 && x < 98 && y > 55 && y < 91) {
                    sc22.setVisible(true);
                    sc22.setFill(Color.web("#307986"));
                    selectedC.add(sc22);
                } else if (x > 112 && x < 148 && y > 55 && y < 91) {
                    sc23.setVisible(true);
                    sc23.setFill(Color.web("#307986"));
                    selectedC.add(sc23);
                } else if (x > 161 && x < 197 && y > 55 && y < 91) {
                    sc24.setVisible(true);
                    sc24.setFill(Color.web("#307986"));
                    selectedC.add(sc24);
                } else if (x > 212 && x < 248 && y > 55 && y < 91) {
                    sc25.setVisible(true);
                    sc25.setFill(Color.web("#307986"));
                    selectedC.add(sc25);
                } else if (x > 262 && x < 298 && y > 55 && y < 91) {
                    sc26.setVisible(true);
                    sc26.setFill(Color.web("#307986"));
                    selectedC.add(sc26);
                } else if (x > 312 && x < 348 && y > 55 && y < 91) {
                    sc27.setVisible(true);
                    sc27.setFill(Color.web("#307986"));
                    selectedC.add(sc27);
                } else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    sc28.setVisible(true);
                    sc28.setFill(Color.web("#307986"));
                    selectedC.add(sc28);
                } else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    sc31.setVisible(true);
                    sc31.setFill(Color.web("#307986"));
                    selectedC.add(sc31);
                } else if (x > 62 && x < 98 && y > 105 && y < 141) {
                    sc32.setVisible(true);
                    sc32.setFill(Color.web("#307986"));
                    selectedC.add(sc32);
                } else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    sc33.setVisible(true);
                    sc33.setFill(Color.web("#307986"));
                    selectedC.add(sc33);
                } else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    sc34.setVisible(true);
                    sc34.setFill(Color.web("#307986"));
                    selectedC.add(sc34);

                } else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    sc35.setVisible(true);
                    sc35.setFill(Color.web("#307986"));
                    selectedC.add(sc35);

                } else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    sc36.setVisible(true);
                    sc36.setFill(Color.web("#307986"));
                    selectedC.add(sc36);
                } else if (x > 312 && x < 348 && y > 106 && y < 142) {
                    sc37.setVisible(true);
                    sc37.setFill(Color.web("#307986"));
                    selectedC.add(sc37);
                } else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    sc38.setVisible(true);
                    sc38.setFill(Color.web("#307986"));
                    selectedC.add(sc38);
                } else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    sc41.setVisible(true);
                    sc41.setFill(Color.web("#307986"));
                    selectedC.add(sc41);
                } else if (x > 62 && x < 98 && y > 155 && y < 191) {
                    sc42.setVisible(true);
                    sc42.setFill(Color.web("#307986"));
                    selectedC.add(sc42);
                } else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    sc43.setVisible(true);
                    sc43.setFill(Color.web("#307986"));
                    selectedC.add(sc43);
                } else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    sc44.setVisible(true);
                    sc44.setFill(Color.web("#307986"));
                    selectedC.add(sc44);
                } else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    sc45.setVisible(true);
                    sc45.setFill(Color.web("#307986"));
                    selectedC.add(sc45);
                } else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    sc46.setVisible(true);
                    sc46.setFill(Color.web("#307986"));
                    selectedC.add(sc46);
                } else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    sc47.setVisible(true);
                    sc47.setFill(Color.web("#307986"));
                    selectedC.add(sc47);
                } else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    sc48.setVisible(true);
                    sc48.setFill(Color.web("#307986"));
                    selectedC.add(sc48);
                } else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    sc51.setVisible(true);
                    sc51.setFill(Color.web("#307986"));
                    selectedC.add(sc51);
                } else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    sc52.setVisible(true);
                    sc52.setFill(Color.web("#307986"));
                    selectedC.add(sc52);
                } else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    sc53.setVisible(true);
                    sc53.setFill(Color.web("#307986"));
                    selectedC.add(sc53);
                } else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    sc54.setVisible(true);
                    sc54.setFill(Color.web("#307986"));
                    selectedC.add(sc54);
                } else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    sc55.setVisible(true);
                    sc55.setFill(Color.web("#307986"));
                    selectedC.add(sc55);
                } else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    sc56.setVisible(true);
                    sc56.setFill(Color.web("#307986"));
                    selectedC.add(sc56);
                } else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    sc57.setVisible(true);
                    sc57.setFill(Color.web("#307986"));
                    selectedC.add(sc57);
                } else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    sc58.setVisible(true);
                    sc58.setFill(Color.web("#307986"));
                    selectedC.add(sc58);
                } else if (x > 11 && x < 47 && y > 255 && y < 291) {
                    sc61.setVisible(true);
                    sc61.setFill(Color.web("#307986"));
                    selectedC.add(sc61);
                } else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    sc62.setVisible(true);
                    sc62.setFill(Color.web("#307986"));
                    selectedC.add(sc62);
                } else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    sc63.setVisible(true);
                    sc63.setFill(Color.web("#307986"));
                    selectedC.add(sc63);
                } else if (x > 161 && x < 197 && y > 256 && y < 292) {
                    sc64.setVisible(true);
                    sc64.setFill(Color.web("#307986"));
                    selectedC.add(sc64);
                } else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    sc65.setVisible(true);
                    sc65.setFill(Color.web("#307986"));
                    selectedC.add(sc65);
                } else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    sc66.setVisible(true);
                    sc66.setFill(Color.web("#307986"));
                    selectedC.add(sc66);
                } else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    sc67.setVisible(true);
                    sc67.setFill(Color.web("#307986"));
                    selectedC.add(sc67);
                } else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    sc68.setVisible(true);
                    sc68.setFill(Color.web("#307986"));
                    selectedC.add(sc68);
                } else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    sc71.setVisible(true);
                    sc71.setFill(Color.web("#307986"));
                    selectedC.add(sc71);
                } else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    sc72.setVisible(true);
                    sc72.setFill(Color.web("#307986"));
                    selectedC.add(sc72);
                } else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    sc73.setVisible(true);
                    sc73.setFill(Color.web("#307986"));
                    selectedC.add(sc73);
                } else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    sc74.setVisible(true);
                    sc74.setFill(Color.web("#307986"));
                    selectedC.add(sc74);
                } else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    sc75.setVisible(true);
                    sc75.setFill(Color.web("#307986"));
                    selectedC.add(sc75);
                } else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    sc76.setVisible(true);
                    sc76.setFill(Color.web("#307986"));
                    selectedC.add(sc76);
                } else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    sc77.setVisible(true);
                    sc77.setFill(Color.web("#307986"));
                    selectedC.add(sc77);
                } else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    sc78.setVisible(true);
                    sc78.setFill(Color.web("#307986"));
                    selectedC.add(sc78);
                } else if (x > 11 && x < 47 && y > 355 && y < 391) {
                    sc81.setVisible(true);
                    sc81.setFill(Color.web("#307986"));
                    selectedC.add(sc81);
                } else if (x > 61 && x < 97 && y > 356 && y < 392) {
                    sc82.setVisible(true);
                    sc82.setFill(Color.web("#307986"));
                    selectedC.add(sc82);
                } else if (x > 111 && x < 147 && y > 356 && y < 392) {
                    sc83.setVisible(true);
                    sc83.setFill(Color.web("#307986"));
                    selectedC.add(sc83);
                } else if (x > 159 && x < 195 && y > 356 && y < 392) {
                    sc84.setVisible(true);
                    sc84.setFill(Color.web("#307986"));
                    selectedC.add(sc84);
                } else if (x > 211 && x < 247 && y > 356 && y < 392) {
                    sc85.setVisible(true);
                    sc85.setFill(Color.web("#307986"));
                    selectedC.add(sc85);
                } else if (x > 261 && x < 297 && y > 356 && y < 392) {
                    sc86.setVisible(true);
                    sc86.setFill(Color.web("#307986"));
                    selectedC.add(sc86);
                } else if (x > 312 && x < 348 && y > 356 && y < 392) {
                    sc87.setVisible(true);
                    sc87.setFill(Color.web("#307986"));
                    selectedC.add(sc87);
                } else if (x > 360 && x < 396 && y > 356 && y < 392) {
                    sc88.setVisible(true);
                    sc88.setFill(Color.web("#307986"));
                    selectedC.add(sc88);
                }
                isSecondCircle = true;
            }
            //else dovmi commands for second circles and lines
          /*  else {
                double x1 = selectedC.get(0).getCenterX();
                double y1 = selectedC.get(0).getCenterY();

                if (x > 11 && x < 47 && y > 4 && y < 40) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (hl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc12.setVisible(true);
                            hl11.setVisible(true);
                            sc12.setFill(Color.web("#307986"));
                            hl11.setFill(Color.web("#d1e76f"));
                            ra11.add(hl11);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (vl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc21.setVisible(true);
                            vl11.setVisible(true);
                            sc21.setFill(Color.web("#307986"));
                            vl11.setFill(Color.web("#d1e76f"));
                            ra11.add(vl11);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                    if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                        if (hl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc11.setVisible(true);
                            hl11.setVisible(true);
                            sc11.setFill(Color.web("#307986"));
                            hl11.setFill(Color.web("#d1e76f"));
                            ra11.add(hl11);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (hl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc13.setVisible(true);
                            hl12.setVisible(true);
                            sc13.setFill(Color.web("#307986"));
                            hl12.setFill(Color.web("#d1e76f"));
                            ra12.add(hl12);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (vl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc22.setVisible(true);
                            vl12.setVisible(true);
                            sc22.setFill(Color.web("#307986"));
                            vl12.setFill(Color.web("#d1e76f"));
                            ra11.add(vl12);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra12.add(vl12);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (hl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc12.setVisible(true);
                            hl12.setVisible(true);
                            sc12.setFill(Color.web("#307986"));
                            hl12.setFill(Color.web("#d1e76f"));
                            ra12.add(hl12);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (hl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc14.setVisible(true);
                            hl13.setVisible(true);
                            sc14.setFill(Color.web("#307986"));
                            hl13.setFill(Color.web("#d1e76f"));
                            ra13.add(hl13);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (vl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc23.setVisible(true);
                            vl13.setVisible(true);
                            sc23.setFill(Color.web("#307986"));
                            vl13.setFill(Color.web("#d1e76f"));
                            ra12.add(vl13);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra13.add(vl13);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (hl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc13.setVisible(true);
                            hl13.setVisible(true);
                            sc13.setFill(Color.web("#307986"));
                            hl13.setFill(Color.web("#d1e76f"));
                            ra13.add(hl13);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (hl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc15.setVisible(true);
                            hl14.setVisible(true);
                            sc15.setFill(Color.web("#307986"));
                            hl14.setFill(Color.web("#d1e76f"));
                            ra14.add(hl14);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (vl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc24.setVisible(true);
                            vl14.setVisible(true);
                            sc24.setFill(Color.web("#307986"));
                            vl14.setFill(Color.web("#d1e76f"));
                            ra13.add(vl14);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra14.add(vl14);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (hl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc14.setVisible(true);
                            hl14.setVisible(true);
                            sc14.setFill(Color.web("#307986"));
                            hl14.setFill(Color.web("#d1e76f"));
                            ra14.add(hl14);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (hl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc16.setVisible(true);
                            hl15.setVisible(true);
                            sc16.setFill(Color.web("#307986"));
                            hl15.setFill(Color.web("#d1e76f"));
                            ra15.add(hl15);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (vl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc25.setVisible(true);
                            vl15.setVisible(true);
                            sc25.setFill(Color.web("#307986"));
                            vl15.setFill(Color.web("#d1e76f"));
                            ra14.add(vl15);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra15.add(vl15);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 5 && y < 41) {
                    if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (hl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc15.setVisible(true);
                            hl15.setVisible(true);
                            sc15.setFill(Color.web("#307986"));
                            hl15.setFill(Color.web("#d1e76f"));
                            ra15.add(hl15);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (hl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc17.setVisible(true);
                            hl16.setVisible(true);
                            sc17.setFill(Color.web("#307986"));
                            hl16.setFill(Color.web("#d1e76f"));
                            ra16.add(hl16);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (vl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc26.setVisible(true);
                            vl16.setVisible(true);
                            sc26.setFill(Color.web("#307986"));
                            vl16.setFill(Color.web("#d1e76f"));
                            ra15.add(vl16);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra16.add(vl16);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (hl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc16.setVisible(true);
                            hl16.setVisible(true);
                            sc16.setFill(Color.web("#307986"));
                            hl16.setFill(Color.web("#d1e76f"));
                            ra16.add(hl16);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                        if (hl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc18.setVisible(true);
                            hl17.setVisible(true);
                            sc18.setFill(Color.web("#307986"));
                            hl17.setFill(Color.web("#d1e76f"));
                            ra17.add(hl17);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (vl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc27.setVisible(true);
                            vl17.setVisible(true);
                            sc27.setFill(Color.web("#307986"));
                            vl17.setFill(Color.web("#d1e76f"));
                            ra16.add(vl17);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra17.add(vl17);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (hl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc17.setVisible(true);
                            hl17.setVisible(true);
                            sc17.setFill(Color.web("#307986"));
                            hl17.setFill(Color.web("#d1e76f"));
                            ra17.add(hl17);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (vl18.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc28.setVisible(true);
                            vl18.setVisible(true);
                            sc28.setFill(Color.web("#307986"));
                            vl18.setFill(Color.web("#d1e76f"));
                            ra17.add(vl18);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (hl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc22.setVisible(true);
                            hl21.setVisible(true);
                            sc22.setFill(Color.web("#307986"));
                            hl21.setFill(Color.web("#d1e76f"));
                            ra11.add(hl21);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra21.add(hl21);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc11.getCenterX() && y1 == sc11.getCenterY()) {
                        if (vl11.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc11.setVisible(true);
                            vl11.setVisible(true);
                            sc11.setFill(Color.web("#307986"));
                            vl11.setFill(Color.web("#d1e76f"));
                            ra11.add(vl11);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (vl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc31.setVisible(true);
                            vl21.setVisible(true);
                            sc31.setFill(Color.web("#307986"));
                            vl21.setFill(Color.web("#d1e76f"));
                            ra21.add(vl21);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 55 && y < 91) {
                    if (x1 == sc12.getCenterX() && y1 == sc12.getCenterY()) {
                        if (vl12.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc12.setVisible(true);
                            vl12.setVisible(true);
                            sc12.setFill(Color.web("#307986"));
                            vl12.setFill(Color.web("#d1e76f"));
                            ra11.add(vl12);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra12.add(vl12);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (hl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc21.setVisible(true);
                            hl21.setVisible(true);
                            sc21.setFill(Color.web("#307986"));
                            hl21.setFill(Color.web("#d1e76f"));
                            ra11.add(hl21);
                            hasAward = false;
                            if (ra11.size() == 4) {
                                r11.setVisible(true);
                                r11.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r11);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra21.add(hl21);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (hl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc23.setVisible(true);
                            hl22.setVisible(true);
                            sc23.setFill(Color.web("#307986"));
                            hl22.setFill(Color.web("#d1e76f"));
                            ra12.add(hl22);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra22.add(hl22);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (vl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc32.setVisible(true);
                            vl22.setVisible(true);
                            sc32.setFill(Color.web("#307986"));
                            vl22.setFill(Color.web("#d1e76f"));
                            ra22.add(vl22);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra23.add(vl22);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 55 && y < 91) {
                    if (x1 == sc13.getCenterX() && y1 == sc13.getCenterY()) {
                        if (vl13.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc13.setVisible(true);
                            vl13.setVisible(true);
                            sc13.setFill(Color.web("#307986"));
                            vl13.setFill(Color.web("#d1e76f"));
                            ra12.add(vl13);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra13.add(vl13);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (hl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc22.setVisible(true);
                            hl22.setVisible(true);
                            sc22.setFill(Color.web("#307986"));
                            hl22.setFill(Color.web("#d1e76f"));
                            ra12.add(hl22);
                            hasAward = false;
                            if (ra12.size() == 4) {
                                r12.setVisible(true);
                                r12.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r12);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra22.add(hl22);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (hl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc24.setVisible(true);
                            hl23.setVisible(true);
                            sc24.setFill(Color.web("#307986"));
                            hl23.setFill(Color.web("#d1e76f"));
                            ra13.add(hl23);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra23.add(hl23);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (vl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc33.setVisible(true);
                            vl23.setVisible(true);
                            sc33.setFill(Color.web("#307986"));
                            vl23.setFill(Color.web("#d1e76f"));
                            ra22.add(vl23);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra23.add(vl23);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 55 && y < 91) {
                    if (x1 == sc14.getCenterX() && y1 == sc14.getCenterY()) {
                        if (vl14.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc14.setVisible(true);
                            vl14.setVisible(true);
                            sc14.setFill(Color.web("#307986"));
                            vl14.setFill(Color.web("#d1e76f"));
                            ra13.add(vl14);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra14.add(vl14);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (hl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc23.setVisible(true);
                            hl23.setVisible(true);
                            sc23.setFill(Color.web("#307986"));
                            hl23.setFill(Color.web("#d1e76f"));
                            ra13.add(hl23);
                            hasAward = false;
                            if (ra13.size() == 4) {
                                r13.setVisible(true);
                                r13.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r13);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra23.add(hl23);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (hl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc25.setVisible(true);
                            hl24.setVisible(true);
                            sc25.setFill(Color.web("#307986"));
                            hl24.setFill(Color.web("#d1e76f"));
                            ra14.add(hl24);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra24.add(hl24);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (vl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc34.setVisible(true);
                            vl24.setVisible(true);
                            sc34.setFill(Color.web("#307986"));
                            vl24.setFill(Color.web("#d1e76f"));
                            ra23.add(vl24);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra24.add(vl24);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 55 && y < 91) {
                    if (x1 == sc15.getCenterX() && y1 == sc15.getCenterY()) {
                        if (vl15.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc15.setVisible(true);
                            vl15.setVisible(true);
                            sc15.setFill(Color.web("#307986"));
                            vl15.setFill(Color.web("#d1e76f"));
                            ra14.add(vl15);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra15.add(vl15);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (hl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc24.setVisible(true);
                            hl24.setVisible(true);
                            sc24.setFill(Color.web("#307986"));
                            hl24.setFill(Color.web("#d1e76f"));
                            ra14.add(hl24);
                            hasAward = false;
                            if (ra14.size() == 4) {
                                r14.setVisible(true);
                                r14.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r14);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra24.add(hl24);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }

                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (hl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc26.setVisible(true);
                            hl25.setVisible(true);
                            sc26.setFill(Color.web("#307986"));
                            hl25.setFill(Color.web("#d1e76f"));
                            ra15.add(hl25);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra25.add(hl25);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (vl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc35.setVisible(true);
                            vl25.setVisible(true);
                            sc35.setFill(Color.web("#307986"));
                            vl25.setFill(Color.web("#d1e76f"));
                            ra24.add(vl25);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra25.add(vl25);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 55 && y < 91) {
                    if (x1 == sc16.getCenterX() && y1 == sc16.getCenterY()) {
                        if (vl16.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc16.setVisible(true);
                            vl16.setVisible(true);
                            sc16.setFill(Color.web("#307986"));
                            vl16.setFill(Color.web("#d1e76f"));
                            ra15.add(vl16);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra16.add(vl16);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (hl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc25.setVisible(true);
                            hl25.setVisible(true);
                            sc25.setFill(Color.web("#307986"));
                            hl25.setFill(Color.web("#d1e76f"));
                            ra15.add(hl25);
                            hasAward = false;
                            if (ra15.size() == 4) {
                                r15.setVisible(true);
                                r15.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r15);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra25.add(hl25);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (hl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc27.setVisible(true);
                            hl26.setVisible(true);
                            sc27.setFill(Color.web("#307986"));
                            hl26.setFill(Color.web("#d1e76f"));
                            ra16.add(hl26);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra26.add(hl26);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (vl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc36.setVisible(true);
                            vl26.setVisible(true);
                            sc36.setFill(Color.web("#307986"));
                            vl26.setFill(Color.web("#d1e76f"));
                            ra25.add(vl26);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra26.add(vl26);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 55 && y < 91) {
                    if (x1 == sc17.getCenterX() && y1 == sc17.getCenterY()) {
                        if (vl17.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc17.setVisible(true);
                            vl17.setVisible(true);
                            sc17.setFill(Color.web("#307986"));
                            vl17.setFill(Color.web("#d1e76f"));
                            ra16.add(vl17);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra17.add(vl17);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (hl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc26.setVisible(true);
                            hl26.setVisible(true);
                            sc26.setFill(Color.web("#307986"));
                            hl26.setFill(Color.web("#d1e76f"));
                            ra16.add(hl26);
                            hasAward = false;
                            if (ra16.size() == 4) {
                                r16.setVisible(true);
                                r16.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r16);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra26.add(hl26);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (hl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc28.setVisible(true);
                            hl27.setVisible(true);
                            sc28.setFill(Color.web("#307986"));
                            hl27.setFill(Color.web("#d1e76f"));
                            ra17.add(hl27);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra27.add(hl27);
                            hasAward = false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (vl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc37.setVisible(true);
                            vl27.setVisible(true);
                            sc37.setFill(Color.web("#307986"));
                            vl27.setFill(Color.web("#d1e76f"));
                            ra26.add(vl27);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra27.add(vl27);
                            hasAward = false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    if (x1 == sc18.getCenterX() && y1 == sc18.getCenterY()) {
                        if (vl18.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc38.setVisible(true);
                            vl18.setVisible(true);
                            sc38.setFill(Color.web("#307986"));
                            vl18.setFill(Color.web("#d1e76f"));
                            ra17.add(vl18);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc27.getCenterX() && y1 == sc27.getCenterY()) {
                        if (hl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc27.setVisible(true);
                            hl27.setVisible(true);
                            sc27.setFill(Color.web("#307986"));
                            hl27.setFill(Color.web("#d1e76f"));
                            ra17.add(hl27);
                            hasAward = false;
                            if (ra17.size() == 4) {
                                r17.setVisible(true);
                                r17.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r17);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra27.add(hl27);
                            hasAward = false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (vl27.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc38.setVisible(true);
                            vl27.setVisible(true);
                            sc38.setFill(Color.web("#307986"));
                            vl27.setFill(Color.web("#d1e76f"));
                            ra27.add(vl27);
                            hasAward = false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    if (x1 == sc21.getCenterX() && y1 == sc21.getCenterY()) {
                        if (vl21.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc21.setVisible(true);
                            vl21.setVisible(true);
                            sc21.setFill(Color.web("#307986"));
                            vl21.setFill(Color.web("#d1e76f"));
                            ra21.add(vl21);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (hl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc32.setVisible(true);
                            hl31.setVisible(true);
                            sc32.setFill(Color.web("#307986"));
                            hl31.setFill(Color.web("#d1e76f"));
                            ra21.add(hl31);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra31.add(hl31);
                            hasAward = false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (vl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc41.setVisible(true);
                            vl31.setVisible(true);
                            sc41.setFill(Color.web("#307986"));
                            vl31.setFill(Color.web("#d1e76f"));
                            ra31.add(vl31);
                            hasAward = false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 105 && y < 141) {
                    if (x1 == sc22.getCenterX() && y1 == sc22.getCenterY()) {
                        if (vl22.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc22.setVisible(true);
                            vl22.setVisible(true);
                            sc22.setFill(Color.web("#307986"));
                            vl22.setFill(Color.web("#d1e76f"));
                            ra21.add(vl22);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra22.add(vl22);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (hl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc31.setVisible(true);
                            hl31.setVisible(true);
                            sc31.setFill(Color.web("#307986"));
                            hl31.setFill(Color.web("#d1e76f"));
                            ra21.add(hl31);
                            hasAward = false;
                            if (ra21.size() == 4) {
                                r21.setVisible(true);
                                r21.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r21);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra31.add(hl31);
                            hasAward = false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (hl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc33.setVisible(true);
                            hl32.setVisible(true);
                            sc33.setFill(Color.web("#307986"));
                            hl32.setFill(Color.web("#d1e76f"));
                            ra22.add(hl32);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra32.add(hl32);
                            hasAward = false;
                            if (ra32.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (vl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc42.setVisible(true);
                            vl32.setVisible(true);
                            sc42.setFill(Color.web("#307986"));
                            vl32.setFill(Color.web("#d1e76f"));
                            ra31.add(vl32);
                            hasAward = false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra32.add(vl32);
                            hasAward = false;
                            if (ra32.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    if (x1 == sc23.getCenterX() && y1 == sc23.getCenterY()) {
                        if (vl23.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc23.setVisible(true);
                            vl23.setVisible(true);
                            sc23.setFill(Color.web("#307986"));
                            vl23.setFill(Color.web("#d1e76f"));
                            ra22.add(vl23);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra23.add(vl23);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc32.getCenterX() && y1 == sc32.getCenterY()) {
                        if (hl32.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc32.setVisible(true);
                            hl32.setVisible(true);
                            sc32.setFill(Color.web("#307986"));
                            hl32.setFill(Color.web("#d1e76f"));
                            ra22.add(hl32);
                            hasAward = false;
                            if (ra22.size() == 4) {
                                r22.setVisible(true);
                                r22.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r22);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra32.add(hl32);
                            hasAward = false;
                            if (ra32.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (hl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc34.setVisible(true);
                            hl33.setVisible(true);
                            sc34.setFill(Color.web("#307986"));
                            hl33.setFill(Color.web("#d1e76f"));
                            ra23.add(hl33);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra33.add(hl33);
                            hasAward = false;
                            if (ra33.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (vl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc43.setVisible(true);
                            vl33.setVisible(true);
                            sc43.setFill(Color.web("#307986"));
                            vl33.setFill(Color.web("#d1e76f"));
                            ra32.add(vl33);
                            hasAward = false;
                            if (ra32.size() == 4) {
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra33.add(vl33);
                            hasAward = false;
                            if (ra33.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    if (x1 == sc24.getCenterX() && y1 == sc24.getCenterY()) {
                        if (vl24.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc24.setVisible(true);
                            vl24.setVisible(true);
                            sc24.setFill(Color.web("#307986"));
                            vl24.setFill(Color.web("#d1e76f"));
                            ra23.add(vl24);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra24.add(vl24);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (hl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc33.setVisible(true);
                            hl33.setVisible(true);
                            sc33.setFill(Color.web("#307986"));
                            hl33.setFill(Color.web("#d1e76f"));
                            ra23.add(hl33);
                            hasAward = false;
                            if (ra23.size() == 4) {
                                r23.setVisible(true);
                                r23.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r23);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra33.add(hl33);
                            hasAward = false;
                            if (ra33.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (hl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc35.setVisible(true);
                            hl34.setVisible(true);
                            sc35.setFill(Color.web("#307986"));
                            hl34.setFill(Color.web("#d1e76f"));
                            ra24.add(hl34);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra34.add(hl34);
                            hasAward = false;
                            if (ra34.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (vl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc44.setVisible(true);
                            vl34.setVisible(true);
                            sc44.setFill(Color.web("#307986"));
                            vl34.setFill(Color.web("#d1e76f"));
                            ra33.add(vl34);
                            hasAward = false;
                            if (ra33.size() == 4) {
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra34.add(vl34);
                            hasAward = false;
                            if (ra34.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    if (x1 == sc25.getCenterX() && y1 == sc25.getCenterY()) {
                        if (vl25.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc25.setVisible(true);
                            vl25.setVisible(true);
                            sc25.setFill(Color.web("#307986"));
                            vl25.setFill(Color.web("#d1e76f"));
                            ra24.add(vl25);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra25.add(vl25);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (hl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc34.setVisible(true);
                            hl34.setVisible(true);
                            sc34.setFill(Color.web("#307986"));
                            hl34.setFill(Color.web("#d1e76f"));
                            ra24.add(hl34);
                            hasAward = false;
                            if (ra24.size() == 4) {
                                r24.setVisible(true);
                                r24.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r24);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra34.add(hl34);
                            hasAward = false;
                            if (ra34.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (hl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc36.setVisible(true);
                            hl35.setVisible(true);
                            sc36.setFill(Color.web("#307986"));
                            hl35.setFill(Color.web("#d1e76f"));
                            ra25.add(hl35);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra35.add(hl35);
                            hasAward = false;
                            if (ra35.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (vl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc45.setVisible(true);
                            vl35.setVisible(true);
                            sc45.setFill(Color.web("#307986"));
                            vl35.setFill(Color.web("#d1e76f"));
                            ra34.add(vl35);
                            hasAward = false;
                            if (ra34.size() == 4) {
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra35.add(vl35);
                            hasAward = false;
                            if (ra35.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    if (x1 == sc26.getCenterX() && y1 == sc26.getCenterY()) {
                        if (vl26.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc26.setVisible(true);
                            vl26.setVisible(true);
                            sc26.setFill(Color.web("#307986"));
                            vl26.setFill(Color.web("#d1e76f"));
                            ra25.add(vl26);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra26.add(vl26);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }

                        }
                    } else if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (hl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc35.setVisible(true);
                            hl35.setVisible(true);
                            sc35.setFill(Color.web("#307986"));
                            hl35.setFill(Color.web("#d1e76f"));
                            ra35.add(hl35);
                            hasAward = false;
                            if (ra35.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra25.add(hl35);
                            hasAward = false;
                            if (ra25.size() == 4) {
                                r25.setVisible(true);
                                r25.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r25);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (hl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc37.setVisible(true);
                            hl36.setVisible(true);
                            sc37.setFill(Color.web("#307986"));
                            hl36.setFill(Color.web("#d1e76f"));
                            ra26.add(hl36);
                            hasAward = false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra36.add(hl36);
                            hasAward = false;
                            if (ra36.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (vl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc46.setVisible(true);
                            vl36.setVisible(true);
                            sc46.setFill(Color.web("#307986"));
                            vl36.setFill(Color.web("#d1e76f"));
                            ra35.add(vl36);
                            hasAward = false;
                            if (ra35.size() == 4) {
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
                            ra36.add(vl36);
                            hasAward = false;
                            if (ra36.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward = true;
                            }
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
                            sc27.setFill(Color.web("#307986"));
                            vl27.setFill(Color.web("#d1e76f"));
                            ra26.add(vl27);
                            hasAward=false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra27.add(vl27);
                            hasAward=false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (hl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc36.setVisible(true);
                            hl36.setVisible(true);
                            sc36.setFill(Color.web("#307986"));
                            hl36.setFill(Color.web("#d1e76f"));
                            ra26.add(hl36);
                            hasAward=false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra36.add(hl36);
                            hasAward=false;
                            if (ra36.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (hl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc38.setVisible(true);
                            hl37.setVisible(true);
                            sc38.setFill(Color.web("#307986"));
                            hl37.setFill(Color.web("#d1e76f"));
                            ra27.add(hl37);
                            hasAward=false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra37.add(hl37);
                            hasAward=false;
                            if (ra37.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (vl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc47.setVisible(true);
                            vl37.setVisible(true);
                            sc47.setFill(Color.web("#307986"));
                            vl37.setFill(Color.web("#d1e76f"));
                            ra26.add(vl37);
                            hasAward=false;
                            if (ra26.size() == 4) {
                                r26.setVisible(true);
                                r26.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r26);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra36.add(vl37);
                            hasAward=false;
                            if (ra36.size() == 4) {
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    if (x1 == sc28.getCenterX() && y1 == sc28.getCenterY()) {
                        if (vl28.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc28.setVisible(true);
                            vl28.setVisible(true);
                            sc28.setFill(Color.web("#307986"));
                            vl28.setFill(Color.web("#d1e76f"));
                            ra27.add(vl28);
                            hasAward=false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (hl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc37.setVisible(true);
                            hl37.setVisible(true);
                            sc37.setFill(Color.web("#307986"));
                            hl37.setFill(Color.web("#d1e76f"));
                            ra27.add(hl37);
                            hasAward=false;
                            if (ra27.size() == 4) {
                                r27.setVisible(true);
                                r27.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r27);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra37.add(hl37);
                            hasAward=false;
                            if (ra37.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (vl38.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc48.setVisible(true);
                            vl38.setVisible(true);
                            sc48.setFill(Color.web("#307986"));
                            vl38.setFill(Color.web("#d1e76f"));
                            ra37.add(vl38);
                            hasAward=false;
                            if (ra37.size() == 4) {
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    if (x1 == sc31.getCenterX() && y1 == sc31.getCenterY()) {
                        if (vl31.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc31.setVisible(true);
                            vl31.setVisible(true);
                            sc31.setFill(Color.web("#307986"));
                            vl31.setFill(Color.web("#d1e76f"));
                            ra31.add(vl31);
                            hasAward=false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (hl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc42.setVisible(true);
                            hl41.setVisible(true);
                            sc42.setFill(Color.web("#307986"));
                            hl41.setFill(Color.web("#d1e76f"));
                            ra31.add(hl41);
                            hasAward=false;
                            if (ra31.size() == 4) {
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra41.add(hl41);
                            hasAward=false;
                            if (ra41.size() == 4) {
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                        if (vl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc51.setVisible(true);
                            vl41.setVisible(true);
                            sc51.setFill(Color.web("#307986"));
                            vl41.setFill(Color.web("#d1e76f"));
                            ra41.add(vl41);
                            hasAward=false;
                            if (ra41.size() == 4) {
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
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
                            sc32.setFill(Color.web("#307986"));
                            vl32.setFill(Color.web("#d1e76f"));
                            ra31.add(vl32);
                            hasAward=false;
                            if (ra31.size()==4){
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra32.add(vl32);
                            hasAward=false;
                            if (ra32.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (hl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc41.setVisible(true);
                            hl41.setVisible(true);
                            sc41.setFill(Color.web("#307986"));
                            hl41.setFill(Color.web("#d1e76f"));
                            ra31.add(hl41);
                            hasAward=false;
                            if (ra31.size()==4){
                                r31.setVisible(true);
                                r31.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r31);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra41.add(hl41);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (hl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc43.setVisible(true);
                            hl42.setVisible(true);
                            sc43.setFill(Color.web("#307986"));
                            hl42.setFill(Color.web("#d1e76f"));
                            ra32.add(hl42);
                            hasAward=false;
                            if (ra32.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra42.add(hl42);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (vl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc52.setVisible(true);
                            vl42.setVisible(true);
                            sc52.setFill(Color.web("#307986"));
                            vl42.setFill(Color.web("#d1e76f"));
                            ra41.add(vl42);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra42.add(vl42);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    if (x1 == sc33.getCenterX() && y1 == sc33.getCenterY()) {
                        if (vl33.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc33.setVisible(true);
                            vl33.setVisible(true);
                            sc33.setFill(Color.web("#307986"));
                            vl33.setFill(Color.web("#d1e76f"));
                            ra32.add(vl33);
                            hasAward=false;
                            if (ra32.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra33.add(vl33);
                            hasAward=false;
                            if (ra33.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (hl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc42.setVisible(true);
                            hl42.setVisible(true);
                            sc42.setFill(Color.web("#307986"));
                            hl42.setFill(Color.web("#d1e76f"));
                            ra42.add(hl42);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra32.add(hl42);
                            hasAward=false;
                            if (ra32.size()==4){
                                r32.setVisible(true);
                                r32.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r32);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (hl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc44.setVisible(true);
                            hl43.setVisible(true);
                            sc44.setFill(Color.web("#307986"));
                            hl43.setFill(Color.web("#d1e76f"));
                            ra43.add(hl43);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra33.add(hl43);
                            hasAward=false;
                            if (ra33.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (vl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc53.setVisible(true);
                            vl43.setVisible(true);
                            sc53.setFill(Color.web("#307986"));
                            vl43.setFill(Color.web("#d1e76f"));
                            ra42.add(vl43);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra43.add(vl43);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    if (x1 == sc34.getCenterX() && y1 == sc34.getCenterY()) {
                        if (vl34.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc34.setVisible(true);
                            vl34.setVisible(true);
                            sc34.setFill(Color.web("#307986"));
                            vl34.setFill(Color.web("#d1e76f"));
                            ra33.add(vl34);
                            hasAward=false;
                            if (ra33.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra34.add(vl34);
                            hasAward=false;
                            if (ra34.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (hl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc43.setVisible(true);
                            hl43.setVisible(true);
                            sc43.setFill(Color.web("#307986"));
                            hl43.setFill(Color.web("#d1e76f"));
                            ra33.add(hl43);
                            hasAward=false;
                            if (ra33.size()==4){
                                r33.setVisible(true);
                                r33.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r33);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra43.add(hl43);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (hl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc45.setVisible(true);
                            hl44.setVisible(true);
                            sc45.setFill(Color.web("#307986"));
                            hl44.setFill(Color.web("#d1e76f"));
                            ra44.add(hl44);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra34.add(hl44);
                            hasAward=false;
                            if (ra34.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (vl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc54.setVisible(true);
                            vl44.setVisible(true);
                            sc54.setFill(Color.web("#307986"));
                            vl44.setFill(Color.web("#d1e76f"));
                            ra43.add(vl44);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra44.add(vl44);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    if (x1 == sc35.getCenterX() && y1 == sc35.getCenterY()) {
                        if (vl35.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc35.setVisible(true);
                            vl35.setVisible(true);
                            sc35.setFill(Color.web("#307986"));
                            vl35.setFill(Color.web("#d1e76f"));
                            ra34.add(vl35);
                            hasAward=false;
                            if (ra34.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra35.add(vl35);
                            hasAward=false;
                            if (ra35.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (hl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc44.setVisible(true);
                            hl44.setVisible(true);
                            sc44.setFill(Color.web("#307986"));
                            hl44.setFill(Color.web("#d1e76f"));
                            ra44.add(hl44);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra34.add(hl44);
                            hasAward=false;
                            if (ra34.size()==4){
                                r34.setVisible(true);
                                r34.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r34);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (hl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc46.setVisible(true);
                            hl45.setVisible(true);
                            sc46.setFill(Color.web("#307986"));
                            hl45.setFill(Color.web("#d1e76f"));
                            ra41.add(hl45);
                            hasAward=false;
                            if (ra35.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra45.add(hl45);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (vl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc55.setVisible(true);
                            vl45.setVisible(true);
                            sc55.setFill(Color.web("#307986"));
                            vl45.setFill(Color.web("#d1e76f"));
                            ra44.add(vl45);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra45.add(vl45);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    if (x1 == sc36.getCenterX() && y1 == sc36.getCenterY()) {
                        if (vl36.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc36.setVisible(true);
                            vl36.setVisible(true);
                            sc36.setFill(Color.web("#307986"));
                            vl36.setFill(Color.web("#d1e76f"));
                            ra35.add(vl36);
                            hasAward=false;
                            if (ra35.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra36.add(vl36);
                            hasAward=false;
                            if (ra36.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (hl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc45.setVisible(true);
                            hl45.setVisible(true);
                            sc45.setFill(Color.web("#307986"));
                            hl45.setFill(Color.web("#d1e76f"));
                            ra35.add(hl45);
                            hasAward=false;
                            if (ra35.size()==4){
                                r35.setVisible(true);
                                r35.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r35);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra45.add(hl45);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (hl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc47.setVisible(true);
                            hl46.setVisible(true);
                            sc47.setFill(Color.web("#307986"));
                            hl46.setFill(Color.web("#d1e76f"));
                            ra36.add(hl46);
                            hasAward=false;
                            if (ra36.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra46.add(hl46);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (vl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc56.setVisible(true);
                            vl46.setVisible(true);
                            sc56.setFill(Color.web("#307986"));
                            vl46.setFill(Color.web("#d1e76f"));
                            ra45.add(vl46);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra46.add(vl46);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    if (x1 == sc37.getCenterX() && y1 == sc37.getCenterY()) {
                        if (vl37.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc37.setVisible(true);
                            vl37.setVisible(true);
                            sc37.setFill(Color.web("#307986"));
                            vl37.setFill(Color.web("#d1e76f"));
                            ra36.add(vl37);
                            hasAward=false;
                            if (ra36.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra37.add(vl37);
                            hasAward=false;
                            if (ra37.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (hl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc46.setVisible(true);
                            hl46.setVisible(true);
                            sc46.setFill(Color.web("#307986"));
                            hl46.setFill(Color.web("#d1e76f"));
                            ra36.add(hl46);
                            hasAward=false;
                            if (ra36.size()==4){
                                r36.setVisible(true);
                                r36.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r36);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra46.add(hl46);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (hl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc48.setVisible(true);
                            hl47.setVisible(true);
                            sc48.setFill(Color.web("#307986"));
                            hl47.setFill(Color.web("#d1e76f"));
                            ra37.add(hl47);
                            hasAward=false;
                            if (ra37.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra47.add(hl47);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (vl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc57.setVisible(true);
                            vl47.setVisible(true);
                            sc57.setFill(Color.web("#307986"));
                            vl47.setFill(Color.web("#d1e76f"));
                            ra46.add(vl47);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra47.add(vl47);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    if (x1 == sc38.getCenterX() && y1 == sc38.getCenterY()) {
                        if (vl38.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc38.setVisible(true);
                            vl38.setVisible(true);
                            sc38.setFill(Color.web("#307986"));
                            vl38.setFill(Color.web("#d1e76f"));
                            ra37.add(vl38);
                            hasAward=false;
                            if (ra37.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (hl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc47.setVisible(true);
                            hl47.setVisible(true);
                            sc47.setFill(Color.web("#307986"));
                            hl47.setFill(Color.web("#d1e76f"));
                            ra37.add(hl47);
                            hasAward=false;
                            if (ra37.size()==4){
                                r37.setVisible(true);
                                r37.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r37);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra47.add(hl47);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (vl48.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc58.setVisible(true);
                            vl48.setVisible(true);
                            sc58.setFill(Color.web("#307986"));
                            vl48.setFill(Color.web("#d1e76f"));
                            ra47.add(vl48);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    if (x1 == sc41.getCenterX() && y1 == sc41.getCenterY()) {
                        if (vl41.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc41.setVisible(true);
                            vl41.setVisible(true);
                            sc41.setFill(Color.web("#307986"));
                            vl41.setFill(Color.web("#d1e76f"));
                            ra41.add(vl41);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (vl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc61.setVisible(true);
                            vl51.setVisible(true);
                            sc61.setFill(Color.web("#307986"));
                            vl51.setFill(Color.web("#d1e76f"));
                            ra51.add(vl51);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (hl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc52.setVisible(true);
                            hl51.setVisible(true);
                            sc52.setFill(Color.web("#307986"));
                            hl51.setFill(Color.web("#d1e76f"));
                            ra41.add(hl51);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra51.add(hl51);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    if (x1 == sc42.getCenterX() && y1 == sc42.getCenterY()) {
                        if (vl42.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc42.setVisible(true);
                            vl42.setVisible(true);
                            sc42.setFill(Color.web("#307986"));
                            vl42.setFill(Color.web("#d1e76f"));
                            ra41.add(vl42);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra42.add(vl42);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc51.getCenterX() && y1 == sc51.getCenterY()) {
                        if (hl51.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc51.setVisible(true);
                            hl51.setVisible(true);
                            sc51.setFill(Color.web("#307986"));
                            hl51.setFill(Color.web("#d1e76f"));
                            ra51.add(hl51);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra41.add(hl51);
                            hasAward=false;
                            if (ra41.size()==4){
                                r41.setVisible(true);
                                r41.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r41);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (hl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc53.setVisible(true);
                            hl52.setVisible(true);
                            sc53.setFill(Color.web("#307986"));
                            hl52.setFill(Color.web("#d1e76f"));
                            ra52.add(hl52);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra42.add(hl52);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (vl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc62.setVisible(true);
                            vl52.setVisible(true);
                            sc62.setFill(Color.web("#307986"));
                            vl52.setFill(Color.web("#d1e76f"));
                            ra51.add(vl52);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra52.add(vl52);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    if (x1 == sc43.getCenterX() && y1 == sc43.getCenterY()) {
                        if (vl43.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc43.setVisible(true);
                            vl43.setVisible(true);
                            sc43.setFill(Color.web("#307986"));
                            vl43.setFill(Color.web("#d1e76f"));
                            ra42.add(vl43);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra43.add(vl43);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (hl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc52.setVisible(true);
                            hl52.setVisible(true);
                            sc52.setFill(Color.web("#307986"));
                            hl52.setFill(Color.web("#d1e76f"));
                            ra52.add(hl52);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra42.add(hl52);
                            hasAward=false;
                            if (ra42.size()==4){
                                r42.setVisible(true);
                                r42.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r42);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (hl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc54.setVisible(true);
                            hl53.setVisible(true);
                            sc54.setFill(Color.web("#307986"));
                            hl53.setFill(Color.web("#d1e76f"));
                            ra43.add(hl53);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra53.add(hl53);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (vl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc63.setVisible(true);
                            vl53.setVisible(true);
                            sc63.setFill(Color.web("#307986"));
                            vl53.setFill(Color.web("#d1e76f"));
                            ra52.add(vl53);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra53.add(vl53);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    if (x1 == sc44.getCenterX() && y1 == sc44.getCenterY()) {
                        if (vl44.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc44.setVisible(true);
                            vl44.setVisible(true);
                            sc44.setFill(Color.web("#307986"));
                            vl44.setFill(Color.web("#d1e76f"));
                            ra43.add(vl44);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra44.add(vl44);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (hl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc53.setVisible(true);
                            hl53.setVisible(true);
                            sc53.setFill(Color.web("#307986"));
                            hl53.setFill(Color.web("#d1e76f"));
                            ra43.add(hl53);
                            hasAward=false;
                            if (ra43.size()==4){
                                r43.setVisible(true);
                                r43.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r43);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra53.add(hl53);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (hl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc55.setVisible(true);
                            hl54.setVisible(true);
                            sc55.setFill(Color.web("#307986"));
                            hl54.setFill(Color.web("#d1e76f"));
                            ra44.add(hl54);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra54.add(hl54);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (vl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc64.setVisible(true);
                            vl54.setVisible(true);
                            sc64.setFill(Color.web("#307986"));
                            vl54.setFill(Color.web("#d1e76f"));
                            ra53.add(vl54);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra54.add(vl54);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    if (x1 == sc45.getCenterX() && y1 == sc45.getCenterY()) {
                        if (vl45.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc45.setVisible(true);
                            vl45.setVisible(true);
                            sc45.setFill(Color.web("#307986"));
                            vl45.setFill(Color.web("#d1e76f"));
                            ra44.add(vl45);
                            hasAward=false;
                            if (ra44.size()==4){
                                r44.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra45.add(vl45);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (hl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc54.setVisible(true);
                            hl54.setVisible(true);
                            sc54.setFill(Color.web("#307986"));
                            hl54.setFill(Color.web("#d1e76f"));
                            ra44.add(hl54);
                            hasAward=false;
                            if (ra44.size()==4){
                                r54.setVisible(true);
                                r44.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r44);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra54.add(hl54);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (hl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc56.setVisible(true);
                            hl55.setVisible(true);
                            sc56.setFill(Color.web("#307986"));
                            hl55.setFill(Color.web("#d1e76f"));
                            ra45.add(hl55);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra55.add(hl55);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (vl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc65.setVisible(true);
                            vl55.setVisible(true);
                            sc65.setFill(Color.web("#307986"));
                            vl55.setFill(Color.web("#d1e76f"));
                            ra54.add(vl55);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra55.add(vl55);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    }
                } else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    if (x1 == sc46.getCenterX() && y1 == sc46.getCenterY()) {
                        if (vl46.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc46.setVisible(true);
                            vl46.setVisible(true);
                            sc46.setFill(Color.web("#307986"));
                            vl46.setFill(Color.web("#d1e76f"));
                            ra45.add(vl46);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra46.add(vl46);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (hl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc55.setVisible(true);
                            hl55.setVisible(true);
                            sc55.setFill(Color.web("#307986"));
                            hl55.setFill(Color.web("#d1e76f"));
                            ra45.add(hl55);
                            hasAward=false;
                            if (ra45.size()==4){
                                r45.setVisible(true);
                                r45.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r45);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra55.add(hl55);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (hl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc57.setVisible(true);
                            hl56.setVisible(true);
                            sc57.setFill(Color.web("#307986"));
                            hl56.setFill(Color.web("#d1e76f"));
                            ra46.add(hl56);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra56.add(hl56);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (vl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc66.setVisible(true);
                            vl56.setVisible(true);
                            sc66.setFill(Color.web("#307986"));
                            vl56.setFill(Color.web("#d1e76f"));
                            ra55.add(vl56);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra56.add(vl56);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    if (x1 == sc47.getCenterX() && y1 == sc47.getCenterY()) {
                        if (vl47.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc47.setVisible(true);
                            vl47.setVisible(true);
                            sc47.setFill(Color.web("#307986"));
                            vl47.setFill(Color.web("#d1e76f"));
                            ra46.add(vl47);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra47.add(vl47);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (hl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc56.setVisible(true);
                            hl56.setVisible(true);
                            sc56.setFill(Color.web("#307986"));
                            hl56.setFill(Color.web("#d1e76f"));
                            ra46.add(hl56);
                            hasAward=false;
                            if (ra46.size()==4){
                                r46.setVisible(true);
                                r46.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r46);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra56.add(hl56);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (hl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc58.setVisible(true);
                            hl57.setVisible(true);
                            sc58.setFill(Color.web("#307986"));
                            hl57.setFill(Color.web("#d1e76f"));
                            ra47.add(hl57);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra57.add(hl57);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (vl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc67.setVisible(true);
                            vl57.setVisible(true);
                            sc67.setFill(Color.web("#307986"));
                            vl57.setFill(Color.web("#d1e76f"));
                            ra56.add(vl57);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra57.add(vl57);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    if (x1 == sc48.getCenterX() && y1 == sc48.getCenterY()) {
                        if (vl48.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc48.setVisible(true);
                            vl48.setVisible(true);
                            sc48.setFill(Color.web("#307986"));
                            vl48.setFill(Color.web("#d1e76f"));
                            ra47.add(vl48);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (hl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc57.setVisible(true);
                            hl57.setVisible(true);
                            sc57.setFill(Color.web("#307986"));
                            hl57.setFill(Color.web("#d1e76f"));
                            ra47.add(hl57);
                            hasAward=false;
                            if (ra47.size()==4){
                                r47.setVisible(true);
                                r47.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r47);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra57.add(hl57);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                    else if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (vl58.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc68.setVisible(true);
                            vl58.setVisible(true);
                            sc68.setFill(Color.web("#307986"));
                            vl58.setFill(Color.web("#d1e76f"));
                            ra57.add(vl58);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
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
                            sc51.setFill(Color.web("#307986"));
                            vl51.setFill(Color.web("#d1e76f"));
                            ra51.add(vl51);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (hl61.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc62.setVisible(true);
                            hl61.setVisible(true);
                            sc62.setFill(Color.web("#307986"));
                            hl61.setFill(Color.web("#d1e76f"));
                            ra51.add(hl61);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra61.add(hl61);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                        if (vl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc71.setVisible(true);
                            vl71.setVisible(true);
                            sc71.setFill(Color.web("#307986"));
                            vl71.setFill(Color.web("#d1e76f"));
                            ra61.add(vl71);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    if (x1 == sc52.getCenterX() && y1 == sc52.getCenterY()) {
                        if (vl52.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc52.setVisible(true);
                            vl52.setVisible(true);
                            sc52.setFill(Color.web("#307986"));
                            vl52.setFill(Color.web("#d1e76f"));
                            ra51.add(vl52);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra52.add(vl52);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (hl61.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc61.setVisible(true);
                            hl61.setVisible(true);
                            sc61.setFill(Color.web("#307986"));
                            hl61.setFill(Color.web("#d1e76f"));
                            ra51.add(hl61);
                            hasAward=false;
                            if (ra51.size()==4){
                                r51.setVisible(true);
                                r51.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r51);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra61.add(hl61);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (hl62.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc63.setVisible(true);
                            hl62.setVisible(true);
                            sc63.setFill(Color.web("#307986"));
                            hl62.setFill(Color.web("#d1e76f"));
                            ra52.add(hl62);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra62.add(hl62);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (vl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc72.setVisible(true);
                            vl72.setVisible(true);
                            sc72.setFill(Color.web("#307986"));
                            vl72.setFill(Color.web("#d1e76f"));
                            ra61.add(vl72);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra62.add(vl72);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    if (x1 == sc53.getCenterX() && y1 == sc53.getCenterY()) {
                        if (vl53.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc53.setVisible(true);
                            vl53.setVisible(true);
                            sc53.setFill(Color.web("#307986"));
                            vl53.setFill(Color.web("#d1e76f"));
                            ra52.add(vl53);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra53.add(vl53);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (hl62.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc62.setVisible(true);
                            hl62.setVisible(true);
                            sc62.setFill(Color.web("#307986"));
                            hl62.setFill(Color.web("#d1e76f"));
                            ra52.add(hl62);
                            hasAward=false;
                            if (ra52.size()==4){
                                r52.setVisible(true);
                                r52.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r52);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra62.add(hl62);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (hl63.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc64.setVisible(true);
                            hl63.setVisible(true);
                            sc64.setFill(Color.web("#307986"));
                            hl63.setFill(Color.web("#d1e76f"));
                            ra53.add(hl63);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra53.add(hl63);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (vl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc73.setVisible(true);
                            vl73.setVisible(true);
                            sc73.setFill(Color.web("#307986"));
                            vl73.setFill(Color.web("#d1e76f"));
                            ra62.add(vl73);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra63.add(vl73);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 161 && x < 197 && y > 256 && y < 292) {
                    if (x1 == sc54.getCenterX() && y1 == sc54.getCenterY()) {
                        if (vl54.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc54.setVisible(true);
                            vl54.setVisible(true);
                            sc54.setFill(Color.web("#307986"));
                            vl54.setFill(Color.web("#d1e76f"));
                            ra53.add(vl54);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra54.add(vl54);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (hl63.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc63.setVisible(true);
                            hl63.setVisible(true);
                            sc63.setFill(Color.web("#307986"));
                            hl63.setFill(Color.web("#d1e76f"));
                            ra53.add(hl63);
                            hasAward=false;
                            if (ra53.size()==4){
                                r53.setVisible(true);
                                r53.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r53);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra63.add(hl63);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (hl64.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc65.setVisible(true);
                            hl64.setVisible(true);
                            sc65.setFill(Color.web("#307986"));
                            hl64.setFill(Color.web("#d1e76f"));
                            ra54.add(hl64);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra64.add(hl64);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (vl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc74.setVisible(true);
                            vl74.setVisible(true);
                            sc74.setFill(Color.web("#307986"));
                            vl74.setFill(Color.web("#d1e76f"));
                            ra63.add(vl74);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra64.add(vl74);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    if (x1 == sc55.getCenterX() && y1 == sc55.getCenterY()) {
                        if (vl55.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc55.setVisible(true);
                            vl55.setVisible(true);
                            sc55.setFill(Color.web("#307986"));
                            vl55.setFill(Color.web("#d1e76f"));
                            ra54.add(vl55);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra55.add(vl55);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (hl64.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc64.setVisible(true);
                            hl64.setVisible(true);
                            sc64.setFill(Color.web("#307986"));
                            hl64.setFill(Color.web("#d1e76f"));
                            ra54.add(hl64);
                            hasAward=false;
                            if (ra54.size()==4){
                                r54.setVisible(true);
                                r54.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r54);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra64.add(hl64);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }

                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (hl65.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc66.setVisible(true);
                            hl65.setVisible(true);
                            sc66.setFill(Color.web("#307986"));
                            hl65.setFill(Color.web("#d1e76f"));
                            ra55.add(hl65);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra65.add(hl65);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (vl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc75.setVisible(true);
                            vl75.setVisible(true);
                            sc75.setFill(Color.web("#307986"));
                            vl75.setFill(Color.web("#d1e76f"));
                            ra64.add(vl75);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra65.add(vl75);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    if (x1 == sc56.getCenterX() && y1 == sc56.getCenterY()) {
                        if (vl56.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc56.setVisible(true);
                            vl56.setVisible(true);
                            sc56.setFill(Color.web("#307986"));
                            vl56.setFill(Color.web("#d1e76f"));
                            ra55.add(vl56);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra56.add(vl56);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (hl65.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc65.setVisible(true);
                            hl65.setVisible(true);
                            sc65.setFill(Color.web("#307986"));
                            hl65.setFill(Color.web("#d1e76f"));
                            ra55.add(hl65);
                            hasAward=false;
                            if (ra55.size()==4){
                                r55.setVisible(true);
                                r55.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r55);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra65.add(hl65);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (hl66.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc67.setVisible(true);
                            hl66.setVisible(true);
                            sc67.setFill(Color.web("#307986"));
                            hl66.setFill(Color.web("#d1e76f"));
                            ra56.add(hl66);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra66.add(hl66);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (vl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc76.setVisible(true);
                            vl76.setVisible(true);
                            sc76.setFill(Color.web("#307986"));
                            vl76.setFill(Color.web("#d1e76f"));
                            ra65.add(vl76);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra66.add(vl76);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    if (x1 == sc57.getCenterX() && y1 == sc57.getCenterY()) {
                        if (vl57.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc57.setVisible(true);
                            vl57.setVisible(true);
                            sc57.setFill(Color.web("#307986"));
                            vl57.setFill(Color.web("#d1e76f"));
                            ra56.add(vl57);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra57.add(vl57);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (hl66.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc66.setVisible(true);
                            hl66.setVisible(true);
                            sc66.setFill(Color.web("#307986"));
                            hl66.setFill(Color.web("#d1e76f"));
                            ra56.add(hl66);
                            hasAward=false;
                            if (ra56.size()==4){
                                r56.setVisible(true);
                                r56.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r56);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra66.add(hl66);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (hl67.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc68.setVisible(true);
                            hl67.setVisible(true);
                            sc68.setFill(Color.web("#307986"));
                            hl67.setFill(Color.web("#d1e76f"));
                            ra57.add(hl67);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra67.add(hl67);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (vl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc77.setVisible(true);
                            vl77.setVisible(true);
                            sc77.setFill(Color.web("#307986"));
                            vl77.setFill(Color.web("#d1e76f"));
                            ra66.add(vl77);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra67.add(vl77);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    if (x1 == sc58.getCenterX() && y1 == sc58.getCenterY()) {
                        if (vl58.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc58.setVisible(true);
                            vl58.setVisible(true);
                            sc58.setFill(Color.web("#307986"));
                            vl58.setFill(Color.web("#d1e76f"));
                            ra57.add(vl58);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (hl67.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc67.setVisible(true);
                            hl67.setVisible(true);
                            sc67.setFill(Color.web("#307986"));
                            hl67.setFill(Color.web("#d1e76f"));
                            ra57.add(hl67);
                            hasAward=false;
                            if (ra57.size()==4){
                                r57.setVisible(true);
                                r57.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r57);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra67.add(hl67);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                        if (vl78.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc78.setVisible(true);
                            vl78.setVisible(true);
                            sc78.setFill(Color.web("#307986"));
                            vl78.setFill(Color.web("#d1e76f"));
                            ra67.add(vl78);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    if (x1 == sc61.getCenterX() && y1 == sc61.getCenterY()) {
                        if (vl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc61.setVisible(true);
                            vl71.setVisible(true);
                            sc61.setFill(Color.web("#307986"));
                            vl71.setFill(Color.web("#d1e76f"));
                            ra61.add(vl71);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc81.getCenterX() && y1 == sc81.getCenterY()) {
                        if (vl81.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc81.setVisible(true);
                            vl81.setVisible(true);
                            sc81.setFill(Color.web("#307986"));
                            vl81.setFill(Color.web("#d1e76f"));
                            ra71.add(vl81);
                            hasAward=false;
                            if (ra71.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r71);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (hl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc72.setVisible(true);
                            hl71.setVisible(true);
                            sc72.setFill(Color.web("#307986"));
                            hl71.setFill(Color.web("#d1e76f"));
                            ra61.add(hl71);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra71.add(hl71);
                            hasAward=false;
                            if (ra71.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r71);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    if (x1 == sc62.getCenterX() && y1 == sc62.getCenterY()) {
                        if (vl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc62.setVisible(true);
                            vl72.setVisible(true);
                            sc62.setFill(Color.web("#307986"));
                            vl72.setFill(Color.web("#d1e76f"));
                            ra61.add(vl72);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra62.add(vl72);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc71.getCenterX() && y1 == sc71.getCenterY()) {
                        if (hl71.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc71.setVisible(true);
                            hl71.setVisible(true);
                            sc71.setFill(Color.web("#307986"));
                            hl71.setFill(Color.web("#d1e76f"));
                            ra61.add(hl71);
                            hasAward=false;
                            if (ra61.size()==4){
                                r61.setVisible(true);
                                r61.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r61);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra71.add(hl71);
                            hasAward=false;
                            if (ra71.size()==4) {
                                r71.setVisible(true);
                                r71.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r71);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (hl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc73.setVisible(true);
                            hl72.setVisible(true);
                            sc73.setFill(Color.web("#307986"));
                            hl72.setFill(Color.web("#d1e76f"));
                            ra62.add(hl72);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra72.add(hl72);
                            hasAward=false;
                            if (ra72.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r72);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc82.getCenterX() && y1 == sc82.getCenterY()) {
                        if (vl82.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc82.setVisible(true);
                            vl82.setVisible(true);
                            sc82.setFill(Color.web("#307986"));
                            vl82.setFill(Color.web("#d1e76f"));
                            ra71.add(vl82);
                            hasAward=false;
                            if (ra71.size()==4){
                                r71.setVisible(true);
                                r71.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r71);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra72.add(vl82);
                            hasAward=false;
                            if (ra72.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r72);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    if (x1 == sc63.getCenterX() && y1 == sc63.getCenterY()) {
                        if (vl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc63.setVisible(true);
                            vl73.setVisible(true);
                            sc63.setFill(Color.web("#307986"));
                            vl73.setFill(Color.web("#d1e76f"));
                            ra62.add(vl73);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra63.add(vl73);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc72.getCenterX() && y1 == sc72.getCenterY()) {
                        if (hl72.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc72.setVisible(true);
                            hl72.setVisible(true);
                            sc72.setFill(Color.web("#307986"));
                            hl72.setFill(Color.web("#d1e76f"));
                            ra72.add(hl72);
                            hasAward=false;
                            if (ra72.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r72);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra62.add(hl72);
                            hasAward=false;
                            if (ra62.size()==4){
                                r62.setVisible(true);
                                r62.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r62);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (hl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc74.setVisible(true);
                            hl73.setVisible(true);
                            sc74.setFill(Color.web("#307986"));
                            hl73.setFill(Color.web("#d1e76f"));
                            ra73.add(hl73);
                            hasAward=false;
                            if (ra73.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r73);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra63.add(hl73);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc83.getCenterX() && y1 == sc83.getCenterY()) {
                        if (vl83.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc83.setVisible(true);
                            vl83.setVisible(true);
                            sc83.setFill(Color.web("#307986"));
                            vl83.setFill(Color.web("#d1e76f"));
                            ra72.add(vl83);
                            hasAward=false;
                            if (ra72.size()==4){
                                r72.setVisible(true);
                                r72.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r72);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra73.add(vl83);
                            hasAward=false;
                            if (ra73.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r73);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    if (x1 == sc64.getCenterX() && y1 == sc64.getCenterY()) {
                        if (vl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc64.setVisible(true);
                            vl74.setVisible(true);
                            sc64.setFill(Color.web("#307986"));
                            vl74.setFill(Color.web("#d1e76f"));
                            ra63.add(vl74);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra64.add(vl74);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc73.getCenterX() && y1 == sc73.getCenterY()) {
                        if (hl73.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc73.setVisible(true);
                            hl73.setVisible(true);
                            sc73.setFill(Color.web("#307986"));
                            hl73.setFill(Color.web("#d1e76f"));
                            ra63.add(hl73);
                            hasAward=false;
                            if (ra63.size()==4){
                                r63.setVisible(true);
                                r63.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r63);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra73.add(hl73);
                            hasAward=false;
                            if (ra73.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r73);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (hl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc75.setVisible(true);
                            hl74.setVisible(true);
                            sc75.setFill(Color.web("#307986"));
                            hl74.setFill(Color.web("#d1e76f"));
                            ra64.add(hl74);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra74.add(hl74);
                            hasAward=false;
                            if (ra74.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r74);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc84.getCenterX() && y1 == sc84.getCenterY()) {
                        if (vl84.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc84.setVisible(true);
                            vl84.setVisible(true);
                            sc84.setFill(Color.web("#307986"));
                            vl84.setFill(Color.web("#d1e76f"));
                            ra73.add(vl84);
                            hasAward=false;
                            if (ra73.size()==4){
                                r73.setVisible(true);
                                r73.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r73);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra74.add(vl84);
                            hasAward=false;
                            if (ra74.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r74);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    if (x1 == sc65.getCenterX() && y1 == sc65.getCenterY()) {
                        if (vl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc65.setVisible(true);
                            vl75.setVisible(true);
                            sc65.setFill(Color.web("#307986"));
                            vl75.setFill(Color.web("#d1e76f"));
                            ra64.add(vl75);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra65.add(vl75);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc74.getCenterX() && y1 == sc74.getCenterY()) {
                        if (hl74.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc74.setVisible(true);
                            hl74.setVisible(true);
                            sc74.setFill(Color.web("#307986"));
                            hl74.setFill(Color.web("#d1e76f"));
                            ra64.add(hl74);
                            hasAward=false;
                            if (ra64.size()==4){
                                r64.setVisible(true);
                                r64.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r64);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra74.add(hl74);
                            hasAward=false;
                            if (ra74.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r74);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (hl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc76.setVisible(true);
                            hl75.setVisible(true);
                            sc76.setFill(Color.web("#307986"));
                            hl75.setFill(Color.web("#d1e76f"));
                            ra65.add(hl75);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra75.add(hl75);
                            hasAward=false;
                            if (ra75.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r75);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc85.getCenterX() && y1 == sc85.getCenterY()) {
                        if (vl85.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc85.setVisible(true);
                            vl85.setVisible(true);
                            sc85.setFill(Color.web("#307986"));
                            vl85.setFill(Color.web("#d1e76f"));
                            ra74.add(vl85);
                            hasAward=false;
                            if (ra74.size()==4){
                                r74.setVisible(true);
                                r74.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r74);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra75.add(vl85);
                            hasAward=false;
                            if (ra75.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r75);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    if (x1 == sc66.getCenterX() && y1 == sc66.getCenterY()) {
                        if (vl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc66.setVisible(true);
                            vl76.setVisible(true);
                            sc66.setFill(Color.web("#307986"));
                            vl76.setFill(Color.web("#d1e76f"));
                            ra65.add(vl76);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra66.add(vl76);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc75.getCenterX() && y1 == sc75.getCenterY()) {
                        if (hl75.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc75.setVisible(true);
                            hl75.setVisible(true);
                            sc75.setFill(Color.web("#307986"));
                            hl75.setFill(Color.web("#d1e76f"));
                            ra65.add(hl75);
                            hasAward=false;
                            if (ra65.size()==4){
                                r65.setVisible(true);
                                r65.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r65);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra75.add(hl75);
                            hasAward=false;
                            if (ra75.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r75);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (hl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc77.setVisible(true);
                            hl76.setVisible(true);
                            sc77.setFill(Color.web("#307986"));
                            hl76.setFill(Color.web("#d1e76f"));
                            ra66.add(hl76);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra76.add(hl76);
                            hasAward=false;
                            if (ra76.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r76);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc86.getCenterX() && y1 == sc86.getCenterY()) {
                        if (vl86.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc86.setVisible(true);
                            vl86.setVisible(true);
                            sc86.setFill(Color.web("#307986"));
                            vl86.setFill(Color.web("#d1e76f"));
                            ra75.add(vl86);
                            hasAward=false;
                            if (ra75.size()==4){
                                r75.setVisible(true);
                                r75.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r75);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra76.add(vl86);
                            hasAward=false;
                            if (ra76.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r76);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    if (x1 == sc67.getCenterX() && y1 == sc67.getCenterY()) {
                        if (vl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc67.setVisible(true);
                            vl77.setVisible(true);
                            sc67.setFill(Color.web("#307986"));
                            vl77.setFill(Color.web("#d1e76f"));
                            ra66.add(vl77);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra67.add(vl77);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc76.getCenterX() && y1 == sc76.getCenterY()) {
                        if (hl76.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc76.setVisible(true);
                            hl76.setVisible(true);
                            sc76.setFill(Color.web("#307986"));
                            hl76.setFill(Color.web("#d1e76f"));
                            ra66.add(hl76);
                            hasAward=false;
                            if (ra66.size()==4){
                                r66.setVisible(true);
                                r66.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r66);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra76.add(hl76);
                            hasAward=false;
                            if (ra76.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r76);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc78.getCenterX() && y1 == sc78.getCenterY()) {
                        if (hl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc78.setVisible(true);
                            hl77.setVisible(true);
                            sc78.setFill(Color.web("#307986"));
                            hl77.setFill(Color.web("#d1e76f"));
                            ra67.add(hl77);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra77.add(hl77);
                            hasAward=false;
                            if (ra77.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r77);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc87.getCenterX() && y1 == sc87.getCenterY()) {
                        if (vl87.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc87.setVisible(true);
                            vl87.setVisible(true);
                            sc87.setFill(Color.web("#307986"));
                            vl87.setFill(Color.web("#d1e76f"));
                            ra76.add(vl87);
                            hasAward=false;
                            if (ra76.size()==4){
                                r76.setVisible(true);
                                r76.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r76);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra77.add(vl87);
                            hasAward=false;
                            if (ra77.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r77);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                } else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    if (x1 == sc68.getCenterX() && y1 == sc68.getCenterY()) {
                        if (vl78.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc68.setVisible(true);
                            vl78.setVisible(true);
                            sc68.setFill(Color.web("#307986"));
                            vl78.setFill(Color.web("#d1e76f"));
                            ra67.add(vl78);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc77.getCenterX() && y1 == sc77.getCenterY()) {
                        if (hl77.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc77.setVisible(true);
                            hl77.setVisible(true);
                            sc77.setFill(Color.web("#307986"));
                            hl77.setFill(Color.web("#d1e76f"));
                            ra67.add(hl77);
                            hasAward=false;
                            if (ra67.size()==4){
                                r67.setVisible(true);
                                r67.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r67);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                            ra77.add(hl77);
                            hasAward=false;
                            if (ra77.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r77);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    } else if (x1 == sc88.getCenterX() && y1 == sc88.getCenterY()) {
                        if (vl88.isVisible())
                            alertMessage.setText("Oops! This line has already been chosen!");
                        else {
                            sc88.setVisible(true);
                            vl88.setVisible(true);
                            sc88.setFill(Color.web("#307986"));
                            vl88.setFill(Color.web("#d1e76f"));
                            ra77.add(vl88);
                            hasAward=false;
                            if (ra77.size()==4){
                                r77.setVisible(true);
                                r77.setFill(Color.web("#49f4cf"));
                                allRectangles.add(r77);
                                secondPlayerScore++;
                                playMusic();
                                hasAward=true;
                            }
                        }
                    }
                }
                isSecondCircle = true;
                if(hasAward){
                    isFirstPlayerTurn=false;
                }


            }
            showScore();
        }*/}

        public void showResult() {

        }

        public void showScore()
        {
           // p1Score.setText(firstPlayerScore);
            //p2Score.setText(secondPlayerScore);
        }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene=new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}

