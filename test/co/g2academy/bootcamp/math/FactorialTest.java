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
public class FactorialTest {
    
    private Factorial factorial = new Factorial();
    
    @Test
    public void testCalculateFactorial_5() {
        int result =  factorial.calculateFactorial(5);
        assertEquals(120, result);
    }
    
    
    @Test
    public void testCalculateFactorial_4() {
        int result =  factorial.calculateFactorial(4);
        assertEquals(24, result);
    }
    
}
