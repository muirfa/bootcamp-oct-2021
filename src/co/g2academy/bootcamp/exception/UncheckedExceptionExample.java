/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

/**
 *
 * @author Asus
 */
public class UncheckedExceptionExample {
    public void arithmeticExceptionHandling(){
        int x =5/0;
    }
    
    public void nullPointerExceptionHandling(){
        String x = null;
        x.length();
    }
    
    public void numberFormatExceptionHandling(){
        String x = "abc";
        int z = Integer.parseInt(x);
    }
    
    public void arrayOutOfBoundExceptionHandling(){
        int[] x = new int [5];
        x[100] = 10;
    }
}
