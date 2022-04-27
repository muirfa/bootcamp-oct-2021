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
public class CheckOddNumberTest {
    
    private CheckOddNumber checkOddNumber = new CheckOddNumber();

    @Test
    public void testOddNumberCheck_eventNumber() {
        int[] n = {2, 4, 6, 8, 100};
        boolean result = checkOddNumber.oddNumberCheck(n);
        assertFalse(result);
    }
    
    @Test
    public void testOddNumberCheck_oddNumber() {
        int[] n = {1, 3, 5, 7, 9};
        boolean result = checkOddNumber.oddNumberCheck(n);
        assertTrue(result);
    }
    
    @Test
    public void testOddNumberCheck_one_oddNumber() {
        int[] n = {2, 3, 5, 8, 100};
        boolean result = checkOddNumber.oddNumberCheck(n);
        assertTrue(result);
    }
    
}
