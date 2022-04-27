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
public class ContinueDemoTest {
    
    private ContinueDemo continueDemo =  new ContinueDemo();

    @Test
    public void testNumOfPs() {
        String text = "popupepa";
        int result =  continueDemo.numOfPs(text);
        assertEquals(4, result);
    }
    
}
