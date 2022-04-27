/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Asus
 */
public class PingPongClient {
    public static void main(String[] args) {
        try{
            Socket client = new Socket("localhost", 8888);
            System.out.println("Client is ready");
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            String message = "ping";
            System.out.println("Sending message " + message + " to server");
            dos.writeUTF("ping");
            DataInputStream dis = new DataInputStream(client.getInputStream());
//            blocking to wait from server reply
            String reply = dis.readUTF();
            System.out.println("Getting reply " + reply + " from server");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
