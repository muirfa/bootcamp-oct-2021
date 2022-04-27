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
public class SwapTwoNumberTest {
    
    private SwapTwoNumber example = new SwapTwoNumber();

    @Test
    public void testSwap() {
        int a = 4;
        int b = 8;
        int result = example.swap(b, a);
        assertTrue(true);
    }
    
}
