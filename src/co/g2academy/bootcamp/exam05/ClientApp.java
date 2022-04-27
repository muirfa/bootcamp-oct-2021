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
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;




/**
 *
 * @author Asus
 */
public class ClientApp {
    
    public static void main(String[] args) {
            File file = new File("C:\\bootcampg2\\java\\fileproces.txt");
        try{
            Socket client = new Socket("localhost", 6666);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            System.out.println("Client is ready");
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            String message = "Ping";
            System.out.println("Sending message " + message + " to server");
            dos.writeUTF("ping");
            
            DataInputStream dis = new DataInputStream(client.getInputStream());
            String reply = dis.readUTF();
            
                System.out.println(reply);
            
            
            String word[] = reply.split(",");
                String text =  word[0];
                String text1 =  word[1];
                String text2 =  word[2];
                String text3 =  word[3];
                
                bw.write("Nama: " + text);
                bw.newLine();
                bw.write("Nilai Fisika: " + text1);
                bw.newLine();
                bw.write("Nilai Kimia: " + text2);
                bw.newLine();
                bw.write("Nilai Biologi: " + text3);
                bw.close();
                
                String data;
                while ((data = br.readLine()) != null){
                    System.out.println(data);
                } br.close();
                
                int n1 = Integer.parseInt(text1);
                int n2 = Integer.parseInt(text2);
                int n3 = Integer.parseInt(text3);
                
                int rata = (n1 + n2 + n3)/3;
                
                File filer = new File("C:\\bootcampg2\\java\\filerata.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(filer));
                writer.write("Nama, Nilai Rata");
                writer.newLine();
                writer.write(text + "," +rata);
                writer.close();
                
                
        }catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
}
