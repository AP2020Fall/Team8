package sample.model;

import sample.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server  {
    private static ArrayList<ClientHandler> clients=new ArrayList<>();
   // private static ExecutorService pool= Executors.newFixedThreadPool(4);
    public static void main(String[] args) throws IOException
    {

        // server is listening on port 5056
        while (true) {
            System.out.println("waiting for client");
            ServerSocket listener = new ServerSocket(9090);
            Socket client = listener.accept();
            System.out.println("connected");
            ClientHandler clientThread = new ClientHandler(client);
            clients.add(clientThread);
          //  pool.execute(clientThread);
        }

    }
}
