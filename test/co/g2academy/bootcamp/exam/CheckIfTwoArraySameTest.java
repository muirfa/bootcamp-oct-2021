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
public class CheckIfTwoArraySameTest {
    
    private CheckIfTwoArraySame checkifTwoArraySame = new CheckIfTwoArraySame();

    @Test
    public void testAreArraySame() {
        int[] array1 = {1, 2, 3, 2, 3};
        int[] array2 = {1, 2, 3, 2, 3};
        boolean result = checkifTwoArraySame.areArraySame(array1, array2);
        assertTrue(result);
        
        
    }
    
    @Test
    public void testAreArrayNotSame() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1, 2, 3};
        boolean result = checkifTwoArraySame.areArraySame(array1, array2);
        assertFalse(result);
        
    }
    
    
}
