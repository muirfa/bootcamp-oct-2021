/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.url;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author Asus
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress = InetAddress.getByName("google.com");
            System.out.println("HostName: " + inetAddress.getHostName());
            System.out.println("IP address: " +inetAddress.getHostAddress());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
