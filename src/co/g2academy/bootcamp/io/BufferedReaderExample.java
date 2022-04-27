/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BufferedReaderExample {
    public List<String> readSentencesFromFile(String filePath){
        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            List<String>sentences = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null){
                sentences.add(line);
            }
            return sentences;
    }   catch(IOException ex){
                ex.printStackTrace();
            }
        return Collections.emptyList();
    }
}
