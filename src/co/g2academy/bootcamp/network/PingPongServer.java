/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Asus
 */
public class PingPongServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8888);
            System.out.println("Pingpong server is ready");
            while(true){
                Socket socket = server.accept();
                DataInputStream dis =  new DataInputStream(socket.getInputStream());
                String message = dis.readUTF();
                System.out.println("Get " + message + " from client");
                if(message.equals("stop")){
                    System.out.println("Stoping server");
                    break;
                }
                String reply = "Pong";
                System.out.println("Replying pong to client");
                DataOutputStream dos =  new DataOutputStream(socket.getOutputStream());
                dos.writeUTF(reply);
                dis.close();
                dos.close();
            }
            server.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
