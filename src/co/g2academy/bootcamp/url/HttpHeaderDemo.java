/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.url;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class HttpHeaderDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.detik.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            Map<String, List<String>> headers = connection.getHeaderFields();
            for (String headerName : headers.keySet()){
                List<String>values = headers.get(headerName);
                System.out.println(headerName + ": " + values);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
            
}
