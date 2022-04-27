/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.array;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ArrayResizeTest {
    
    private ArrayResize arrayResize =  new ArrayResize();

    @Test
    public void testResize() {
        int[] original = {1, 2, 3, 4, 5};
        int[] result = arrayResize.resize(original, 10);
        
        assertNotNull (result);
        assertEquals(10, result.length);
        
        int[] expected = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, result);
    }
    
}
