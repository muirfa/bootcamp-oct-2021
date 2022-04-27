/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controlflow;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class SwitchDemoRefactorTest {
    
    SwitchDemoRefactor switchDemoRefactor = new SwitchDemoRefactor();

    @Test
    public void testConvertToMonthString_test_january() {
        String monthString =  switchDemoRefactor.convertToMonthString(1);
        assertEquals("January", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_february() {
        String monthString =  switchDemoRefactor.convertToMonthString(2);
        assertEquals("February", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_march() {
        String monthString =  switchDemoRefactor.convertToMonthString(3);
        assertEquals("March", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_april() {
        String monthString =  switchDemoRefactor.convertToMonthString(4);
        assertEquals("April", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_may() {
        String monthString =  switchDemoRefactor.convertToMonthString(5);
        assertEquals("May", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_june() {
        String monthString =  switchDemoRefactor.convertToMonthString(6);
        assertEquals("June", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_july() {
        String monthString =  switchDemoRefactor.convertToMonthString(7);
        assertEquals("July", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_august() {
        String monthString =  switchDemoRefactor.convertToMonthString(8);
        assertEquals("August", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_september() {
        String monthString =  switchDemoRefactor.convertToMonthString(9);
        assertEquals("September", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_october() {
        String monthString =  switchDemoRefactor.convertToMonthString(10);
        assertEquals("October", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_november() {
        String monthString =  switchDemoRefactor.convertToMonthString(11);
        assertEquals("November", monthString);
    }
    
    @Test
    public void testConvertToMonthString_test_december() {
        String monthString =  switchDemoRefactor.convertToMonthString(12);
        assertEquals("December", monthString);
    }
}
