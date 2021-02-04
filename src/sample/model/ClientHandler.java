package sample.model;

import sample.controller.graphic.reversi.ScoreBoardMenu;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ClientHandler implements Runnable
{
   private Socket client;
   private BufferedReader in;
   private PrintWriter out;


    // Constructor
    public ClientHandler(Socket clientSocket) throws IOException
    {
      client=clientSocket;
      in=new BufferedReader(new InputStreamReader(client.getInputStream()));
      out=new PrintWriter(client.getOutputStream(),true);
    }

    @Override
    public void run()
    {
        try {


            while (true) {
                String req = in.readLine();
                if (req.contains("name"))
                    out.println("name");
                else
                    out.println("type felan");
            }
        }
        catch ( IOException e){
            System.err.println(e.getStackTrace());
        }
        finally {
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}