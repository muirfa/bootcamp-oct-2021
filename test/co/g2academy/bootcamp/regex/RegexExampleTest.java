/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.regex;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class RegexExampleTest {
    
    private RegexExample example =  new RegexExample();

    @Test
    public void testIsTwoCharacterAndEndedWithS() {
        String text = "as";
        boolean result = example.isTwoCharacterAndEndedWithS(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsTwoCharacterAndEndedWithS_false_scenario() {
        String text = "aas";
        boolean result = example.isTwoCharacterAndEndedWithS(text);
        assertFalse(result);
    }
    
    @Test
    public void testValidationEmailAddress() {
        String text = "irfan@gmail.com";
        boolean result = example.isValidEmailAddress(text);
        assertTrue(result);
    }
    
    @Test
    public void testValidationEmailAddress_long_domain() {
        String text = "irfan@informatika.mipa.umb.ac.id";
        boolean result = example.isValidEmailAddress(text);
        assertTrue(result);
    }
    
    @Test
    public void testValidPassword() {
        String text = "Password*121#";
        boolean result = example.isValidPassword(text);
        assertTrue(result);
    }
    
    @Test
    public void testInValidPassword() {
        String text = "passwordgua";
        boolean result = example.isValidPassword(text);
        assertFalse(result);
    }
    
    @Test
    public void testInValidPassword_short_and_no_special_char() {
        String text = "Pass123";
        boolean result = example.isValidPassword(text);
        assertFalse(result);
    }
}
