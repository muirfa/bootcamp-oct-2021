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
public class InstanceOfTest {

    @Test
    public void testMammal_instanceof_animal() {
        Mammal mammal = new Mammal();
        boolean result = mammal instanceof Animal;
        assertTrue(result);
    }
    
    @Test
    public void testDog_instanceof_mammal() {
        Dog dog = new Dog();
        boolean result = dog instanceof Mammal;
        assertTrue(result);
    }
    
    @Test
    public void testDog_instanceof_animal() {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        assertTrue(result);
    }
    
    
}
