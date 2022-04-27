/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.interviewtest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class VowelCheckTest {
    
    private VowelCheck example = new VowelCheck();

    @Test
    public void testVowels() {
        String text = "hujan";
        boolean result =  example.vowels(text);
        assertTrue(result);
    }
    
    @Test
    public void testNotVowels() {
        String text = "hjk";
        boolean result =  example.vowels(text);
        assertFalse(result);
    }
    
}
