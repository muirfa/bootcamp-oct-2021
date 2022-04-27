/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class SearchItemInArrayListTest {
    
    private SearchItemInArrayList search = new SearchItemInArrayList();

    @Test
    public void testSearch_found() {
        int result = search.search(initiateItems(), "Kumar");
        assertEquals(1, result);
    }
    
    @Test
    public void testSearch_not_found() {
        int result = search.search(initiateItems(), "Irfan");
        assertEquals(-1, result);
    }
    
    public List<String> initiateItems(){
        List<String> items = new ArrayList<>();
        items.add("Vijay");
        items.add("Kumar");
        items.add("Ravi");
        return items;
    }
    
}
