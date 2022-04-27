/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BufferedWriterExampleTest {
    
    private BufferedWriterExample example = new BufferedWriterExample();

    @Test
    public void testWriteSentenceToFile() {
//        file path
        String filePath = "C:\\bootcampg2\\java\\bufferedwriter.txt";
        String[] arraySentences = {"I", "want", "to", "be", "great", "engineer"};
        List<String> sentences = Arrays.asList(arraySentences);
        example.writeSentenceToFile(filePath, sentences);
        
        File file = new File(filePath);
        assertTrue(file.exists());
    }
    
}
