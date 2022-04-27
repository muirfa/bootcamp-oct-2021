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
public class BufferedInputStreamExampleTest {

    private BufferedInputStreamExample example = new BufferedInputStreamExample();

    @Test
    public void testReadSentenceFromFile() {
//        filepath
        String filePath = "c:\\bootcampg2\\java\\bufferinfile.txt";
//        list of sentence
        String[] sentenceArrays = {"hello", "this", "is", "sentence"};
        List<String> sentences = Arrays.asList(sentenceArrays);
//        write it to file
        BufferedOutputStreamExample out = new BufferedOutputStreamExample();
        out.writeSentenceToFile(filePath, sentences);

//        read it and compare the result
        List<String> result = example.readSentenceFromFile(filePath);
        assertEquals(sentences, result);

    }

}
