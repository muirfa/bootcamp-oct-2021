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
public class FileReaderExampleTest {
    
    public FileReaderExample example =  new FileReaderExample();

    @Test
    public void testReadSentencesFromFile() {
//        file path
        String filePath = "c:\\bootcampg2\\java\\filereader.txt";
//        sentences
        String[] arraySentences = {"I", "want", "to", "be", "great", "engineer"};
        List<String> sentences = Arrays.asList(arraySentences);
        FileWriterExample fileWriterExample =  new FileWriterExample();
        fileWriterExample.writeSentencesToFile(filePath, sentences);
        
//        read
        List<String> result = example.readSentencesFromFile(filePath);
        assertEquals(sentences, result);
    }
    
}
