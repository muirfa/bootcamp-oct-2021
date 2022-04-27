/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.properties;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class AppTest {
    
    private App app = new App();

    @Test
    public void testWriteProperties() {
        app.writeProperties("localhost", 666);
        String fileName = "config.properties";
        
        File file = new File(fileName);
        assertTrue(file.exists());
    }
    
    @Test
    public void testReadProperties() {
        String property = app.readProperties("config.properties");
        assertEquals("localhost:666", property);
    }
    
}
