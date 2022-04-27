/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class VowelsCheckTest {
    
    public VowelsCheck vowelsCheck = new VowelsCheck();
    @Test
    public void testVowelsCheck() {
        String text = "hujan";
        boolean result = vowelsCheck.checkVowel(text);
        assertTrue(result);
    }
    
    @Test
    public void testNotVowelsCheck() {
        String text = "mcd";
        boolean result =  vowelsCheck.checkVowel(text);
        assertFalse(result);
    }
    
    
    
}
