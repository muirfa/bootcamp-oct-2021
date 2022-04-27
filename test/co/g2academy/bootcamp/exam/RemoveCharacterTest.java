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
public class RemoveCharacterTest {
    
    public RemoveCharacter removeCharacter = new RemoveCharacter();

    @Test
    public void testRemoveChar() {
        String text = "i am programmer";
        char c = 'a';
        String expect = "i m progrmmer";
        String result = removeCharacter.removeChar(c, text);
        assertEquals(expect, result);
    }
    
    @Test
    public void testRemoveChar1() {
        String text = "senja hujan dan kenangan";
        char c = 'n';
        String expect = "seja huja da keaga";
        String result = removeCharacter.removeChar(c, text);
        assertEquals(expect, result);
    }
}
