/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BufferedWriterExample {
    public void writeSentenceToFile(String filePath, List<String> sentences){
        try{
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String sentence : sentences){
                bufferedWriter.write(sentence + "\n");
                bufferedWriter.flush();
            }
            writer.close();
            bufferedWriter.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
