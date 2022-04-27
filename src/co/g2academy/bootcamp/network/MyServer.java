/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Asus
 */
public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(6666);
            System.out.println("server is running, ready to accept message");
            while (true){
            Socket socket = server.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            
            String message = dis.readUTF();
            System.out.println("Receiving message from client: " + message);
            if(message.equals("stop")){
            break;
            }
            }
            server.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
