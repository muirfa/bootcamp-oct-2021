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
public class BalanceServerMain {
    private BalanceServer balanceServer = new BalanceServer();
    
    public void runServer(){
        try{
            ServerSocket server = new ServerSocket(6666);
            System.out.println("Server is ready to accept topup");
            while(true){
                Socket socket = server.accept();
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                String message = dis.readUTF();
                TopUpBalance topUpBalance = balanceServer.parseMessageFromClient(message);
                balanceServer.topUp(topUpBalance);
                balanceServer.printBalanceAndHistory(topUpBalance.getPhoneNumber());
                dis.close();
                socket.close();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        } 
    }
    public static void main(String[] args) {
        BalanceServerMain server = new BalanceServerMain();
        server.runServer();
        
    }
}
