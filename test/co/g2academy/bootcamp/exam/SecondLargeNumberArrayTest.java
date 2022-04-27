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
public class SecondLargeNumberArrayTest {
    
    public SecondLargeNumberArray secondLargeNumberArray = new SecondLargeNumberArray();

    @Test
    public void testFindSecondLarge() {
        int [] array = {12, 35, 10, 34, 8};
        int result = secondLargeNumberArray.findSecondLarge(array);
        assertEquals(34, result);
    }
    
    @Test
    public void testFindSecondLarge_1() {
        int [] array = {12, 35, 17, 44, 8};
        int result = secondLargeNumberArray.findSecondLarge(array);
        assertEquals(35, result);
    }
}
