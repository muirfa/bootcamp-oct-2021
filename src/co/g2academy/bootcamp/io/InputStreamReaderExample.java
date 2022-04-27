/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class InputStreamReaderExample {
    public static void main(String[] args) {
        try{
            InputStreamReader streamReader =  new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(streamReader);
            System.out.println("Please input your name : ");
            String name = reader.readLine();
            System.out.println("wellcome " + name + " to my example program");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
