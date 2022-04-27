/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BalanceClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 6666);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukan no hp: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Masukan jumlah topup: ");
            String amount = scanner.nextLine();
            String message = "topup" + phoneNumber +  " " + amount;
            DataOutputStream dos =  new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(message);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
