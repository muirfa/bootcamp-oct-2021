/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BufferedReaderExampleTest {
    
    private BufferedReaderExample example = new BufferedReaderExample();

    @Test
    public void testReadSentencesFromFile() {
        String filePath = "C:\\bootcampg2\\java\\bufferedreader.txt";
        String[] arraySentences = {"I", "Want", "to", "be", "a", "great", "engineer"};
        List<String> sentences = Arrays.asList(arraySentences);
        BufferedWriterExample bwe = new BufferedWriterExample();
        bwe.writeSentenceToFile(filePath, sentences);
        
        List<String> result = example.readSentencesFromFile(filePath);
        assertEquals(sentences, result);
        
    }
    
}
