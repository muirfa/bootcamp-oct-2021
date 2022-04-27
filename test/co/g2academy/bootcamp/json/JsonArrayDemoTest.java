/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.json;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class JsonArrayDemoTest {
    
    private JsonArrayDemo jsonArray =  new JsonArrayDemo();

    @Test
    public void testSomeMethod() {
        Integer[] actual = jsonArray.parseJsonArray("[1, 2, 3, 4, 5]");
        Integer[] expected = {1, 2, 3, 4, 5};
        
        assertArrayEquals(expected, actual);
    }
}
