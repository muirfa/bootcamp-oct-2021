/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FileReaderExample {
    public List<String> readSentencesFromFile(String filePath){
        try{
            FileReader reader = new FileReader(filePath);
            char[] charBuffer = new char[255];
            String fileContent = "";
            while(( reader.read(charBuffer)) != -1){
                fileContent += new String(charBuffer);
            }
            String[] arrayContent = fileContent.trim().split("\n");
            return Arrays.asList(arrayContent);
        } catch(IOException ex){
            ex.printStackTrace();
    }
        return null;
    }
}
