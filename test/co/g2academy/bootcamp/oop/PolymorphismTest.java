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
public class PolymorphismTest {

    @Test
    public void testDeer_is_an_animal() {
        Deer deer = new Deer();
        boolean result = deer instanceof Animal;
        assertTrue(result);
    }
    
    @Test
    public void testDeer_is_a_vegetarian() {
        Deer deer = new Deer();
        boolean result = deer instanceof Vegetarian;
        assertTrue(result);
    }
    
    @Test
    public void testDeer_is_a_deer() {
        Deer deer = new Deer();
        boolean result = deer instanceof Object;
        assertTrue(result);
    }
    
    @Test
    public void testDeer_is_an_deer() {
        Deer deer = new Deer();
        boolean result = deer instanceof Object;
        assertTrue(result);
    }
    
    
}
