/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.url;

import java.io.IOException;
import java.net.URL;

/**
 *
 * @author Asus
 */
public class UrlDemo {
    public static void main(String[] args) {
        try{
            URL url =  new URL("https://www.blibli.com:443/index.html");
            System.out.println("Host name: " + url.getHost());
            System.out.println("Protocol: " + url.getHost());
            System.out.println("port number: " + url.getPort());
            System.out.println("File name: " + url.getFile());
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
