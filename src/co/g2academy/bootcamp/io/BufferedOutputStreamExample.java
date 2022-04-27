/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BufferedOutputStreamExample {
    public void writeSentenceToFile (String filePath, List<String> sentences) {
        try{
            FileOutputStream fout =  new FileOutputStream(filePath);
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            for (String sentence : sentences){
                sentence = sentence + "\n"; //newline
                bout.write(sentence.getBytes());
                bout.flush();
            }
            bout.close();
            fout.close();
            
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
