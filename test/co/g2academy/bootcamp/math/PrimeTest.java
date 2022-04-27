/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.math;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class PrimeTest {
    
    private Prime prime =  new Prime();

    @Test
    public void testIsPrimeNumber_17() {
        boolean result =  prime.isPrimeNumber(17);
        assertTrue(result);
    }
    
    @Test
    public void testIsPrimeNumber_23() {
        boolean result =  prime.isPrimeNumber(23);
        assertTrue(result);
    }
    
    @Test
    public void testIsPrimeNumber_21() {
        boolean result =  prime.isPrimeNumber(21);
        assertFalse(result);
    }
    
}
