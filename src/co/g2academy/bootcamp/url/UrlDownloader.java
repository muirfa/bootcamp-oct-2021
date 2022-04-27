/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Asus
 */
public class UrlDownloader {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.detik.com/");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
