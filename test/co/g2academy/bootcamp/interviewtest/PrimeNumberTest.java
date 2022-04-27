/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.interviewtest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class PrimeNumberTest {
    
    private PrimeNumber prime = new PrimeNumber();

    @Test
    public void testPrimeNumber() {
        boolean result =  prime.primeNumber(71);
        assertTrue(result);
    }
    
    @Test
    public void testNotPrimeNumber() {
        boolean result =  prime.primeNumber(21);
        assertFalse(result);
    }
}
