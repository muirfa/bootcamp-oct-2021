/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.string;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class PalindromTest {
    
    private Palindrom palindrom =  new Palindrom();

    @Test
    public void testIsPalindrom() {
        boolean result = palindrom.isPalindrom("abuba");
        assertTrue(result);
    }
    
    @Test
    public void testIsNotPalindrom() {
        boolean result = palindrom.isPalindrom("abc");
        assertFalse(result);
    }
}
