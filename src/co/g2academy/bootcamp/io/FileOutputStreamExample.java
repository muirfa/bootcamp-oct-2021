/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class FileOutputStreamExample {
    public void writeSentenceToFile(String filePath, String sentence){
    try {
        FileOutputStream fout = new FileOutputStream(filePath);
        fout.write(sentence.getBytes());
        fout.close();
    } catch (IOException ex){
        ex.printStackTrace();
    }
    }
}
