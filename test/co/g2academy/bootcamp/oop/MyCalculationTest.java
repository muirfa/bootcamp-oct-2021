/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.oop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class MyCalculationTest {
    
    private MyCalculation myCalculation = new MyCalculation();

    @Test
    public void testAddition() {
        int result =  myCalculation.addition(1, 2);
        assertEquals(3, result);
    }
    
    @Test
    public void testSubstraction() {
        int result =  myCalculation.substraction(3, 1);
        assertEquals(2, result);
    }
    
    @Test
    public void testMultiplication() {
        int result =  myCalculation.multiplication(3, 3);
        assertEquals(9, result);
    }
}
