/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FileWriterExample {
    public void writeSentencesToFile(String filePath, List<String> sentences){
        try{
            FileWriter writer = new FileWriter(filePath);
            for(String sentence : sentences){
                writer.write(sentence + "\n");
            }
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
