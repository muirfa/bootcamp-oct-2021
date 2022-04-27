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
public class BinarySearchTest {

    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void searchTest_found() {
        int result =  binarySearch.search(generateItems(), 50);
        assertEquals(3, result);
    }
    
    @Test
    public void searchTest_not_found() {
        int result =  binarySearch.search(generateItems(), 1000);
        assertEquals(-1, result);
    }

    public List<Integer> generateItems() {
        Integer[] arrayItems = {1, 2, 10, 50, 70, 100, 110};
        List<Integer> items = Arrays.asList(arrayItems);
        return items;
    }

}
