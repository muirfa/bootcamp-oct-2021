/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Asus
 */
public class SocketServerApp {

    public static void main(String[] args) {
        String configFileName = args[0];
        String fileTxt = args[1];

        System.out.println(configFileName + " " + fileTxt);
        File configFile = new File(configFileName);
        if (configFile.exists()) {
            System.out.println(configFileName + " is exist");
        }
        File file = new File(fileTxt);
        
        if (file.exists()) {
            System.out.println(fileTxt + " is Exist");
        }
        
        try {
            ServerSocket server = new ServerSocket(6666);
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("server is ready");
            while (true) {
                Socket socket = server.accept();
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                String message = dis.readUTF();
                System.out.println("Get " + message + " from client");
                if (message.equals("stop")) {
                    System.out.println("Stoping server");
                    break;
                }
                
                String reply;
                reply = br.readLine();
                
                
                System.out.println(reply);
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF(reply);
                dis.close();
                dos.close();
            }
            server.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
