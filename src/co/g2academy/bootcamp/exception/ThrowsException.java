/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class ThrowsException {
    /*
    1. try
    2. catch
    3. finally
    4. throw
    5. throws
    */
    public void throwIOExceptionMethod(Integer input) throws IOException{
        if (input == null){
            throw new IOException("invalid null input, can't process");
        }
    }
    public void throwsIOExceptionNotWillingToHandleIt(Integer input) throws IOException {
        throwIOExceptionMethod(input);
    }
    
    public void tryAndCatchEXception(Integer input){
    try{
        throwsIOExceptionNotWillingToHandleIt(input);
    }catch (IOException ex){
        ex.printStackTrace();
    } finally{
        System.out.println("Finally is Executed after handling exception");
    }
    }
}
