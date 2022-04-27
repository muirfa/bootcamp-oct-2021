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
public class VarargsTest {
    
    private Varargs varargs =  new Varargs();

    @Test
    public void testMaximum() {
        int result =  varargs.maximum(10, 3, 5, 7);
        assertEquals(10, result);
    }
    
}
