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
public class ReverseWordInSetenceTest {
    
    private ReverseWordInSetence reverse = new ReverseWordInSetence();

    @Test
    public void testReverse() {
        String result = reverse.reverse("I am a programmer");
        assertEquals("I ma a remmargorp", result);
    }
    
}
