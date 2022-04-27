/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ThrowsExceptionTest {
    
    private ThrowsException throwsException = new ThrowsException();

    @Test
    public void testThrowIOExceptionMethod(){
        try{
            throwsException.throwIOExceptionMethod(null);
            assertTrue(false);
        } catch(IOException ex){
            assertTrue(true);
        }
    }

    @Test
    public void testThrowsIOExceptionNotWillingToHandleIt() {
        try{
            throwsException.throwIOExceptionMethod(null);
            assertTrue(false);
        } catch(IOException ex){
            assertTrue(true);
        }
    }

    @Test
    public void testTryAndCatchEXception() {
        throwsException.tryAndCatchEXception(null);
        assertTrue(true);
    }
    
}
