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
public class CountCharacterTest {

    public CountCharacter countCharacter = new CountCharacter();

    @Test
    public void testCountChar() {
        String text = "i am a programmer";
        char c = 'a';
        int expect = 3;
        int result = countCharacter.countChar(c, text);
        assertEquals(expect, result);
    }

    @Test
    public void testCountChar1() {
        String text = "senja hujan dan cerita";
        char c = 'n';
        int expect = 3;
        int result = countCharacter.countChar(c, text);
        assertEquals(expect, result);
    }

}
