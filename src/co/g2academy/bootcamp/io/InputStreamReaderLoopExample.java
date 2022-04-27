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
public class InputStreamReaderLoopExample {
    public static void main(String[] args) {
        try{
            InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String name = "";
            while (!name.equals("stop")){
                System.out.println("Please Input data : ");
                name = reader.readLine();
                System.out.println("Data you input is : " + name);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
