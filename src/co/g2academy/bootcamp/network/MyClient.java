/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Asus
 */
public class MyClient {
    public static void main(String[] args) {
        try{
            Socket client = new Socket("localhost", 6666);
            System.out.println("Client is ready, about to send message");
            DataOutputStream dos =  new DataOutputStream(client.getOutputStream());
            String message =  "hello";
            dos.writeUTF(message);
            System.out.println("client sending message to server: " + message);
            dos.flush();
            dos.close();
            client.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
