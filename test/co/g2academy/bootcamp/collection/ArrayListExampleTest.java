/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ArrayListExampleTest {
    
    private ArrayListExample example =  new ArrayListExample();

    @Test
    public void testGenerateListWithThreeItems() {
        List<String> result =  example.generateListWithThreeItems();
        assertEquals(3, result.size());
        
//        assertEquals("hujan", result.get(0));
//        assertEquals("Senja", result.get(1));
        assertEquals("cerita", result.get(2));
    }
    
}
