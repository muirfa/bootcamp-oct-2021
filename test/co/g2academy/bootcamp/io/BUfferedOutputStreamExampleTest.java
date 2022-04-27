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
public class BUfferedOutputStreamExampleTest {
    
    private BufferedOutputStreamExample example = new BufferedOutputStreamExample();

    @Test
    public void testWriteSentenceTofile() {
        String filePath = "c:\\bootcampg2\\java\\filebuffered.txt";
        String[] arraySentence = {"hello", "this", "is", "sentence"};
        List<String> sentence = Arrays.asList(arraySentence);
        
        example.writeSentenceToFile(filePath, sentence);
        File file =  new File(filePath);
        assertTrue(file.exists());
    }
    
}
