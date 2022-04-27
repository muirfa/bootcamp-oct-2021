/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BubbleSortTest {
    
    private BubbleSort bubbleSort =  new BubbleSort();

    @Test
    public void testSort() {
        Integer[] arrayItems = {10, 1, 3, 7, 100, 5};
        List<Integer> items = Arrays.asList(arrayItems);
        
        List<Integer> result = bubbleSort.sort(items);
        
        Integer[] arrayExpectedItems = {1, 3, 5, 7, 10, 100};
        List<Integer>expectedItems = Arrays.asList(arrayExpectedItems);
        
        assertEquals(expectedItems, result);
    }
    
}
