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
public class ThrowExceptionTest {
    
    private ThrowException throwException = new ThrowException();

    @Test
    public void testValidate_valid_age_above_18() {
        int age = 18;
        boolean result = throwException.validate(age);
        assertTrue(result);
    }
    
    @Test
    public void testValidate_invalid_age_below_18_and_throw_arithmetic_exception() {
        int age = 17;
        try{
            boolean result = throwException.validate(age);
            assertTrue(result);
        } catch (ArithmeticException ex){
            ex.printStackTrace();
            assertTrue(true);
        }
    }
    
}
