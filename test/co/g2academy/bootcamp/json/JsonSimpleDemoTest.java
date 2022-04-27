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
public class JsonSimpleDemoTest {
    
    private JsonSimpleDemo jsonSimple =  new JsonSimpleDemo();

    @Test
    public void testGenerateJson() {
        String jsonText =  jsonSimple.generateJson("foo", 100, 1000.21d,true);
        String expecteed = "{\"balance\":1000.21,\"is_vip\":true,\"num\":100,\"name\":\"foo\"}";
    }
    
}

/**
*{"balance":1000.21,"is_vip":true,"num":100,"name":"foo"}
*/
