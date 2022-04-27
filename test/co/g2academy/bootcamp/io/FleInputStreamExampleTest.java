/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class FleInputStreamExampleTest {

    private FleInputStreamExample example = new FleInputStreamExample();

    @Test
    public void testReadSentenceFromFile() {
//        write the first
//        write the sentence
        String filePath = "c:\\bootcampg2\\java\\fileinputstream.txt";
        String sentence = "hi this is sentence to write to file";

        FileOutputStreamExample fos = new FileOutputStreamExample();
        fos.writeSentenceToFile(filePath, sentence);

//        then read it and compare the sentence the sentence to check if
//        reading file is correct
        String result = example.readSentenceFromFile(filePath);
        assertEquals(sentence, result);
    }

}
