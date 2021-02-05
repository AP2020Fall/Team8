package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sample.controller.MenuController;

import java.io.*;
import java.net.Socket;

public class Main extends Application {
    public static MenuController menuController = new MenuController();
   public static Stage allStage=new Stage();
   public static String command= "";
    public static FileWriter myWriter;

    static {
        try {
            myWriter = new FileWriter("command.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PrintWriter pow;

    public Main() throws IOException {
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
           MainWindow.getInstance().start(primaryStage);
        System.out.println("stage");
        //runClient();
       // System.out.println("client run");
      /*  Parent root = FXMLLoader.load(getClass().getResource("/sample/view/firstMenu.fxml"));
       primaryStage.setTitle("ReversiStartMenu");

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();*/

      // playMusic();
     //   menuController.openStartMenu();
        playMusicFirst();
    }

    public void playMusicFirst() {
        File file = new File("src/sample/sounds/viva.mp3");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
  /*  public static void runClient() throws IOException {
        Socket socket=new Socket("localhost",2345);
        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        while (true){
            System.out.println(">");
            String command=keyboard.readLine();
            if (command.equals("quit")) break;
            out.println(command);
            String serverResponse=input.readLine();
            System.out.println("Server says"+ serverResponse);

        }
    }*/

    public static void main(String[] args) throws IOException {
      launch(args);

      /*  Socket socket=new Socket("localhost",9090);
        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
       BufferedReader  keyboard = new BufferedReader(new FileReader("src/sample/commands.txt"));
       // File myObj = new File("filename.txt");

        try {

            //One way of reading the file
            System.out.println("Reading the file using readLine() method:");
            String contentLine = keyboard.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = keyboard.readLine();
            }
            pow = new PrintWriter(socket.getOutputStream(), true);


            while (true) {
                System.out.println(">");
                //String command=keyboard.readLine();
                if (contentLine.equals("quit")) break;
                pow.println(contentLine);
                pow.write(contentLine);
                System.out.println(contentLine);
                String serverResponse = input.readLine();
                System.out.println("Server says" + serverResponse);
            }
        } finally {

        }*/
    }
}
