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
public class FibonacciSeriesTest {
    
    public FibonacciSeries fibonacciSeries = new FibonacciSeries();
    
    @Test
    public void testPrintFibonacciSeries_7() {
        String result = fibonacciSeries.printFibonacciSeries(7);
        assertEquals("1 1 2 3 5 8 13", result);
        
    }
    
    @Test
    public void testPrintFibonacciSeries_5() {
        String result = fibonacciSeries.printFibonacciSeries(5);
        assertEquals("1 1 2 3 5", result);
        
    }
    
    @Test
    public void testPrintFibonacciSeries_1() {
        String result = fibonacciSeries.printFibonacciSeries(1);
        assertEquals("1", result);
        
    }
    @Test
    public void testPrintFibonacciSeries_2() {
        String result = fibonacciSeries.printFibonacciSeries(2);
        assertEquals("1 1", result);
        
    }
    
    
}
