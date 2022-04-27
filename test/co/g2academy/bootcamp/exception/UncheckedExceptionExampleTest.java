/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class UncheckedExceptionExampleTest {
    
    private UncheckedExceptionExample example =  new UncheckedExceptionExample();

    @Test
    public void testArithmeticExceptionHandling() {
        try{
            example.arithmeticExceptionHandling();
            assertTrue(false);
        } catch (ArithmeticException ex){
            ex.printStackTrace();
            assertTrue(true);
        }
    }
    
    @Test
    public void testNullPointerExceptionHandling() {
        try{
            example.nullPointerExceptionHandling();
            assertTrue(false);
        } catch (NullPointerException ex){
            ex.printStackTrace();
            assertTrue(true);
        }
    }
    
    @Test
    public void testNumberFormatExceptionHandling() {
        try{
            example.numberFormatExceptionHandling();
            assertTrue(false);
        } catch (NumberFormatException ex){
            ex.printStackTrace();
            assertTrue(true);
        }
    }
    
    @Test
    public void testArrayOutOfBoundExceptipnHandling() {
        try{
            example.arrayOutOfBoundExceptionHandling();
            assertTrue(false);
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            assertTrue(true);
        }
    }
}
