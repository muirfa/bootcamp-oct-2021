/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BufferedInputStreamExample {
    public List<String> readSentenceFromFile(String filePath){
        try{
            FileInputStream fin =  new FileInputStream(filePath);
            BufferedInputStream bin = new BufferedInputStream(fin);
            byte[] sentencesBytes = bin.readAllBytes();
            String sentencesText = new String(sentencesBytes);
            String[] sentences =  sentencesText.split("\n");
            return Arrays.asList(sentences);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
