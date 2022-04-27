/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.method;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class MethodDemoTest {

    @Test
    public void testMinimumFunction_return_first_parameter() {
        int result = MethodDemo.minimumFunction(1,2);
        assertEquals(1, result);
    }
    
    @Test
    public void testMinimumFunction_return_second_parameter() {
        int result = MethodDemo.minimumFunction(10,5);
        assertEquals(5, result);
    }
    
    @Test
    public void testMinimumFunction_double_return_first_parameter() {
        double result = MethodDemo.minimumFunction(1d,2d);
        assertEquals(1d, result, 0);
    }
    
    @Test
    public void testMinimumFunction_double_return_second_parameter() {
        double result = MethodDemo.minimumFunction(10d,5d);
        assertEquals(5d, result, 0);
    }
}
