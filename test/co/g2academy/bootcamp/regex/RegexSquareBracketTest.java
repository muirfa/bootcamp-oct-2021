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
public class RegexSquareBracketTest {
    
    private RegexSquareBracket regexSquareBracket = new RegexSquareBracket();

    @Test
    public void testIsAMN_a() {
        String text = "a";
        boolean result = regexSquareBracket.isAMN(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMN_m() {
        String text = "m";
        boolean result = regexSquareBracket.isAMN(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMN_n() {
        String text = "n";
        boolean result = regexSquareBracket.isAMN(text);
        assertTrue(result);
    }
}
