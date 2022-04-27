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
public class OverridingTest {

    @Test
    public void testAnimal_move() {
        Animal animal = new Animal();
        String result = animal.move();
        assertEquals("Animals can move", result);
    }
    
    @Test
    public void testDog_move() {
        Dog dog = new Dog();
        String result = dog.move();
        assertEquals("Dogs can Walk and Run", result);
    }
        
    
    
}
