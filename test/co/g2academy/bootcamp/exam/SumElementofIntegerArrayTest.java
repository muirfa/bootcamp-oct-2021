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
public class SumElementofIntegerArrayTest {
    
    public SumElementofIntegerArray sumElementofIntegerArray = new SumElementofIntegerArray();

    @Test
    public void testSumElementArray() {
        int [] array ={45, 12, 55, 78, 445};
        int result = sumElementofIntegerArray.sumElementArray(array);
        assertEquals(635,result);
    }
    
     @Test
    public void testSumElementArray1() {
        int [] array ={8, 17, 53, 71, 440};
        int result = sumElementofIntegerArray.sumElementArray(array);
        assertEquals(589,result);
    }
    
}
