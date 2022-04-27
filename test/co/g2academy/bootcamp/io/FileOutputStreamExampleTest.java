/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class FileOutputStreamExampleTest {
    
    public FileOutputStreamExample example = new FileOutputStreamExample();

    @Test
    public void testWriteSentenceToFile() {
        String filePath = "c:\\bootcampg2\\java\\out.txt";
        String sentence = "hello this is my first file output";
        
        example.writeSentenceToFile(filePath, sentence);
        File file = new File(filePath);
        assertTrue(file.exists());
    }
    
}
