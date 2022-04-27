/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class ConsoleInputAndOutputStream {

    public static void main(String[] args) {
//        send data/message to console using output stram
        System.out.println("please input your name: ");
        try {
//            get a 255 max character
            byte[] textByte = new byte[255];
//            get data / message from keyboard type in console using input stream
            System.in.read(textByte);
            String text = new String(textByte);
            System.out.println("your name is: " + text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
