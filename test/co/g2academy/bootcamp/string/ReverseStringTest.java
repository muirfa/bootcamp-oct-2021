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
public class ReverseStringTest {
    
    public ReverseString reverseString = new ReverseString();

    @Test
    public void testReverse() {
        String result = reverseString.reverse("abcdefghi");
        assertEquals("ihgfedcba", result);
    }
    
}
