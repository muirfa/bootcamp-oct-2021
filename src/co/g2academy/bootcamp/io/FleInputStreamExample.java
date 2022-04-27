/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class FleInputStreamExample {

    public String readSentenceFromFile(String filePath) {
        try {
            FileInputStream fin = new FileInputStream(filePath);
            String sentence = "";
            int i;
            while ((i = fin.read()) != -1) {
                char c = (char) i;
                sentence += c;
            }
            return sentence;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
