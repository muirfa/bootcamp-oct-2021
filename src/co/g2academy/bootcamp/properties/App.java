package co.g2academy.bootcamp.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class App {
    public void writeProperties(String server, Integer port){
        Properties prop =  new Properties();
        OutputStream output =  null;
        try{
            output = new FileOutputStream("config.properties");
            prop.setProperty("server", server);
            prop.setProperty("port", port.toString());
            prop.store(output, null);
        }catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if (output != null) {
                try{
                    output.close();
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public String readProperties(String fileName){
        Properties prop = new Properties();
        InputStream input =  null;
        try{
            input =  new FileInputStream(fileName);
            prop.load(input);
            String server = prop.getProperty("server");
            Integer port = Integer.valueOf(prop.getProperty("port"));
            return server + ":" + port; 
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try{
                    input.close();
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        } return null;
    }
}
