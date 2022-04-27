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
public class RemoveSpaceTest {
    
    public RemoveSpace removeSpace = new RemoveSpace();

    @Test
    public void testRemove1() {
        String text = "a b c d e";
        String expect = "abcde";
        String result = removeSpace.remove(text);
        assertEquals(expect, result);
    }
    
    @Test
    public void testRemove2() {
        String text = "i am a programmer";
        String expect = "iamaprogrammer";
        String result = removeSpace.remove(text);
        assertEquals(expect, result);
    }
    
    @Test
    public void testRemove3() {
        String text = "setelah hujan reda";
        String expect = "setelahhujanreda";
        String result = removeSpace.remove(text);
        assertEquals(expect, result);
    }
    
    
}
